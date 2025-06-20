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
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.TupleValue;

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServices;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraints;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdTables;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.util.NsIdentification;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.util.NsdResourceSetImpl;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functional Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.FunctionalConstraintImpl#getApplicableServices <em>Applicable Services</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.FunctionalConstraintImpl#getAbbreviation <em>Abbreviation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.FunctionalConstraintImpl#getDescID <em>Desc ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.FunctionalConstraintImpl#getTitleID <em>Title ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.FunctionalConstraintImpl#getParentFunctionalConstraints <em>Parent Functional Constraints</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.FunctionalConstraintImpl#getReferredByDataAttribute <em>Referred By Data Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.FunctionalConstraintImpl#getRefersToDescDoc <em>Refers To Desc Doc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.FunctionalConstraintImpl#getRefersToTitleDoc <em>Refers To Title Doc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionalConstraintImpl extends NsdObjectImpl implements FunctionalConstraint {
    /**
     * The cached value of the '{@link #getApplicableServices() <em>Applicable Services</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getApplicableServices()
     * @generated
     * @ordered
     */
    protected ApplicableServices applicableServices;

    /**
     * This is true if the Applicable Services containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean applicableServicesESet;

    /**
     * The default value of the '{@link #getAbbreviation() <em>Abbreviation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAbbreviation()
     * @generated
     * @ordered
     */
    protected static final String ABBREVIATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAbbreviation() <em>Abbreviation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAbbreviation()
     * @generated
     * @ordered
     */
    protected String abbreviation = ABBREVIATION_EDEFAULT;

    /**
     * This is true if the Abbreviation attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean abbreviationESet;

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
     * The default value of the '{@link #getTitleID() <em>Title ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTitleID()
     * @generated
     * @ordered
     */
    protected static final String TITLE_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTitleID() <em>Title ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTitleID()
     * @generated
     * @ordered
     */
    protected String titleID = TITLE_ID_EDEFAULT;

    /**
     * This is true if the Title ID attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean titleIDESet;

    /**
     * The cached value of the '{@link #getReferredByDataAttribute() <em>Referred By Data Attribute</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredByDataAttribute()
     * @generated
     * @ordered
     */
    protected EList< DataAttribute > referredByDataAttribute;

    /**
     * The cached value of the '{@link #getRefersToDescDoc() <em>Refers To Desc Doc</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToDescDoc()
     * @generated
     * @ordered
     */
    protected Doc refersToDescDoc;

    /**
     * This is true if the Refers To Desc Doc reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToDescDocESet;

    /**
     * The cached value of the '{@link #getRefersToTitleDoc() <em>Refers To Title Doc</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToTitleDoc()
     * @generated
     * @ordered
     */
    protected Doc refersToTitleDoc;

    /**
     * This is true if the Refers To Title Doc reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToTitleDocESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FunctionalConstraintImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.FUNCTIONAL_CONSTRAINT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ApplicableServices getApplicableServices() {
        return applicableServices;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetApplicableServices( ApplicableServices newApplicableServices,
            NotificationChain msgs ) {
        ApplicableServices oldApplicableServices = applicableServices;
        applicableServices = newApplicableServices;
        boolean oldApplicableServicesESet = applicableServicesESet;
        applicableServicesESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    NsdPackage.FUNCTIONAL_CONSTRAINT__APPLICABLE_SERVICES, oldApplicableServices, newApplicableServices,
                    !oldApplicableServicesESet );
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
    public void setApplicableServices( ApplicableServices newApplicableServices ) {
        if( newApplicableServices != applicableServices ) {
            NotificationChain msgs = null;
            if( applicableServices != null ) {
                msgs = ( ( InternalEObject ) applicableServices ).eInverseRemove( this,
                        NsdPackage.APPLICABLE_SERVICES__PARENT_FUNCTIONAL_CONSTRAINT, ApplicableServices.class, msgs );
            }
            if( newApplicableServices != null ) {
                msgs = ( ( InternalEObject ) newApplicableServices ).eInverseAdd( this,
                        NsdPackage.APPLICABLE_SERVICES__PARENT_FUNCTIONAL_CONSTRAINT, ApplicableServices.class, msgs );
            }
            msgs = basicSetApplicableServices( newApplicableServices, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldApplicableServicesESet = applicableServicesESet;
            applicableServicesESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET,
                        NsdPackage.FUNCTIONAL_CONSTRAINT__APPLICABLE_SERVICES, newApplicableServices,
                        newApplicableServices, !oldApplicableServicesESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetApplicableServices( NotificationChain msgs ) {
        ApplicableServices oldApplicableServices = applicableServices;
        applicableServices = null;
        boolean oldApplicableServicesESet = applicableServicesESet;
        applicableServicesESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    NsdPackage.FUNCTIONAL_CONSTRAINT__APPLICABLE_SERVICES, oldApplicableServices, null,
                    oldApplicableServicesESet );
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
    public void unsetApplicableServices() {
        if( applicableServices != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) applicableServices ).eInverseRemove( this,
                    NsdPackage.APPLICABLE_SERVICES__PARENT_FUNCTIONAL_CONSTRAINT, ApplicableServices.class, msgs );
            msgs = basicUnsetApplicableServices( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldApplicableServicesESet = applicableServicesESet;
            applicableServicesESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        NsdPackage.FUNCTIONAL_CONSTRAINT__APPLICABLE_SERVICES, null, null,
                        oldApplicableServicesESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetApplicableServices() {
        return applicableServicesESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getAbbreviation() {
        return abbreviation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAbbreviation( String newAbbreviation ) {
        String oldAbbreviation = abbreviation;
        abbreviation = newAbbreviation;
        boolean oldAbbreviationESet = abbreviationESet;
        abbreviationESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.FUNCTIONAL_CONSTRAINT__ABBREVIATION,
                    oldAbbreviation, abbreviation, !oldAbbreviationESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAbbreviation() {
        String oldAbbreviation = abbreviation;
        boolean oldAbbreviationESet = abbreviationESet;
        abbreviation = ABBREVIATION_EDEFAULT;
        abbreviationESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.FUNCTIONAL_CONSTRAINT__ABBREVIATION,
                    oldAbbreviation, ABBREVIATION_EDEFAULT, oldAbbreviationESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAbbreviation() {
        return abbreviationESet;
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
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.FUNCTIONAL_CONSTRAINT__DESC_ID,
                    oldDescID, descID, !oldDescIDESet ) );
        }
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
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.FUNCTIONAL_CONSTRAINT__DESC_ID,
                    oldDescID, DESC_ID_EDEFAULT, oldDescIDESet ) );
        }
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
    public String getTitleID() {
        return titleID;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTitleID( String newTitleID ) {
        String oldTitleID = titleID;
        titleID = newTitleID;
        boolean oldTitleIDESet = titleIDESet;
        titleIDESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.FUNCTIONAL_CONSTRAINT__TITLE_ID,
                    oldTitleID, titleID, !oldTitleIDESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTitleID() {
        String oldTitleID = titleID;
        boolean oldTitleIDESet = titleIDESet;
        titleID = TITLE_ID_EDEFAULT;
        titleIDESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.FUNCTIONAL_CONSTRAINT__TITLE_ID,
                    oldTitleID, TITLE_ID_EDEFAULT, oldTitleIDESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTitleID() {
        return titleIDESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FunctionalConstraints getParentFunctionalConstraints() {
        if( eContainerFeatureID() != NsdPackage.FUNCTIONAL_CONSTRAINT__PARENT_FUNCTIONAL_CONSTRAINTS ) {
            return null;
        }
        return ( FunctionalConstraints ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentFunctionalConstraints( FunctionalConstraints newParentFunctionalConstraints,
            NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentFunctionalConstraints,
                NsdPackage.FUNCTIONAL_CONSTRAINT__PARENT_FUNCTIONAL_CONSTRAINTS, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentFunctionalConstraints( FunctionalConstraints newParentFunctionalConstraints ) {
        if( newParentFunctionalConstraints != eInternalContainer()
                || ( eContainerFeatureID() != NsdPackage.FUNCTIONAL_CONSTRAINT__PARENT_FUNCTIONAL_CONSTRAINTS
                        && newParentFunctionalConstraints != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentFunctionalConstraints ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentFunctionalConstraints != null ) {
                msgs = ( ( InternalEObject ) newParentFunctionalConstraints ).eInverseAdd( this,
                        NsdPackage.FUNCTIONAL_CONSTRAINTS__FUNCTIONAL_CONSTRAINT, FunctionalConstraints.class, msgs );
            }
            msgs = basicSetParentFunctionalConstraints( newParentFunctionalConstraints, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    NsdPackage.FUNCTIONAL_CONSTRAINT__PARENT_FUNCTIONAL_CONSTRAINTS, newParentFunctionalConstraints,
                    newParentFunctionalConstraints ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< DataAttribute > getReferredByDataAttribute() {
        if( referredByDataAttribute == null ) {
            referredByDataAttribute = new EObjectWithInverseEList.Unsettable< >( DataAttribute.class,
                    this, NsdPackage.FUNCTIONAL_CONSTRAINT__REFERRED_BY_DATA_ATTRIBUTE,
                    NsdPackage.DATA_ATTRIBUTE__REFERS_TO_FUNCTIONAL_CONSTRAINT );
        }
        return referredByDataAttribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredByDataAttribute() {
        if( referredByDataAttribute != null ) {
            ( ( InternalEList.Unsettable< ? > ) referredByDataAttribute ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredByDataAttribute() {
        return referredByDataAttribute != null && ( ( InternalEList.Unsettable< ? > ) referredByDataAttribute ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Doc getRefersToDescDoc() {
        return refersToDescDoc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToDescDoc( Doc newRefersToDescDoc, NotificationChain msgs ) {
        Doc oldRefersToDescDoc = refersToDescDoc;
        refersToDescDoc = newRefersToDescDoc;
        boolean oldRefersToDescDocESet = refersToDescDocESet;
        refersToDescDocESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    NsdPackage.FUNCTIONAL_CONSTRAINT__REFERS_TO_DESC_DOC, oldRefersToDescDoc, newRefersToDescDoc,
                    !oldRefersToDescDocESet );
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
    public void setRefersToDescDoc( Doc newRefersToDescDoc ) {
        if( newRefersToDescDoc != refersToDescDoc ) {
            NotificationChain msgs = null;
            if( refersToDescDoc != null ) {
                msgs = ( ( InternalEObject ) refersToDescDoc ).eInverseRemove( this,
                        NsdPackage.DOC__REFERRED_BY_FUNCTIONAL_CONSTRAINT_AS_DESC, Doc.class, msgs );
            }
            if( newRefersToDescDoc != null ) {
                msgs = ( ( InternalEObject ) newRefersToDescDoc ).eInverseAdd( this,
                        NsdPackage.DOC__REFERRED_BY_FUNCTIONAL_CONSTRAINT_AS_DESC, Doc.class, msgs );
            }
            msgs = basicSetRefersToDescDoc( newRefersToDescDoc, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToDescDocESet = refersToDescDocESet;
            refersToDescDocESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET,
                        NsdPackage.FUNCTIONAL_CONSTRAINT__REFERS_TO_DESC_DOC, newRefersToDescDoc, newRefersToDescDoc,
                        !oldRefersToDescDocESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToDescDoc( NotificationChain msgs ) {
        Doc oldRefersToDescDoc = refersToDescDoc;
        refersToDescDoc = null;
        boolean oldRefersToDescDocESet = refersToDescDocESet;
        refersToDescDocESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    NsdPackage.FUNCTIONAL_CONSTRAINT__REFERS_TO_DESC_DOC, oldRefersToDescDoc, null,
                    oldRefersToDescDocESet );
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
    public void unsetRefersToDescDoc() {
        if( refersToDescDoc != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToDescDoc ).eInverseRemove( this,
                    NsdPackage.DOC__REFERRED_BY_FUNCTIONAL_CONSTRAINT_AS_DESC, Doc.class, msgs );
            msgs = basicUnsetRefersToDescDoc( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToDescDocESet = refersToDescDocESet;
            refersToDescDocESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        NsdPackage.FUNCTIONAL_CONSTRAINT__REFERS_TO_DESC_DOC, null, null, oldRefersToDescDocESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToDescDoc() {
        return refersToDescDocESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Doc getRefersToTitleDoc() {
        return refersToTitleDoc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToTitleDoc( Doc newRefersToTitleDoc, NotificationChain msgs ) {
        Doc oldRefersToTitleDoc = refersToTitleDoc;
        refersToTitleDoc = newRefersToTitleDoc;
        boolean oldRefersToTitleDocESet = refersToTitleDocESet;
        refersToTitleDocESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    NsdPackage.FUNCTIONAL_CONSTRAINT__REFERS_TO_TITLE_DOC, oldRefersToTitleDoc, newRefersToTitleDoc,
                    !oldRefersToTitleDocESet );
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
    public void setRefersToTitleDoc( Doc newRefersToTitleDoc ) {
        if( newRefersToTitleDoc != refersToTitleDoc ) {
            NotificationChain msgs = null;
            if( refersToTitleDoc != null ) {
                msgs = ( ( InternalEObject ) refersToTitleDoc ).eInverseRemove( this,
                        NsdPackage.DOC__REFERRED_BY_FUNCTIONAL_CONSTRAINT_AS_TITLE, Doc.class, msgs );
            }
            if( newRefersToTitleDoc != null ) {
                msgs = ( ( InternalEObject ) newRefersToTitleDoc ).eInverseAdd( this,
                        NsdPackage.DOC__REFERRED_BY_FUNCTIONAL_CONSTRAINT_AS_TITLE, Doc.class, msgs );
            }
            msgs = basicSetRefersToTitleDoc( newRefersToTitleDoc, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToTitleDocESet = refersToTitleDocESet;
            refersToTitleDocESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET,
                        NsdPackage.FUNCTIONAL_CONSTRAINT__REFERS_TO_TITLE_DOC, newRefersToTitleDoc, newRefersToTitleDoc,
                        !oldRefersToTitleDocESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToTitleDoc( NotificationChain msgs ) {
        Doc oldRefersToTitleDoc = refersToTitleDoc;
        refersToTitleDoc = null;
        boolean oldRefersToTitleDocESet = refersToTitleDocESet;
        refersToTitleDocESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    NsdPackage.FUNCTIONAL_CONSTRAINT__REFERS_TO_TITLE_DOC, oldRefersToTitleDoc, null,
                    oldRefersToTitleDocESet );
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
    public void unsetRefersToTitleDoc() {
        if( refersToTitleDoc != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToTitleDoc ).eInverseRemove( this,
                    NsdPackage.DOC__REFERRED_BY_FUNCTIONAL_CONSTRAINT_AS_TITLE, Doc.class, msgs );
            msgs = basicUnsetRefersToTitleDoc( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToTitleDocESet = refersToTitleDocESet;
            refersToTitleDocESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        NsdPackage.FUNCTIONAL_CONSTRAINT__REFERS_TO_TITLE_DOC, null, null, oldRefersToTitleDocESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToTitleDoc() {
        return refersToTitleDocESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean abbreviationAttributeRequired( final DiagnosticChain diagnostics,
            final Map< Object, Object > context ) {
        final String constraintName = "FunctionalConstraint::abbreviationAttributeRequired";
        try {
            /**
             *
             * inv abbreviationAttributeRequired:
             *   let severity : Integer[1] = constraintName.getSeverity()
             *   in
             *     if severity <= 0
             *     then true
             *     else
             *       let
             *         result : OclAny[1] = let status : Boolean[1] = self.abbreviation <> null
             *         in
             *           if status = true
             *           then true
             *           else
             *             Tuple{message = 'The abbreviation attribute is required', status = status
             *             }
             *           endif
             *       in
             *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
             *     endif
             */
            final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor( this );
            final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate( executor,
                    NsdPackage.Literals.FUNCTIONAL_CONSTRAINT___ABBREVIATION_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP );
            final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
                    .evaluate( executor, severity_0, NsdTables.INT_0 ).booleanValue();
            /*@NonInvalid*/ boolean IF_le;
            if( le ) {
                IF_le = true;
            }
            else {
                final /*@NonInvalid*/ String abbreviation = this.getAbbreviation();
                final /*@NonInvalid*/ boolean status = abbreviation != null;
                /*@NonInvalid*/ Object IF_status;
                if( status ) {
                    IF_status = ValueUtil.TRUE_VALUE;
                }
                else {
                    final /*@NonInvalid*/ TupleValue TUP_ = ValueUtil.createTupleOfEach( NsdTables.TUPLid_,
                            NsdTables.STR_The_32_abbreviation_32_attribute_32_is_32_required, status );
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
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case NsdPackage.FUNCTIONAL_CONSTRAINT__APPLICABLE_SERVICES:
            if( applicableServices != null ) {
                msgs = ( ( InternalEObject ) applicableServices ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - NsdPackage.FUNCTIONAL_CONSTRAINT__APPLICABLE_SERVICES, null, msgs );
            }
            return basicSetApplicableServices( ( ApplicableServices ) otherEnd, msgs );
        case NsdPackage.FUNCTIONAL_CONSTRAINT__PARENT_FUNCTIONAL_CONSTRAINTS:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentFunctionalConstraints( ( FunctionalConstraints ) otherEnd, msgs );
        case NsdPackage.FUNCTIONAL_CONSTRAINT__REFERRED_BY_DATA_ATTRIBUTE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReferredByDataAttribute() )
                    .basicAdd( otherEnd, msgs );
        case NsdPackage.FUNCTIONAL_CONSTRAINT__REFERS_TO_DESC_DOC:
            if( refersToDescDoc != null ) {
                msgs = ( ( InternalEObject ) refersToDescDoc ).eInverseRemove( this,
                        NsdPackage.DOC__REFERRED_BY_FUNCTIONAL_CONSTRAINT_AS_DESC, Doc.class, msgs );
            }
            return basicSetRefersToDescDoc( ( Doc ) otherEnd, msgs );
        case NsdPackage.FUNCTIONAL_CONSTRAINT__REFERS_TO_TITLE_DOC:
            if( refersToTitleDoc != null ) {
                msgs = ( ( InternalEObject ) refersToTitleDoc ).eInverseRemove( this,
                        NsdPackage.DOC__REFERRED_BY_FUNCTIONAL_CONSTRAINT_AS_TITLE, Doc.class, msgs );
            }
            return basicSetRefersToTitleDoc( ( Doc ) otherEnd, msgs );
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
        case NsdPackage.FUNCTIONAL_CONSTRAINT__APPLICABLE_SERVICES:
            return basicUnsetApplicableServices( msgs );
        case NsdPackage.FUNCTIONAL_CONSTRAINT__PARENT_FUNCTIONAL_CONSTRAINTS:
            return basicSetParentFunctionalConstraints( null, msgs );
        case NsdPackage.FUNCTIONAL_CONSTRAINT__REFERRED_BY_DATA_ATTRIBUTE:
            return ( ( InternalEList< ? > ) getReferredByDataAttribute() ).basicRemove( otherEnd, msgs );
        case NsdPackage.FUNCTIONAL_CONSTRAINT__REFERS_TO_DESC_DOC:
            return basicUnsetRefersToDescDoc( msgs );
        case NsdPackage.FUNCTIONAL_CONSTRAINT__REFERS_TO_TITLE_DOC:
            return basicUnsetRefersToTitleDoc( msgs );
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
        case NsdPackage.FUNCTIONAL_CONSTRAINT__PARENT_FUNCTIONAL_CONSTRAINTS:
            return eInternalContainer().eInverseRemove( this, NsdPackage.FUNCTIONAL_CONSTRAINTS__FUNCTIONAL_CONSTRAINT,
                    FunctionalConstraints.class, msgs );
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
        case NsdPackage.FUNCTIONAL_CONSTRAINT__APPLICABLE_SERVICES:
            return getApplicableServices();
        case NsdPackage.FUNCTIONAL_CONSTRAINT__ABBREVIATION:
            return getAbbreviation();
        case NsdPackage.FUNCTIONAL_CONSTRAINT__DESC_ID:
            return getDescID();
        case NsdPackage.FUNCTIONAL_CONSTRAINT__TITLE_ID:
            return getTitleID();
        case NsdPackage.FUNCTIONAL_CONSTRAINT__PARENT_FUNCTIONAL_CONSTRAINTS:
            return getParentFunctionalConstraints();
        case NsdPackage.FUNCTIONAL_CONSTRAINT__REFERRED_BY_DATA_ATTRIBUTE:
            return getReferredByDataAttribute();
        case NsdPackage.FUNCTIONAL_CONSTRAINT__REFERS_TO_DESC_DOC:
            return getRefersToDescDoc();
        case NsdPackage.FUNCTIONAL_CONSTRAINT__REFERS_TO_TITLE_DOC:
            return getRefersToTitleDoc();
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
        case NsdPackage.FUNCTIONAL_CONSTRAINT__APPLICABLE_SERVICES:
            setApplicableServices( ( ApplicableServices ) newValue );
            return;
        case NsdPackage.FUNCTIONAL_CONSTRAINT__ABBREVIATION:
            setAbbreviation( ( String ) newValue );
            return;
        case NsdPackage.FUNCTIONAL_CONSTRAINT__DESC_ID:
            setDescID( ( String ) newValue );
            return;
        case NsdPackage.FUNCTIONAL_CONSTRAINT__TITLE_ID:
            setTitleID( ( String ) newValue );
            return;
        case NsdPackage.FUNCTIONAL_CONSTRAINT__PARENT_FUNCTIONAL_CONSTRAINTS:
            setParentFunctionalConstraints( ( FunctionalConstraints ) newValue );
            return;
        case NsdPackage.FUNCTIONAL_CONSTRAINT__REFERRED_BY_DATA_ATTRIBUTE:
            getReferredByDataAttribute().clear();
            getReferredByDataAttribute().addAll( ( Collection< ? extends DataAttribute > ) newValue );
            return;
        case NsdPackage.FUNCTIONAL_CONSTRAINT__REFERS_TO_DESC_DOC:
            setRefersToDescDoc( ( Doc ) newValue );
            return;
        case NsdPackage.FUNCTIONAL_CONSTRAINT__REFERS_TO_TITLE_DOC:
            setRefersToTitleDoc( ( Doc ) newValue );
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
        case NsdPackage.FUNCTIONAL_CONSTRAINT__APPLICABLE_SERVICES:
            unsetApplicableServices();
            return;
        case NsdPackage.FUNCTIONAL_CONSTRAINT__ABBREVIATION:
            unsetAbbreviation();
            return;
        case NsdPackage.FUNCTIONAL_CONSTRAINT__DESC_ID:
            unsetDescID();
            return;
        case NsdPackage.FUNCTIONAL_CONSTRAINT__TITLE_ID:
            unsetTitleID();
            return;
        case NsdPackage.FUNCTIONAL_CONSTRAINT__PARENT_FUNCTIONAL_CONSTRAINTS:
            setParentFunctionalConstraints( ( FunctionalConstraints ) null );
            return;
        case NsdPackage.FUNCTIONAL_CONSTRAINT__REFERRED_BY_DATA_ATTRIBUTE:
            unsetReferredByDataAttribute();
            return;
        case NsdPackage.FUNCTIONAL_CONSTRAINT__REFERS_TO_DESC_DOC:
            unsetRefersToDescDoc();
            return;
        case NsdPackage.FUNCTIONAL_CONSTRAINT__REFERS_TO_TITLE_DOC:
            unsetRefersToTitleDoc();
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
        case NsdPackage.FUNCTIONAL_CONSTRAINT__APPLICABLE_SERVICES:
            return isSetApplicableServices();
        case NsdPackage.FUNCTIONAL_CONSTRAINT__ABBREVIATION:
            return isSetAbbreviation();
        case NsdPackage.FUNCTIONAL_CONSTRAINT__DESC_ID:
            return isSetDescID();
        case NsdPackage.FUNCTIONAL_CONSTRAINT__TITLE_ID:
            return isSetTitleID();
        case NsdPackage.FUNCTIONAL_CONSTRAINT__PARENT_FUNCTIONAL_CONSTRAINTS:
            return getParentFunctionalConstraints() != null;
        case NsdPackage.FUNCTIONAL_CONSTRAINT__REFERRED_BY_DATA_ATTRIBUTE:
            return isSetReferredByDataAttribute();
        case NsdPackage.FUNCTIONAL_CONSTRAINT__REFERS_TO_DESC_DOC:
            return isSetRefersToDescDoc();
        case NsdPackage.FUNCTIONAL_CONSTRAINT__REFERS_TO_TITLE_DOC:
            return isSetRefersToTitleDoc();
        }
        return super.eIsSet( featureID );
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
        case NsdPackage.FUNCTIONAL_CONSTRAINT___ABBREVIATION_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP:
            return abbreviationAttributeRequired( ( DiagnosticChain ) arguments.get( 0 ),
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
        result.append( " (abbreviation: " );
        if( abbreviationESet ) {
            result.append( abbreviation );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", descID: " );
        if( descIDESet ) {
            result.append( descID );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", titleID: " );
        if( titleIDESet ) {
            result.append( titleID );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ')' );
        return result.toString();
    }

    @Override
    public boolean buildExplicitLinks( IRiseClipseConsole console ) {
        console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                "FunctionalConstraintImpl.buildExplicitLinks()" );

        if( super.buildExplicitLinks( console ) ) {
            return true;
        }

        NsIdentification identification = null;
        if( getParentFunctionalConstraints().getParentNS() != null ) {
            identification = NsIdentification.of( getParentFunctionalConstraints().getParentNS() );
        }
        else if( getParentFunctionalConstraints().getParentServiceNS() != null ) {
            identification = NsIdentification.of( getParentFunctionalConstraints().getParentServiceNS() );
        }
        if( identification != null ) {
            if( isSetDescID() ) {
                Doc doc = ( ( NsdResourceSetImpl ) this.eResource().getResourceSet() ).findDoc( identification,
                        getDescID() );
                if( doc != null ) {
                    setRefersToDescDoc( doc );
                }
            }
            if( isSetTitleID() ) {
                Doc doc = ( ( NsdResourceSetImpl ) this.eResource().getResourceSet() ).findDoc( identification,
                        getTitleID() );
                if( doc != null ) {
                    setRefersToTitleDoc( doc );
                }
            }
        }

        return false;
    }

} //FunctionalConstraintImpl
