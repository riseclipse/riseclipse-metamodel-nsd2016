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
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNsUsage;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Applicable Service NS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ApplicableServiceNSImpl#getServiceNsUsage <em>Service Ns Usage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ApplicableServiceNSImpl#getDate <em>Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ApplicableServiceNSImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplicableServiceNSImpl extends CopyrightedImpl implements ApplicableServiceNS {
    /**
     * The cached value of the '{@link #getServiceNsUsage() <em>Service Ns Usage</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getServiceNsUsage()
     * @generated
     * @ordered
     */
    protected EList< ServiceNsUsage > serviceNsUsage;

    /**
     * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDate()
     * @generated
     * @ordered
     */
    protected static final XMLGregorianCalendar DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDate()
     * @generated
     * @ordered
     */
    protected XMLGregorianCalendar date = DATE_EDEFAULT;

    /**
     * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVersion()
     * @generated
     * @ordered
     */
    protected static final long VERSION_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVersion()
     * @generated
     * @ordered
     */
    protected long version = VERSION_EDEFAULT;

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
    protected ApplicableServiceNSImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.APPLICABLE_SERVICE_NS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ServiceNsUsage > getServiceNsUsage() {
        if( serviceNsUsage == null ) {
            serviceNsUsage = new EObjectContainmentEList< ServiceNsUsage >( ServiceNsUsage.class, this,
                    NsdPackage.APPLICABLE_SERVICE_NS__SERVICE_NS_USAGE );
        }
        return serviceNsUsage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDate( XMLGregorianCalendar newDate ) {
        XMLGregorianCalendar oldDate = date;
        date = newDate;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.APPLICABLE_SERVICE_NS__DATE, oldDate, date ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public long getVersion() {
        return version;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVersion( long newVersion ) {
        long oldVersion = version;
        version = newVersion;
        boolean oldVersionESet = versionESet;
        versionESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.APPLICABLE_SERVICE_NS__VERSION, oldVersion, version, !oldVersionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVersion() {
        long oldVersion = version;
        boolean oldVersionESet = versionESet;
        version = VERSION_EDEFAULT;
        versionESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                NsdPackage.APPLICABLE_SERVICE_NS__VERSION, oldVersion, VERSION_EDEFAULT, oldVersionESet ) );
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
        case NsdPackage.APPLICABLE_SERVICE_NS__SERVICE_NS_USAGE:
            return ( ( InternalEList< ? > ) getServiceNsUsage() ).basicRemove( otherEnd, msgs );
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
        case NsdPackage.APPLICABLE_SERVICE_NS__SERVICE_NS_USAGE:
            return getServiceNsUsage();
        case NsdPackage.APPLICABLE_SERVICE_NS__DATE:
            return getDate();
        case NsdPackage.APPLICABLE_SERVICE_NS__VERSION:
            return getVersion();
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
        case NsdPackage.APPLICABLE_SERVICE_NS__SERVICE_NS_USAGE:
            getServiceNsUsage().clear();
            getServiceNsUsage().addAll( ( Collection< ? extends ServiceNsUsage > ) newValue );
            return;
        case NsdPackage.APPLICABLE_SERVICE_NS__DATE:
            setDate( ( XMLGregorianCalendar ) newValue );
            return;
        case NsdPackage.APPLICABLE_SERVICE_NS__VERSION:
            setVersion( ( Long ) newValue );
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
        case NsdPackage.APPLICABLE_SERVICE_NS__SERVICE_NS_USAGE:
            getServiceNsUsage().clear();
            return;
        case NsdPackage.APPLICABLE_SERVICE_NS__DATE:
            setDate( DATE_EDEFAULT );
            return;
        case NsdPackage.APPLICABLE_SERVICE_NS__VERSION:
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
        case NsdPackage.APPLICABLE_SERVICE_NS__SERVICE_NS_USAGE:
            return serviceNsUsage != null && !serviceNsUsage.isEmpty();
        case NsdPackage.APPLICABLE_SERVICE_NS__DATE:
            return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals( date );
        case NsdPackage.APPLICABLE_SERVICE_NS__VERSION:
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
        result.append( " (date: " );
        result.append( date );
        result.append( ", version: " );
        if( versionESet )
            result.append( version );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ApplicableServiceNSImpl
