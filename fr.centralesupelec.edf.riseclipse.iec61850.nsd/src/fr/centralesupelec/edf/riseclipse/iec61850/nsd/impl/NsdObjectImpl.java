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

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdObject;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;

import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdObjectImpl#getLineNumber <em>Line Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdObjectImpl#isExplicitLinksBuilt <em>Explicit Links Built</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class NsdObjectImpl extends MinimalEObjectImpl.Container implements NsdObject {
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
     * The default value of the '{@link #isExplicitLinksBuilt() <em>Explicit Links Built</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isExplicitLinksBuilt()
     * @generated
     * @ordered
     */
    protected static final boolean EXPLICIT_LINKS_BUILT_EDEFAULT = false;
    /**
     * The cached value of the '{@link #isExplicitLinksBuilt() <em>Explicit Links Built</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isExplicitLinksBuilt()
     * @generated
     * @ordered
     */
    protected boolean explicitLinksBuilt = EXPLICIT_LINKS_BUILT_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected NsdObjectImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.NSD_OBJECT;
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.NSD_OBJECT__LINE_NUMBER, oldLineNumber,
                    lineNumber ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isExplicitLinksBuilt() {
        return explicitLinksBuilt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setExplicitLinksBuilt( boolean newExplicitLinksBuilt ) {
        boolean oldExplicitLinksBuilt = explicitLinksBuilt;
        explicitLinksBuilt = newExplicitLinksBuilt;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.NSD_OBJECT__EXPLICIT_LINKS_BUILT,
                    oldExplicitLinksBuilt, explicitLinksBuilt ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return true if explicit links were already built, false otherwise
     * @generated NOT
     */
    @Override
    public boolean buildExplicitLinks( IRiseClipseConsole console ) {
        if( isExplicitLinksBuilt() ) return true;

        TreeIterator< EObject > it = eAllContents();
        while( it.hasNext() ) {
            EObject o = it.next();
            if( o instanceof NsdObject ) {
                ( ( NsdObject ) o ).buildExplicitLinks( console );
            }
        }

        setExplicitLinksBuilt( true );
        return false;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case NsdPackage.NSD_OBJECT__LINE_NUMBER:
            return getLineNumber();
        case NsdPackage.NSD_OBJECT__EXPLICIT_LINKS_BUILT:
            return isExplicitLinksBuilt();
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
        case NsdPackage.NSD_OBJECT__LINE_NUMBER:
            setLineNumber( ( Integer ) newValue );
            return;
        case NsdPackage.NSD_OBJECT__EXPLICIT_LINKS_BUILT:
            setExplicitLinksBuilt( ( Boolean ) newValue );
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
        case NsdPackage.NSD_OBJECT__LINE_NUMBER:
            setLineNumber( LINE_NUMBER_EDEFAULT );
            return;
        case NsdPackage.NSD_OBJECT__EXPLICIT_LINKS_BUILT:
            setExplicitLinksBuilt( EXPLICIT_LINKS_BUILT_EDEFAULT );
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
        case NsdPackage.NSD_OBJECT__LINE_NUMBER:
            return lineNumber != LINE_NUMBER_EDEFAULT;
        case NsdPackage.NSD_OBJECT__EXPLICIT_LINKS_BUILT:
            return explicitLinksBuilt != EXPLICIT_LINKS_BUILT_EDEFAULT;
        }
        return super.eIsSet( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eInvoke( int operationID, EList< ? > arguments ) throws InvocationTargetException {
        switch( operationID ) {
        case NsdPackage.NSD_OBJECT___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE:
            return buildExplicitLinks( ( IRiseClipseConsole ) arguments.get( 0 ) );
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
        result.append( ", explicitLinksBuilt: " );
        result.append( explicitLinksBuilt );
        result.append( ')' );
        return result.toString();
    }

} //NsdObjectImpl
