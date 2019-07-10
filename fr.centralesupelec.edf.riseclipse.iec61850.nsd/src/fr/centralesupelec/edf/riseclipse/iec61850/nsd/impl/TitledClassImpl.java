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

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TitledClass;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.util.NsdResourceSetImpl;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Titled Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TitledClassImpl#getTitleID <em>Title ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TitledClassImpl#getRefersToTitleDoc <em>Refers To Title Doc</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TitledClassImpl extends DocumentedClassImpl implements TitledClass {
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
    protected TitledClassImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.TITLED_CLASS;
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.TITLED_CLASS__TITLE_ID, oldTitleID,
                    titleID, !oldTitleIDESet ) );
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.TITLED_CLASS__TITLE_ID, oldTitleID,
                    TITLE_ID_EDEFAULT, oldTitleIDESet ) );
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
                    NsdPackage.TITLED_CLASS__REFERS_TO_TITLE_DOC, oldRefersToTitleDoc, newRefersToTitleDoc,
                    !oldRefersToTitleDocESet );
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
    public void setRefersToTitleDoc( Doc newRefersToTitleDoc ) {
        if( newRefersToTitleDoc != refersToTitleDoc ) {
            NotificationChain msgs = null;
            if( refersToTitleDoc != null )
                msgs = ( ( InternalEObject ) refersToTitleDoc ).eInverseRemove( this,
                        NsdPackage.DOC__REFERRED_BY_TITLED_CLASS, Doc.class, msgs );
            if( newRefersToTitleDoc != null )
                msgs = ( ( InternalEObject ) newRefersToTitleDoc ).eInverseAdd( this,
                        NsdPackage.DOC__REFERRED_BY_TITLED_CLASS, Doc.class, msgs );
            msgs = basicSetRefersToTitleDoc( newRefersToTitleDoc, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToTitleDocESet = refersToTitleDocESet;
            refersToTitleDocESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.TITLED_CLASS__REFERS_TO_TITLE_DOC,
                        newRefersToTitleDoc, newRefersToTitleDoc, !oldRefersToTitleDocESet ) );
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
                    NsdPackage.TITLED_CLASS__REFERS_TO_TITLE_DOC, oldRefersToTitleDoc, null, oldRefersToTitleDocESet );
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
    public void unsetRefersToTitleDoc() {
        if( refersToTitleDoc != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToTitleDoc ).eInverseRemove( this,
                    NsdPackage.DOC__REFERRED_BY_TITLED_CLASS, Doc.class, msgs );
            msgs = basicUnsetRefersToTitleDoc( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToTitleDocESet = refersToTitleDocESet;
            refersToTitleDocESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.TITLED_CLASS__REFERS_TO_TITLE_DOC,
                        null, null, oldRefersToTitleDocESet ) );
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
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case NsdPackage.TITLED_CLASS__REFERS_TO_TITLE_DOC:
            if( refersToTitleDoc != null )
                msgs = ( ( InternalEObject ) refersToTitleDoc ).eInverseRemove( this,
                        NsdPackage.DOC__REFERRED_BY_TITLED_CLASS, Doc.class, msgs );
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
        case NsdPackage.TITLED_CLASS__REFERS_TO_TITLE_DOC:
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
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case NsdPackage.TITLED_CLASS__TITLE_ID:
            return getTitleID();
        case NsdPackage.TITLED_CLASS__REFERS_TO_TITLE_DOC:
            return getRefersToTitleDoc();
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
        case NsdPackage.TITLED_CLASS__TITLE_ID:
            setTitleID( ( String ) newValue );
            return;
        case NsdPackage.TITLED_CLASS__REFERS_TO_TITLE_DOC:
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
        case NsdPackage.TITLED_CLASS__TITLE_ID:
            unsetTitleID();
            return;
        case NsdPackage.TITLED_CLASS__REFERS_TO_TITLE_DOC:
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
        case NsdPackage.TITLED_CLASS__TITLE_ID:
            return isSetTitleID();
        case NsdPackage.TITLED_CLASS__REFERS_TO_TITLE_DOC:
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
    public String toString() {
        if( eIsProxy() ) return super.toString();

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (titleID: " );
        if( titleIDESet )
            result.append( titleID );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

    @Override
    public boolean buildExplicitLinks( IRiseClipseConsole console, boolean forceUpdate ) {
        if( super.buildExplicitLinks( console, forceUpdate ) ) return true;

        if( isSetTitleID() ) {
            if( this.eResource().getResourceSet() instanceof NsdResourceSetImpl ) {
                Doc doc = ( ( NsdResourceSetImpl ) this.eResource().getResourceSet() ).findDoc( getNsIdentification(),
                        getTitleID() );
                if( doc != null ) setRefersToTitleDoc( doc );
            }
        }

        return false;
    }

} //TitledClassImpl
