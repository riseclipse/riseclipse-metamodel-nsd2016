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

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServices;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraints;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

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
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.FunctionalConstraintImpl#getFunctionalConstraints <em>Functional Constraints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionalConstraintImpl extends MinimalEObjectImpl.Container implements FunctionalConstraint {
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
    public void setApplicableServices( ApplicableServices newApplicableServices ) {
        if( newApplicableServices != applicableServices ) {
            NotificationChain msgs = null;
            if( applicableServices != null ) msgs = ( ( InternalEObject ) applicableServices ).eInverseRemove( this,
                    NsdPackage.APPLICABLE_SERVICES__FUNCTIONAL_CONSTRAINT, ApplicableServices.class, msgs );
            if( newApplicableServices != null ) msgs = ( ( InternalEObject ) newApplicableServices ).eInverseAdd( this,
                    NsdPackage.APPLICABLE_SERVICES__FUNCTIONAL_CONSTRAINT, ApplicableServices.class, msgs );
            msgs = basicSetApplicableServices( newApplicableServices, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldApplicableServicesESet = applicableServicesESet;
            applicableServicesESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    NsdPackage.FUNCTIONAL_CONSTRAINT__APPLICABLE_SERVICES, newApplicableServices, newApplicableServices,
                    !oldApplicableServicesESet ) );
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
    public void unsetApplicableServices() {
        if( applicableServices != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) applicableServices ).eInverseRemove( this,
                    NsdPackage.APPLICABLE_SERVICES__FUNCTIONAL_CONSTRAINT, ApplicableServices.class, msgs );
            msgs = basicUnsetApplicableServices( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldApplicableServicesESet = applicableServicesESet;
            applicableServicesESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    NsdPackage.FUNCTIONAL_CONSTRAINT__APPLICABLE_SERVICES, null, null, oldApplicableServicesESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.FUNCTIONAL_CONSTRAINT__ABBREVIATION, oldAbbreviation, abbreviation, !oldAbbreviationESet ) );
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.FUNCTIONAL_CONSTRAINT__ABBREVIATION,
                    oldAbbreviation, ABBREVIATION_EDEFAULT, oldAbbreviationESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.FUNCTIONAL_CONSTRAINT__DESC_ID, oldDescID, descID, !oldDescIDESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                NsdPackage.FUNCTIONAL_CONSTRAINT__DESC_ID, oldDescID, DESC_ID_EDEFAULT, oldDescIDESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.FUNCTIONAL_CONSTRAINT__TITLE_ID, oldTitleID, titleID, !oldTitleIDESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                NsdPackage.FUNCTIONAL_CONSTRAINT__TITLE_ID, oldTitleID, TITLE_ID_EDEFAULT, oldTitleIDESet ) );
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
    public FunctionalConstraints getFunctionalConstraints() {
        if( eContainerFeatureID() != NsdPackage.FUNCTIONAL_CONSTRAINT__FUNCTIONAL_CONSTRAINTS ) return null;
        return ( FunctionalConstraints ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetFunctionalConstraints( FunctionalConstraints newFunctionalConstraints,
            NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newFunctionalConstraints,
                NsdPackage.FUNCTIONAL_CONSTRAINT__FUNCTIONAL_CONSTRAINTS, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFunctionalConstraints( FunctionalConstraints newFunctionalConstraints ) {
        if( newFunctionalConstraints != eInternalContainer()
                || ( eContainerFeatureID() != NsdPackage.FUNCTIONAL_CONSTRAINT__FUNCTIONAL_CONSTRAINTS
                        && newFunctionalConstraints != null ) ) {
            if( EcoreUtil.isAncestor( this, newFunctionalConstraints ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) msgs = eBasicRemoveFromContainer( msgs );
            if( newFunctionalConstraints != null )
                msgs = ( ( InternalEObject ) newFunctionalConstraints ).eInverseAdd( this,
                        NsdPackage.FUNCTIONAL_CONSTRAINTS__FUNCTIONAL_CONSTRAINT, FunctionalConstraints.class, msgs );
            msgs = basicSetFunctionalConstraints( newFunctionalConstraints, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, NsdPackage.FUNCTIONAL_CONSTRAINT__FUNCTIONAL_CONSTRAINTS,
                        newFunctionalConstraints, newFunctionalConstraints ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case NsdPackage.FUNCTIONAL_CONSTRAINT__APPLICABLE_SERVICES:
            if( applicableServices != null ) msgs = ( ( InternalEObject ) applicableServices ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - NsdPackage.FUNCTIONAL_CONSTRAINT__APPLICABLE_SERVICES, null, msgs );
            return basicSetApplicableServices( ( ApplicableServices ) otherEnd, msgs );
        case NsdPackage.FUNCTIONAL_CONSTRAINT__FUNCTIONAL_CONSTRAINTS:
            if( eInternalContainer() != null ) msgs = eBasicRemoveFromContainer( msgs );
            return basicSetFunctionalConstraints( ( FunctionalConstraints ) otherEnd, msgs );
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
        case NsdPackage.FUNCTIONAL_CONSTRAINT__FUNCTIONAL_CONSTRAINTS:
            return basicSetFunctionalConstraints( null, msgs );
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
        case NsdPackage.FUNCTIONAL_CONSTRAINT__FUNCTIONAL_CONSTRAINTS:
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
        case NsdPackage.FUNCTIONAL_CONSTRAINT__FUNCTIONAL_CONSTRAINTS:
            return getFunctionalConstraints();
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
        case NsdPackage.FUNCTIONAL_CONSTRAINT__FUNCTIONAL_CONSTRAINTS:
            setFunctionalConstraints( ( FunctionalConstraints ) newValue );
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
        case NsdPackage.FUNCTIONAL_CONSTRAINT__FUNCTIONAL_CONSTRAINTS:
            setFunctionalConstraints( ( FunctionalConstraints ) null );
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
        case NsdPackage.FUNCTIONAL_CONSTRAINT__FUNCTIONAL_CONSTRAINTS:
            return getFunctionalConstraints() != null;
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
        result.append( " (abbreviation: " );
        if( abbreviationESet )
            result.append( abbreviation );
        else
            result.append( "<unset>" );
        result.append( ", descID: " );
        if( descIDESet )
            result.append( descID );
        else
            result.append( "<unset>" );
        result.append( ", titleID: " );
        if( titleIDESet )
            result.append( titleID );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //FunctionalConstraintImpl
