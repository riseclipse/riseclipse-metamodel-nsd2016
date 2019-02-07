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

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AppliesToType;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdObject;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNsUsage;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Applies To Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AppliesToTypeImpl#getLineNumber <em>Line Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AppliesToTypeImpl#getServiceNsUsage <em>Service Ns Usage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AppliesToTypeImpl extends AgNSIdentificationImpl implements AppliesToType {
    /**
     * The default value of the '{@link #getLineNumber() <em>Line Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLineNumber()
     * @generated
     * @ordered
     */
    protected static final int LINE_NUMBER_EDEFAULT = -1;

    /**
     * The cached value of the '{@link #getLineNumber() <em>Line Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLineNumber()
     * @generated
     * @ordered
     */
    protected int lineNumber = LINE_NUMBER_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AppliesToTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.APPLIES_TO_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int getLineNumber() {
        return lineNumber;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLineNumber( int newLineNumber ) {
        int oldLineNumber = lineNumber;
        lineNumber = newLineNumber;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.APPLIES_TO_TYPE__LINE_NUMBER, oldLineNumber, lineNumber ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServiceNsUsage getServiceNsUsage() {
        if( eContainerFeatureID() != NsdPackage.APPLIES_TO_TYPE__SERVICE_NS_USAGE ) return null;
        return ( ServiceNsUsage ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetServiceNsUsage( ServiceNsUsage newServiceNsUsage, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newServiceNsUsage, NsdPackage.APPLIES_TO_TYPE__SERVICE_NS_USAGE,
                msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setServiceNsUsage( ServiceNsUsage newServiceNsUsage ) {
        if( newServiceNsUsage != eInternalContainer()
                || ( eContainerFeatureID() != NsdPackage.APPLIES_TO_TYPE__SERVICE_NS_USAGE
                        && newServiceNsUsage != null ) ) {
            if( EcoreUtil.isAncestor( this, newServiceNsUsage ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) msgs = eBasicRemoveFromContainer( msgs );
            if( newServiceNsUsage != null ) msgs = ( ( InternalEObject ) newServiceNsUsage ).eInverseAdd( this,
                    NsdPackage.SERVICE_NS_USAGE__APPLIES_TO, ServiceNsUsage.class, msgs );
            msgs = basicSetServiceNsUsage( newServiceNsUsage, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.APPLIES_TO_TYPE__SERVICE_NS_USAGE, newServiceNsUsage, newServiceNsUsage ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void buildExplicitLinks() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case NsdPackage.APPLIES_TO_TYPE__SERVICE_NS_USAGE:
            if( eInternalContainer() != null ) msgs = eBasicRemoveFromContainer( msgs );
            return basicSetServiceNsUsage( ( ServiceNsUsage ) otherEnd, msgs );
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
        case NsdPackage.APPLIES_TO_TYPE__SERVICE_NS_USAGE:
            return basicSetServiceNsUsage( null, msgs );
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
        case NsdPackage.APPLIES_TO_TYPE__SERVICE_NS_USAGE:
            return eInternalContainer().eInverseRemove( this, NsdPackage.SERVICE_NS_USAGE__APPLIES_TO,
                    ServiceNsUsage.class, msgs );
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
        case NsdPackage.APPLIES_TO_TYPE__LINE_NUMBER:
            return getLineNumber();
        case NsdPackage.APPLIES_TO_TYPE__SERVICE_NS_USAGE:
            return getServiceNsUsage();
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
        case NsdPackage.APPLIES_TO_TYPE__LINE_NUMBER:
            setLineNumber( ( Integer ) newValue );
            return;
        case NsdPackage.APPLIES_TO_TYPE__SERVICE_NS_USAGE:
            setServiceNsUsage( ( ServiceNsUsage ) newValue );
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
        case NsdPackage.APPLIES_TO_TYPE__LINE_NUMBER:
            setLineNumber( LINE_NUMBER_EDEFAULT );
            return;
        case NsdPackage.APPLIES_TO_TYPE__SERVICE_NS_USAGE:
            setServiceNsUsage( ( ServiceNsUsage ) null );
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
        case NsdPackage.APPLIES_TO_TYPE__LINE_NUMBER:
            return lineNumber != LINE_NUMBER_EDEFAULT;
        case NsdPackage.APPLIES_TO_TYPE__SERVICE_NS_USAGE:
            return getServiceNsUsage() != null;
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
        if( baseClass == NsdObject.class ) {
            switch( derivedFeatureID ) {
            case NsdPackage.APPLIES_TO_TYPE__LINE_NUMBER:
                return NsdPackage.NSD_OBJECT__LINE_NUMBER;
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
        if( baseClass == NsdObject.class ) {
            switch( baseFeatureID ) {
            case NsdPackage.NSD_OBJECT__LINE_NUMBER:
                return NsdPackage.APPLIES_TO_TYPE__LINE_NUMBER;
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
        if( baseClass == NsdObject.class ) {
            switch( baseOperationID ) {
            case NsdPackage.NSD_OBJECT___BUILD_EXPLICIT_LINKS:
                return NsdPackage.APPLIES_TO_TYPE___BUILD_EXPLICIT_LINKS;
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
    public Object eInvoke( int operationID, EList< ? > arguments ) throws InvocationTargetException {
        switch( operationID ) {
        case NsdPackage.APPLIES_TO_TYPE___BUILD_EXPLICIT_LINKS:
            buildExplicitLinks();
            return null;
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
        result.append( " (lineNumber: " );
        result.append( lineNumber );
        result.append( ')' );
        return result.toString();
    }

} //AppliesToTypeImpl
