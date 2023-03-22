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
import java.util.Map;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.TupleValue;

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviations;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSIdentification;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSdesc;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgUML;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraints;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdTables;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceConditions;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.PubStage;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDCs;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceConstructedAttributes;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceTypeRealizations;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.util.NsIdentification;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.util.NsdResourceSetImpl;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service NS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceNSImpl#getRelease <em>Release</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceNSImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceNSImpl#getId <em>Id</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceNSImpl#getRevision <em>Revision</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceNSImpl#getPublicationStage <em>Publication Stage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceNSImpl#getUmlDate <em>Uml Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceNSImpl#getUmlVersion <em>Uml Version</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceNSImpl#getDescID <em>Desc ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceNSImpl#getRefersToDoc <em>Refers To Doc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceNSImpl#getChanges <em>Changes</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceNSImpl#getFunctionalConstraints <em>Functional Constraints</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceNSImpl#getPresenceConditions <em>Presence Conditions</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceNSImpl#getAbbreviations <em>Abbreviations</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceNSImpl#getServiceTypeRealizations <em>Service Type Realizations</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceNSImpl#getServiceConstructedAttributes <em>Service Constructed Attributes</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceNSImpl#getServiceCDCs <em>Service CD Cs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceNSImpl extends CopyrightedImpl implements ServiceNS {
    /**
     * The default value of the '{@link #getRelease() <em>Release</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRelease()
     * @generated
     * @ordered
     */
    protected static final Integer RELEASE_EDEFAULT = Integer.valueOf( 1 );

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
     * The cached value of the '{@link #getServiceTypeRealizations() <em>Service Type Realizations</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getServiceTypeRealizations()
     * @generated
     * @ordered
     */
    protected ServiceTypeRealizations serviceTypeRealizations;

    /**
     * This is true if the Service Type Realizations containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean serviceTypeRealizationsESet;

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
     * This is true if the Service Constructed Attributes containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean serviceConstructedAttributesESet;

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
     * This is true if the Service CD Cs containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean serviceCDCsESet;

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
        boolean oldChangesESet = changesESet;
        changesESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    NsdPackage.SERVICE_NS__CHANGES, oldChanges, newChanges, !oldChangesESet );
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
                msgs = ( ( InternalEObject ) changes ).eInverseRemove( this, NsdPackage.CHANGES__PARENT_SERVICE_NS,
                        Changes.class, msgs );
            if( newChanges != null )
                msgs = ( ( InternalEObject ) newChanges ).eInverseAdd( this, NsdPackage.CHANGES__PARENT_SERVICE_NS,
                        Changes.class, msgs );
            msgs = basicSetChanges( newChanges, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldChangesESet = changesESet;
            changesESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.SERVICE_NS__CHANGES, newChanges,
                        newChanges, !oldChangesESet ) );
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
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    NsdPackage.SERVICE_NS__CHANGES, oldChanges, null, oldChangesESet );
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
            msgs = ( ( InternalEObject ) changes ).eInverseRemove( this, NsdPackage.CHANGES__PARENT_SERVICE_NS,
                    Changes.class, msgs );
            msgs = basicUnsetChanges( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldChangesESet = changesESet;
            changesESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.SERVICE_NS__CHANGES, null, null,
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
                    NsdPackage.SERVICE_NS__FUNCTIONAL_CONSTRAINTS, oldFunctionalConstraints, newFunctionalConstraints,
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
                        NsdPackage.FUNCTIONAL_CONSTRAINTS__PARENT_SERVICE_NS, FunctionalConstraints.class, msgs );
            if( newFunctionalConstraints != null )
                msgs = ( ( InternalEObject ) newFunctionalConstraints ).eInverseAdd( this,
                        NsdPackage.FUNCTIONAL_CONSTRAINTS__PARENT_SERVICE_NS, FunctionalConstraints.class, msgs );
            msgs = basicSetFunctionalConstraints( newFunctionalConstraints, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldFunctionalConstraintsESet = functionalConstraintsESet;
            functionalConstraintsESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.SERVICE_NS__FUNCTIONAL_CONSTRAINTS,
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
                    NsdPackage.SERVICE_NS__FUNCTIONAL_CONSTRAINTS, oldFunctionalConstraints, null,
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
                    NsdPackage.FUNCTIONAL_CONSTRAINTS__PARENT_SERVICE_NS, FunctionalConstraints.class, msgs );
            msgs = basicUnsetFunctionalConstraints( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldFunctionalConstraintsESet = functionalConstraintsESet;
            functionalConstraintsESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.SERVICE_NS__FUNCTIONAL_CONSTRAINTS,
                        null, null, oldFunctionalConstraintsESet ) );
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
                    NsdPackage.SERVICE_NS__PRESENCE_CONDITIONS, oldPresenceConditions, newPresenceConditions,
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
                        NsdPackage.PRESENCE_CONDITIONS__PARENT_SERVICE_NS, PresenceConditions.class, msgs );
            if( newPresenceConditions != null )
                msgs = ( ( InternalEObject ) newPresenceConditions ).eInverseAdd( this,
                        NsdPackage.PRESENCE_CONDITIONS__PARENT_SERVICE_NS, PresenceConditions.class, msgs );
            msgs = basicSetPresenceConditions( newPresenceConditions, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPresenceConditionsESet = presenceConditionsESet;
            presenceConditionsESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.SERVICE_NS__PRESENCE_CONDITIONS,
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
                    NsdPackage.SERVICE_NS__PRESENCE_CONDITIONS, oldPresenceConditions, null,
                    oldPresenceConditionsESet );
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
                    NsdPackage.PRESENCE_CONDITIONS__PARENT_SERVICE_NS, PresenceConditions.class, msgs );
            msgs = basicUnsetPresenceConditions( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPresenceConditionsESet = presenceConditionsESet;
            presenceConditionsESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.SERVICE_NS__PRESENCE_CONDITIONS,
                        null, null, oldPresenceConditionsESet ) );
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
                    NsdPackage.SERVICE_NS__ABBREVIATIONS, oldAbbreviations, newAbbreviations, !oldAbbreviationsESet );
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
                msgs = ( ( InternalEObject ) abbreviations ).eInverseRemove( this,
                        NsdPackage.ABBREVIATIONS__PARENT_SERVICE_NS, Abbreviations.class, msgs );
            if( newAbbreviations != null )
                msgs = ( ( InternalEObject ) newAbbreviations ).eInverseAdd( this,
                        NsdPackage.ABBREVIATIONS__PARENT_SERVICE_NS, Abbreviations.class, msgs );
            msgs = basicSetAbbreviations( newAbbreviations, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAbbreviationsESet = abbreviationsESet;
            abbreviationsESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.SERVICE_NS__ABBREVIATIONS,
                        newAbbreviations, newAbbreviations, !oldAbbreviationsESet ) );
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
                    NsdPackage.SERVICE_NS__ABBREVIATIONS, oldAbbreviations, null, oldAbbreviationsESet );
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
            msgs = ( ( InternalEObject ) abbreviations ).eInverseRemove( this,
                    NsdPackage.ABBREVIATIONS__PARENT_SERVICE_NS, Abbreviations.class, msgs );
            msgs = basicUnsetAbbreviations( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAbbreviationsESet = abbreviationsESet;
            abbreviationsESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.SERVICE_NS__ABBREVIATIONS, null,
                        null, oldAbbreviationsESet ) );
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
        boolean oldServiceTypeRealizationsESet = serviceTypeRealizationsESet;
        serviceTypeRealizationsESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    NsdPackage.SERVICE_NS__SERVICE_TYPE_REALIZATIONS, oldServiceTypeRealizations,
                    newServiceTypeRealizations, !oldServiceTypeRealizationsESet );
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
                        NsdPackage.SERVICE_TYPE_REALIZATIONS__PARENT_SERVICE_NS, ServiceTypeRealizations.class, msgs );
            if( newServiceTypeRealizations != null )
                msgs = ( ( InternalEObject ) newServiceTypeRealizations ).eInverseAdd( this,
                        NsdPackage.SERVICE_TYPE_REALIZATIONS__PARENT_SERVICE_NS, ServiceTypeRealizations.class, msgs );
            msgs = basicSetServiceTypeRealizations( newServiceTypeRealizations, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldServiceTypeRealizationsESet = serviceTypeRealizationsESet;
            serviceTypeRealizationsESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        NsdPackage.SERVICE_NS__SERVICE_TYPE_REALIZATIONS, newServiceTypeRealizations,
                        newServiceTypeRealizations, !oldServiceTypeRealizationsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetServiceTypeRealizations( NotificationChain msgs ) {
        ServiceTypeRealizations oldServiceTypeRealizations = serviceTypeRealizations;
        serviceTypeRealizations = null;
        boolean oldServiceTypeRealizationsESet = serviceTypeRealizationsESet;
        serviceTypeRealizationsESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    NsdPackage.SERVICE_NS__SERVICE_TYPE_REALIZATIONS, oldServiceTypeRealizations, null,
                    oldServiceTypeRealizationsESet );
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
    public void unsetServiceTypeRealizations() {
        if( serviceTypeRealizations != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) serviceTypeRealizations ).eInverseRemove( this,
                    NsdPackage.SERVICE_TYPE_REALIZATIONS__PARENT_SERVICE_NS, ServiceTypeRealizations.class, msgs );
            msgs = basicUnsetServiceTypeRealizations( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldServiceTypeRealizationsESet = serviceTypeRealizationsESet;
            serviceTypeRealizationsESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        NsdPackage.SERVICE_NS__SERVICE_TYPE_REALIZATIONS, null, null,
                        oldServiceTypeRealizationsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetServiceTypeRealizations() {
        return serviceTypeRealizationsESet;
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
        boolean oldServiceConstructedAttributesESet = serviceConstructedAttributesESet;
        serviceConstructedAttributesESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    NsdPackage.SERVICE_NS__SERVICE_CONSTRUCTED_ATTRIBUTES, oldServiceConstructedAttributes,
                    newServiceConstructedAttributes, !oldServiceConstructedAttributesESet );
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
                        NsdPackage.SERVICE_CONSTRUCTED_ATTRIBUTES__PARENT_SERVICE_NS,
                        ServiceConstructedAttributes.class, msgs );
            if( newServiceConstructedAttributes != null )
                msgs = ( ( InternalEObject ) newServiceConstructedAttributes ).eInverseAdd( this,
                        NsdPackage.SERVICE_CONSTRUCTED_ATTRIBUTES__PARENT_SERVICE_NS,
                        ServiceConstructedAttributes.class, msgs );
            msgs = basicSetServiceConstructedAttributes( newServiceConstructedAttributes, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldServiceConstructedAttributesESet = serviceConstructedAttributesESet;
            serviceConstructedAttributesESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        NsdPackage.SERVICE_NS__SERVICE_CONSTRUCTED_ATTRIBUTES, newServiceConstructedAttributes,
                        newServiceConstructedAttributes, !oldServiceConstructedAttributesESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetServiceConstructedAttributes( NotificationChain msgs ) {
        ServiceConstructedAttributes oldServiceConstructedAttributes = serviceConstructedAttributes;
        serviceConstructedAttributes = null;
        boolean oldServiceConstructedAttributesESet = serviceConstructedAttributesESet;
        serviceConstructedAttributesESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    NsdPackage.SERVICE_NS__SERVICE_CONSTRUCTED_ATTRIBUTES, oldServiceConstructedAttributes, null,
                    oldServiceConstructedAttributesESet );
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
    public void unsetServiceConstructedAttributes() {
        if( serviceConstructedAttributes != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) serviceConstructedAttributes ).eInverseRemove( this,
                    NsdPackage.SERVICE_CONSTRUCTED_ATTRIBUTES__PARENT_SERVICE_NS, ServiceConstructedAttributes.class,
                    msgs );
            msgs = basicUnsetServiceConstructedAttributes( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldServiceConstructedAttributesESet = serviceConstructedAttributesESet;
            serviceConstructedAttributesESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        NsdPackage.SERVICE_NS__SERVICE_CONSTRUCTED_ATTRIBUTES, null, null,
                        oldServiceConstructedAttributesESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetServiceConstructedAttributes() {
        return serviceConstructedAttributesESet;
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
        boolean oldServiceCDCsESet = serviceCDCsESet;
        serviceCDCsESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    NsdPackage.SERVICE_NS__SERVICE_CD_CS, oldServiceCDCs, newServiceCDCs, !oldServiceCDCsESet );
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
            if( serviceCDCs != null )
                msgs = ( ( InternalEObject ) serviceCDCs ).eInverseRemove( this,
                        NsdPackage.SERVICE_CD_CS__PARENT_SERVICE_NS, ServiceCDCs.class, msgs );
            if( newServiceCDCs != null )
                msgs = ( ( InternalEObject ) newServiceCDCs ).eInverseAdd( this,
                        NsdPackage.SERVICE_CD_CS__PARENT_SERVICE_NS, ServiceCDCs.class, msgs );
            msgs = basicSetServiceCDCs( newServiceCDCs, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldServiceCDCsESet = serviceCDCsESet;
            serviceCDCsESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.SERVICE_NS__SERVICE_CD_CS,
                        newServiceCDCs, newServiceCDCs, !oldServiceCDCsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetServiceCDCs( NotificationChain msgs ) {
        ServiceCDCs oldServiceCDCs = serviceCDCs;
        serviceCDCs = null;
        boolean oldServiceCDCsESet = serviceCDCsESet;
        serviceCDCsESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    NsdPackage.SERVICE_NS__SERVICE_CD_CS, oldServiceCDCs, null, oldServiceCDCsESet );
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
    public void unsetServiceCDCs() {
        if( serviceCDCs != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) serviceCDCs ).eInverseRemove( this,
                    NsdPackage.SERVICE_CD_CS__PARENT_SERVICE_NS, ServiceCDCs.class, msgs );
            msgs = basicUnsetServiceCDCs( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldServiceCDCsESet = serviceCDCsESet;
            serviceCDCsESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.SERVICE_NS__SERVICE_CD_CS, null,
                        null, oldServiceCDCsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetServiceCDCs() {
        return serviceCDCsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean idAttributeRequired( final DiagnosticChain diagnostics, final Map< Object, Object > context ) {
        final String constraintName = "AgNSIdentification::idAttributeRequired";
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
                    NsdPackage.Literals.AG_NS_IDENTIFICATION___ID_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP );
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
        final String constraintName = "AgNSIdentification::versionAttributeRequired";
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
                    NsdPackage.Literals.AG_NS_IDENTIFICATION___VERSION_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP );
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
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.SERVICE_NS__DESC_ID, oldDescID, descID,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.SERVICE_NS__DESC_ID, oldDescID,
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
                    NsdPackage.SERVICE_NS__REFERS_TO_DOC, oldRefersToDoc, newRefersToDoc, !oldRefersToDocESet );
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
                eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.SERVICE_NS__REFERS_TO_DOC,
                        newRefersToDoc, newRefersToDoc, !oldRefersToDocESet ) );
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
                    NsdPackage.SERVICE_NS__REFERS_TO_DOC, oldRefersToDoc, null, oldRefersToDocESet );
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
                eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.SERVICE_NS__REFERS_TO_DOC, null,
                        null, oldRefersToDocESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.SERVICE_NS__ID, oldId, id,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.SERVICE_NS__ID, oldId, ID_EDEFAULT,
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
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.SERVICE_NS__RELEASE, oldRelease, release,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.SERVICE_NS__RELEASE, oldRelease,
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
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.SERVICE_NS__REVISION, oldRevision,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.SERVICE_NS__REVISION, oldRevision,
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
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.SERVICE_NS__UML_DATE, oldUmlDate,
                    umlDate, !oldUmlDateESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.SERVICE_NS__UML_DATE, oldUmlDate,
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
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.SERVICE_NS__UML_VERSION, oldUmlVersion,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.SERVICE_NS__UML_VERSION, oldUmlVersion,
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
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case NsdPackage.SERVICE_NS__REFERS_TO_DOC:
            if( refersToDoc != null )
                msgs = ( ( InternalEObject ) refersToDoc ).eInverseRemove( this, NsdPackage.DOC__REFERRED_BY_AG_NS_DESC,
                        Doc.class, msgs );
            return basicSetRefersToDoc( ( Doc ) otherEnd, msgs );
        case NsdPackage.SERVICE_NS__CHANGES:
            if( changes != null )
                msgs = ( ( InternalEObject ) changes ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - NsdPackage.SERVICE_NS__CHANGES, null, msgs );
            return basicSetChanges( ( Changes ) otherEnd, msgs );
        case NsdPackage.SERVICE_NS__FUNCTIONAL_CONSTRAINTS:
            if( functionalConstraints != null )
                msgs = ( ( InternalEObject ) functionalConstraints ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - NsdPackage.SERVICE_NS__FUNCTIONAL_CONSTRAINTS, null, msgs );
            return basicSetFunctionalConstraints( ( FunctionalConstraints ) otherEnd, msgs );
        case NsdPackage.SERVICE_NS__PRESENCE_CONDITIONS:
            if( presenceConditions != null )
                msgs = ( ( InternalEObject ) presenceConditions ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - NsdPackage.SERVICE_NS__PRESENCE_CONDITIONS, null, msgs );
            return basicSetPresenceConditions( ( PresenceConditions ) otherEnd, msgs );
        case NsdPackage.SERVICE_NS__ABBREVIATIONS:
            if( abbreviations != null )
                msgs = ( ( InternalEObject ) abbreviations ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - NsdPackage.SERVICE_NS__ABBREVIATIONS, null, msgs );
            return basicSetAbbreviations( ( Abbreviations ) otherEnd, msgs );
        case NsdPackage.SERVICE_NS__SERVICE_TYPE_REALIZATIONS:
            if( serviceTypeRealizations != null )
                msgs = ( ( InternalEObject ) serviceTypeRealizations ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - NsdPackage.SERVICE_NS__SERVICE_TYPE_REALIZATIONS, null, msgs );
            return basicSetServiceTypeRealizations( ( ServiceTypeRealizations ) otherEnd, msgs );
        case NsdPackage.SERVICE_NS__SERVICE_CONSTRUCTED_ATTRIBUTES:
            if( serviceConstructedAttributes != null )
                msgs = ( ( InternalEObject ) serviceConstructedAttributes ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - NsdPackage.SERVICE_NS__SERVICE_CONSTRUCTED_ATTRIBUTES, null, msgs );
            return basicSetServiceConstructedAttributes( ( ServiceConstructedAttributes ) otherEnd, msgs );
        case NsdPackage.SERVICE_NS__SERVICE_CD_CS:
            if( serviceCDCs != null )
                msgs = ( ( InternalEObject ) serviceCDCs ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - NsdPackage.SERVICE_NS__SERVICE_CD_CS, null, msgs );
            return basicSetServiceCDCs( ( ServiceCDCs ) otherEnd, msgs );
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
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.SERVICE_NS__VERSION, oldVersion, version,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.SERVICE_NS__VERSION, oldVersion,
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
        case NsdPackage.SERVICE_NS__REFERS_TO_DOC:
            return basicUnsetRefersToDoc( msgs );
        case NsdPackage.SERVICE_NS__CHANGES:
            return basicUnsetChanges( msgs );
        case NsdPackage.SERVICE_NS__FUNCTIONAL_CONSTRAINTS:
            return basicUnsetFunctionalConstraints( msgs );
        case NsdPackage.SERVICE_NS__PRESENCE_CONDITIONS:
            return basicUnsetPresenceConditions( msgs );
        case NsdPackage.SERVICE_NS__ABBREVIATIONS:
            return basicUnsetAbbreviations( msgs );
        case NsdPackage.SERVICE_NS__SERVICE_TYPE_REALIZATIONS:
            return basicUnsetServiceTypeRealizations( msgs );
        case NsdPackage.SERVICE_NS__SERVICE_CONSTRUCTED_ATTRIBUTES:
            return basicUnsetServiceConstructedAttributes( msgs );
        case NsdPackage.SERVICE_NS__SERVICE_CD_CS:
            return basicUnsetServiceCDCs( msgs );
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
        case NsdPackage.SERVICE_NS__RELEASE:
            return getRelease();
        case NsdPackage.SERVICE_NS__VERSION:
            return getVersion();
        case NsdPackage.SERVICE_NS__ID:
            return getId();
        case NsdPackage.SERVICE_NS__REVISION:
            return getRevision();
        case NsdPackage.SERVICE_NS__PUBLICATION_STAGE:
            return getPublicationStage();
        case NsdPackage.SERVICE_NS__UML_DATE:
            return getUmlDate();
        case NsdPackage.SERVICE_NS__UML_VERSION:
            return getUmlVersion();
        case NsdPackage.SERVICE_NS__DESC_ID:
            return getDescID();
        case NsdPackage.SERVICE_NS__REFERS_TO_DOC:
            return getRefersToDoc();
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
        case NsdPackage.SERVICE_NS__RELEASE:
            setRelease( ( Integer ) newValue );
            return;
        case NsdPackage.SERVICE_NS__VERSION:
            setVersion( ( Integer ) newValue );
            return;
        case NsdPackage.SERVICE_NS__ID:
            setId( ( String ) newValue );
            return;
        case NsdPackage.SERVICE_NS__REVISION:
            setRevision( ( String ) newValue );
            return;
        case NsdPackage.SERVICE_NS__PUBLICATION_STAGE:
            setPublicationStage( ( PubStage ) newValue );
            return;
        case NsdPackage.SERVICE_NS__UML_DATE:
            setUmlDate( ( XMLGregorianCalendar ) newValue );
            return;
        case NsdPackage.SERVICE_NS__UML_VERSION:
            setUmlVersion( ( String ) newValue );
            return;
        case NsdPackage.SERVICE_NS__DESC_ID:
            setDescID( ( String ) newValue );
            return;
        case NsdPackage.SERVICE_NS__REFERS_TO_DOC:
            setRefersToDoc( ( Doc ) newValue );
            return;
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
        case NsdPackage.SERVICE_NS__RELEASE:
            unsetRelease();
            return;
        case NsdPackage.SERVICE_NS__VERSION:
            unsetVersion();
            return;
        case NsdPackage.SERVICE_NS__ID:
            unsetId();
            return;
        case NsdPackage.SERVICE_NS__REVISION:
            unsetRevision();
            return;
        case NsdPackage.SERVICE_NS__PUBLICATION_STAGE:
            unsetPublicationStage();
            return;
        case NsdPackage.SERVICE_NS__UML_DATE:
            unsetUmlDate();
            return;
        case NsdPackage.SERVICE_NS__UML_VERSION:
            unsetUmlVersion();
            return;
        case NsdPackage.SERVICE_NS__DESC_ID:
            unsetDescID();
            return;
        case NsdPackage.SERVICE_NS__REFERS_TO_DOC:
            unsetRefersToDoc();
            return;
        case NsdPackage.SERVICE_NS__CHANGES:
            unsetChanges();
            return;
        case NsdPackage.SERVICE_NS__FUNCTIONAL_CONSTRAINTS:
            unsetFunctionalConstraints();
            return;
        case NsdPackage.SERVICE_NS__PRESENCE_CONDITIONS:
            unsetPresenceConditions();
            return;
        case NsdPackage.SERVICE_NS__ABBREVIATIONS:
            unsetAbbreviations();
            return;
        case NsdPackage.SERVICE_NS__SERVICE_TYPE_REALIZATIONS:
            unsetServiceTypeRealizations();
            return;
        case NsdPackage.SERVICE_NS__SERVICE_CONSTRUCTED_ATTRIBUTES:
            unsetServiceConstructedAttributes();
            return;
        case NsdPackage.SERVICE_NS__SERVICE_CD_CS:
            unsetServiceCDCs();
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
        case NsdPackage.SERVICE_NS__RELEASE:
            return isSetRelease();
        case NsdPackage.SERVICE_NS__VERSION:
            return isSetVersion();
        case NsdPackage.SERVICE_NS__ID:
            return isSetId();
        case NsdPackage.SERVICE_NS__REVISION:
            return isSetRevision();
        case NsdPackage.SERVICE_NS__PUBLICATION_STAGE:
            return isSetPublicationStage();
        case NsdPackage.SERVICE_NS__UML_DATE:
            return isSetUmlDate();
        case NsdPackage.SERVICE_NS__UML_VERSION:
            return isSetUmlVersion();
        case NsdPackage.SERVICE_NS__DESC_ID:
            return isSetDescID();
        case NsdPackage.SERVICE_NS__REFERS_TO_DOC:
            return isSetRefersToDoc();
        case NsdPackage.SERVICE_NS__CHANGES:
            return isSetChanges();
        case NsdPackage.SERVICE_NS__FUNCTIONAL_CONSTRAINTS:
            return isSetFunctionalConstraints();
        case NsdPackage.SERVICE_NS__PRESENCE_CONDITIONS:
            return isSetPresenceConditions();
        case NsdPackage.SERVICE_NS__ABBREVIATIONS:
            return isSetAbbreviations();
        case NsdPackage.SERVICE_NS__SERVICE_TYPE_REALIZATIONS:
            return isSetServiceTypeRealizations();
        case NsdPackage.SERVICE_NS__SERVICE_CONSTRUCTED_ATTRIBUTES:
            return isSetServiceConstructedAttributes();
        case NsdPackage.SERVICE_NS__SERVICE_CD_CS:
            return isSetServiceCDCs();
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
            case NsdPackage.SERVICE_NS__RELEASE:
                return NsdPackage.AG_NS_IDENTIFICATION__RELEASE;
            case NsdPackage.SERVICE_NS__VERSION:
                return NsdPackage.AG_NS_IDENTIFICATION__VERSION;
            case NsdPackage.SERVICE_NS__ID:
                return NsdPackage.AG_NS_IDENTIFICATION__ID;
            case NsdPackage.SERVICE_NS__REVISION:
                return NsdPackage.AG_NS_IDENTIFICATION__REVISION;
            case NsdPackage.SERVICE_NS__PUBLICATION_STAGE:
                return NsdPackage.AG_NS_IDENTIFICATION__PUBLICATION_STAGE;
            default:
                return -1;
            }
        }
        if( baseClass == AgUML.class ) {
            switch( derivedFeatureID ) {
            case NsdPackage.SERVICE_NS__UML_DATE:
                return NsdPackage.AG_UML__UML_DATE;
            case NsdPackage.SERVICE_NS__UML_VERSION:
                return NsdPackage.AG_UML__UML_VERSION;
            default:
                return -1;
            }
        }
        if( baseClass == AgNSdesc.class ) {
            switch( derivedFeatureID ) {
            case NsdPackage.SERVICE_NS__DESC_ID:
                return NsdPackage.AG_NSDESC__DESC_ID;
            case NsdPackage.SERVICE_NS__REFERS_TO_DOC:
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
                return NsdPackage.SERVICE_NS__RELEASE;
            case NsdPackage.AG_NS_IDENTIFICATION__VERSION:
                return NsdPackage.SERVICE_NS__VERSION;
            case NsdPackage.AG_NS_IDENTIFICATION__ID:
                return NsdPackage.SERVICE_NS__ID;
            case NsdPackage.AG_NS_IDENTIFICATION__REVISION:
                return NsdPackage.SERVICE_NS__REVISION;
            case NsdPackage.AG_NS_IDENTIFICATION__PUBLICATION_STAGE:
                return NsdPackage.SERVICE_NS__PUBLICATION_STAGE;
            default:
                return -1;
            }
        }
        if( baseClass == AgUML.class ) {
            switch( baseFeatureID ) {
            case NsdPackage.AG_UML__UML_DATE:
                return NsdPackage.SERVICE_NS__UML_DATE;
            case NsdPackage.AG_UML__UML_VERSION:
                return NsdPackage.SERVICE_NS__UML_VERSION;
            default:
                return -1;
            }
        }
        if( baseClass == AgNSdesc.class ) {
            switch( baseFeatureID ) {
            case NsdPackage.AG_NSDESC__DESC_ID:
                return NsdPackage.SERVICE_NS__DESC_ID;
            case NsdPackage.AG_NSDESC__REFERS_TO_DOC:
                return NsdPackage.SERVICE_NS__REFERS_TO_DOC;
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
        if( baseClass == AgNSIdentification.class ) {
            switch( baseOperationID ) {
            case NsdPackage.AG_NS_IDENTIFICATION___ID_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP:
                return NsdPackage.SERVICE_NS___ID_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP;
            case NsdPackage.AG_NS_IDENTIFICATION___VERSION_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP:
                return NsdPackage.SERVICE_NS___VERSION_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP;
            default:
                return -1;
            }
        }
        if( baseClass == AgUML.class ) {
            switch( baseOperationID ) {
            default:
                return -1;
            }
        }
        if( baseClass == AgNSdesc.class ) {
            switch( baseOperationID ) {
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
        case NsdPackage.SERVICE_NS___ID_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP:
            return idAttributeRequired( ( DiagnosticChain ) arguments.get( 0 ),
                    ( Map< Object, Object > ) arguments.get( 1 ) );
        case NsdPackage.SERVICE_NS___VERSION_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP:
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
        console.debug( EXPLICIT_LINK_CATEGORY, getLineNumber(), "ServiceNSImpl.buildExplicitLinks()" );

        if( super.buildExplicitLinks( console ) ) return true;

        if( isSetDescID() ) {
            if( this.eResource().getResourceSet() instanceof NsdResourceSetImpl ) {
                Doc doc = ( ( NsdResourceSetImpl ) this.eResource().getResourceSet() )
                        .findDoc( NsIdentification.of( this ), getDescID() );
                if( doc != null ) setRefersToDoc( doc );
            }
        }

        return false;
    }

    public NsIdentification getNsIdentification() {
        return NsIdentification.of( getId(), getVersion(), getRevision(), getRelease() );
    }

} //ServiceNSImpl
