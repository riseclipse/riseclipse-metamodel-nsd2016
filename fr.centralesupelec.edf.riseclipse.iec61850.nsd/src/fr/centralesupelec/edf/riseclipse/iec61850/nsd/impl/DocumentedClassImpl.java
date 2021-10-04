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
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentedClass;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.util.NsIdentification;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.util.NsdResourceSetImpl;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Documented Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DocumentedClassImpl#isDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DocumentedClassImpl#getDescID <em>Desc ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DocumentedClassImpl#isInformative <em>Informative</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DocumentedClassImpl#getRefersToDescDoc <em>Refers To Desc Doc</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DocumentedClassImpl extends NsdObjectImpl implements DocumentedClass {
    /**
     * The default value of the '{@link #isDeprecated() <em>Deprecated</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isDeprecated()
     * @generated
     * @ordered
     */
    protected static final boolean DEPRECATED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isDeprecated() <em>Deprecated</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isDeprecated()
     * @generated
     * @ordered
     */
    protected boolean deprecated = DEPRECATED_EDEFAULT;

    /**
     * This is true if the Deprecated attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean deprecatedESet;

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
     * The default value of the '{@link #isInformative() <em>Informative</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isInformative()
     * @generated
     * @ordered
     */
    protected static final boolean INFORMATIVE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isInformative() <em>Informative</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isInformative()
     * @generated
     * @ordered
     */
    protected boolean informative = INFORMATIVE_EDEFAULT;

    /**
     * This is true if the Informative attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean informativeESet;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DocumentedClassImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.DOCUMENTED_CLASS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isDeprecated() {
        return deprecated;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDeprecated( boolean newDeprecated ) {
        boolean oldDeprecated = deprecated;
        deprecated = newDeprecated;
        boolean oldDeprecatedESet = deprecatedESet;
        deprecatedESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.DOCUMENTED_CLASS__DEPRECATED,
                    oldDeprecated, deprecated, !oldDeprecatedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDeprecated() {
        boolean oldDeprecated = deprecated;
        boolean oldDeprecatedESet = deprecatedESet;
        deprecated = DEPRECATED_EDEFAULT;
        deprecatedESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.DOCUMENTED_CLASS__DEPRECATED,
                    oldDeprecated, DEPRECATED_EDEFAULT, oldDeprecatedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDeprecated() {
        return deprecatedESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.DOCUMENTED_CLASS__DESC_ID, oldDescID,
                    descID, !oldDescIDESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.DOCUMENTED_CLASS__DESC_ID, oldDescID,
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
    public boolean isInformative() {
        return informative;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setInformative( boolean newInformative ) {
        boolean oldInformative = informative;
        informative = newInformative;
        boolean oldInformativeESet = informativeESet;
        informativeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.DOCUMENTED_CLASS__INFORMATIVE,
                    oldInformative, informative, !oldInformativeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetInformative() {
        boolean oldInformative = informative;
        boolean oldInformativeESet = informativeESet;
        informative = INFORMATIVE_EDEFAULT;
        informativeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.DOCUMENTED_CLASS__INFORMATIVE,
                    oldInformative, INFORMATIVE_EDEFAULT, oldInformativeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetInformative() {
        return informativeESet;
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
                    NsdPackage.DOCUMENTED_CLASS__REFERS_TO_DESC_DOC, oldRefersToDescDoc, newRefersToDescDoc,
                    !oldRefersToDescDocESet );
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
    public void setRefersToDescDoc( Doc newRefersToDescDoc ) {
        if( newRefersToDescDoc != refersToDescDoc ) {
            NotificationChain msgs = null;
            if( refersToDescDoc != null )
                msgs = ( ( InternalEObject ) refersToDescDoc ).eInverseRemove( this,
                        NsdPackage.DOC__REFERRED_BY_DOCUMENTED_CLASS, Doc.class, msgs );
            if( newRefersToDescDoc != null )
                msgs = ( ( InternalEObject ) newRefersToDescDoc ).eInverseAdd( this,
                        NsdPackage.DOC__REFERRED_BY_DOCUMENTED_CLASS, Doc.class, msgs );
            msgs = basicSetRefersToDescDoc( newRefersToDescDoc, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToDescDocESet = refersToDescDocESet;
            refersToDescDocESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.DOCUMENTED_CLASS__REFERS_TO_DESC_DOC,
                        newRefersToDescDoc, newRefersToDescDoc, !oldRefersToDescDocESet ) );
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
                    NsdPackage.DOCUMENTED_CLASS__REFERS_TO_DESC_DOC, oldRefersToDescDoc, null, oldRefersToDescDocESet );
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
    public void unsetRefersToDescDoc() {
        if( refersToDescDoc != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToDescDoc ).eInverseRemove( this,
                    NsdPackage.DOC__REFERRED_BY_DOCUMENTED_CLASS, Doc.class, msgs );
            msgs = basicUnsetRefersToDescDoc( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToDescDocESet = refersToDescDocESet;
            refersToDescDocESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        NsdPackage.DOCUMENTED_CLASS__REFERS_TO_DESC_DOC, null, null, oldRefersToDescDocESet ) );
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
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case NsdPackage.DOCUMENTED_CLASS__REFERS_TO_DESC_DOC:
            if( refersToDescDoc != null )
                msgs = ( ( InternalEObject ) refersToDescDoc ).eInverseRemove( this,
                        NsdPackage.DOC__REFERRED_BY_DOCUMENTED_CLASS, Doc.class, msgs );
            return basicSetRefersToDescDoc( ( Doc ) otherEnd, msgs );
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
        case NsdPackage.DOCUMENTED_CLASS__REFERS_TO_DESC_DOC:
            return basicUnsetRefersToDescDoc( msgs );
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
        case NsdPackage.DOCUMENTED_CLASS__DEPRECATED:
            return isDeprecated();
        case NsdPackage.DOCUMENTED_CLASS__DESC_ID:
            return getDescID();
        case NsdPackage.DOCUMENTED_CLASS__INFORMATIVE:
            return isInformative();
        case NsdPackage.DOCUMENTED_CLASS__REFERS_TO_DESC_DOC:
            return getRefersToDescDoc();
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
        case NsdPackage.DOCUMENTED_CLASS__DEPRECATED:
            setDeprecated( ( Boolean ) newValue );
            return;
        case NsdPackage.DOCUMENTED_CLASS__DESC_ID:
            setDescID( ( String ) newValue );
            return;
        case NsdPackage.DOCUMENTED_CLASS__INFORMATIVE:
            setInformative( ( Boolean ) newValue );
            return;
        case NsdPackage.DOCUMENTED_CLASS__REFERS_TO_DESC_DOC:
            setRefersToDescDoc( ( Doc ) newValue );
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
        case NsdPackage.DOCUMENTED_CLASS__DEPRECATED:
            unsetDeprecated();
            return;
        case NsdPackage.DOCUMENTED_CLASS__DESC_ID:
            unsetDescID();
            return;
        case NsdPackage.DOCUMENTED_CLASS__INFORMATIVE:
            unsetInformative();
            return;
        case NsdPackage.DOCUMENTED_CLASS__REFERS_TO_DESC_DOC:
            unsetRefersToDescDoc();
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
        case NsdPackage.DOCUMENTED_CLASS__DEPRECATED:
            return isSetDeprecated();
        case NsdPackage.DOCUMENTED_CLASS__DESC_ID:
            return isSetDescID();
        case NsdPackage.DOCUMENTED_CLASS__INFORMATIVE:
            return isSetInformative();
        case NsdPackage.DOCUMENTED_CLASS__REFERS_TO_DESC_DOC:
            return isSetRefersToDescDoc();
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
        result.append( " (deprecated: " );
        if( deprecatedESet )
            result.append( deprecated );
        else
            result.append( "<unset>" );
        result.append( ", descID: " );
        if( descIDESet )
            result.append( descID );
        else
            result.append( "<unset>" );
        result.append( ", informative: " );
        if( informativeESet )
            result.append( informative );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

    @Override
    public boolean buildExplicitLinks( IRiseClipseConsole console, boolean forceUpdate ) {
        if( super.buildExplicitLinks( console, forceUpdate ) ) return true;

        if( isSetDescID() ) {
            if( this.eResource().getResourceSet() instanceof NsdResourceSetImpl ) {
                Doc doc = ( ( NsdResourceSetImpl ) this.eResource().getResourceSet() ).findDoc( getNsIdentification(),
                        getDescID() );
                if( doc != null ) setRefersToDescDoc( doc );
            }
        }

        return false;
    }

    public abstract NsIdentification getNsIdentification();

} //DocumentedClassImpl
