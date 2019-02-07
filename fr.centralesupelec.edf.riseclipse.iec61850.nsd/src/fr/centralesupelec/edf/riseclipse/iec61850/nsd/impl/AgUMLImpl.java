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

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgUML;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ag UML</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AgUMLImpl#getUmlDate <em>Uml Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AgUMLImpl#getUmlVersion <em>Uml Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AgUMLImpl extends MinimalEObjectImpl.Container implements AgUML {
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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AgUMLImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.AG_UML;
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.AG_UML__UML_DATE, oldUmlDate, umlDate, !oldUmlDateESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                NsdPackage.AG_UML__UML_DATE, oldUmlDate, UML_DATE_EDEFAULT, oldUmlDateESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.AG_UML__UML_VERSION, oldUmlVersion, umlVersion, !oldUmlVersionESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                NsdPackage.AG_UML__UML_VERSION, oldUmlVersion, UML_VERSION_EDEFAULT, oldUmlVersionESet ) );
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
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case NsdPackage.AG_UML__UML_DATE:
            return getUmlDate();
        case NsdPackage.AG_UML__UML_VERSION:
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
        case NsdPackage.AG_UML__UML_DATE:
            setUmlDate( ( XMLGregorianCalendar ) newValue );
            return;
        case NsdPackage.AG_UML__UML_VERSION:
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
        case NsdPackage.AG_UML__UML_DATE:
            unsetUmlDate();
            return;
        case NsdPackage.AG_UML__UML_VERSION:
            unsetUmlVersion();
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
        case NsdPackage.AG_UML__UML_DATE:
            return isSetUmlDate();
        case NsdPackage.AG_UML__UML_VERSION:
            return isSetUmlVersion();
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
        result.append( " (umlDate: " );
        if( umlDateESet )
            result.append( umlDate );
        else
            result.append( "<unset>" );
        result.append( ", umlVersion: " );
        if( umlVersionESet )
            result.append( umlVersion );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //AgUMLImpl
