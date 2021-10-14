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

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServiceNS;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentRoot;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DocumentRootImpl#getApplicableServiceNS <em>Applicable Service NS</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DocumentRootImpl#getNS <em>NS</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DocumentRootImpl#getNSDoc <em>NS Doc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DocumentRootImpl#getServiceNS <em>Service NS</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
    /**
     * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMixed()
     * @generated
     * @ordered
     */
    protected FeatureMap mixed;

    /**
     * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXMLNSPrefixMap()
     * @generated
     * @ordered
     */
    protected EMap< String, String > xMLNSPrefixMap;

    /**
     * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXSISchemaLocation()
     * @generated
     * @ordered
     */
    protected EMap< String, String > xSISchemaLocation;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DocumentRootImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.DOCUMENT_ROOT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FeatureMap getMixed() {
        if( mixed == null ) {
            mixed = new BasicFeatureMap( this, NsdPackage.DOCUMENT_ROOT__MIXED );
        }
        return mixed;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EMap< String, String > getXMLNSPrefixMap() {
        if( xMLNSPrefixMap == null ) {
            xMLNSPrefixMap = new EcoreEMap< String, String >( EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY,
                    EStringToStringMapEntryImpl.class, this, NsdPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP );
        }
        return xMLNSPrefixMap;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EMap< String, String > getXSISchemaLocation() {
        if( xSISchemaLocation == null ) {
            xSISchemaLocation = new EcoreEMap< String, String >( EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY,
                    EStringToStringMapEntryImpl.class, this, NsdPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION );
        }
        return xSISchemaLocation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ApplicableServiceNS getApplicableServiceNS() {
        return ( ApplicableServiceNS ) getMixed().get( NsdPackage.Literals.DOCUMENT_ROOT__APPLICABLE_SERVICE_NS, true );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetApplicableServiceNS( ApplicableServiceNS newApplicableServiceNS,
            NotificationChain msgs ) {
        return ( ( FeatureMap.Internal ) getMixed() )
                .basicAdd( NsdPackage.Literals.DOCUMENT_ROOT__APPLICABLE_SERVICE_NS, newApplicableServiceNS, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setApplicableServiceNS( ApplicableServiceNS newApplicableServiceNS ) {
        ( ( FeatureMap.Internal ) getMixed() ).set( NsdPackage.Literals.DOCUMENT_ROOT__APPLICABLE_SERVICE_NS,
                newApplicableServiceNS );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetApplicableServiceNS( NotificationChain msgs ) {
        // TODO: implement this method to unset the contained 'Applicable Service NS' containment reference
        // -> this method is automatically invoked to keep the containment relationship in synch
        // -> do not modify other features
        // -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetApplicableServiceNS() {
        ( ( FeatureMap.Internal ) getMixed() ).clear( NsdPackage.Literals.DOCUMENT_ROOT__APPLICABLE_SERVICE_NS );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetApplicableServiceNS() {
        return !( ( FeatureMap.Internal ) getMixed() )
                .isEmpty( NsdPackage.Literals.DOCUMENT_ROOT__APPLICABLE_SERVICE_NS );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NS getNS() {
        return ( NS ) getMixed().get( NsdPackage.Literals.DOCUMENT_ROOT__NS, true );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetNS( NS newNS, NotificationChain msgs ) {
        return ( ( FeatureMap.Internal ) getMixed() ).basicAdd( NsdPackage.Literals.DOCUMENT_ROOT__NS, newNS, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNS( NS newNS ) {
        ( ( FeatureMap.Internal ) getMixed() ).set( NsdPackage.Literals.DOCUMENT_ROOT__NS, newNS );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetNS( NotificationChain msgs ) {
        // TODO: implement this method to unset the contained 'NS' containment reference
        // -> this method is automatically invoked to keep the containment relationship in synch
        // -> do not modify other features
        // -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNS() {
        ( ( FeatureMap.Internal ) getMixed() ).clear( NsdPackage.Literals.DOCUMENT_ROOT__NS );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNS() {
        return !( ( FeatureMap.Internal ) getMixed() ).isEmpty( NsdPackage.Literals.DOCUMENT_ROOT__NS );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NSDoc getNSDoc() {
        return ( NSDoc ) getMixed().get( NsdPackage.Literals.DOCUMENT_ROOT__NS_DOC, true );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetNSDoc( NSDoc newNSDoc, NotificationChain msgs ) {
        return ( ( FeatureMap.Internal ) getMixed() ).basicAdd( NsdPackage.Literals.DOCUMENT_ROOT__NS_DOC, newNSDoc,
                msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNSDoc( NSDoc newNSDoc ) {
        ( ( FeatureMap.Internal ) getMixed() ).set( NsdPackage.Literals.DOCUMENT_ROOT__NS_DOC, newNSDoc );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetNSDoc( NotificationChain msgs ) {
        // TODO: implement this method to unset the contained 'NS Doc' containment reference
        // -> this method is automatically invoked to keep the containment relationship in synch
        // -> do not modify other features
        // -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNSDoc() {
        ( ( FeatureMap.Internal ) getMixed() ).clear( NsdPackage.Literals.DOCUMENT_ROOT__NS_DOC );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNSDoc() {
        return !( ( FeatureMap.Internal ) getMixed() ).isEmpty( NsdPackage.Literals.DOCUMENT_ROOT__NS_DOC );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServiceNS getServiceNS() {
        return ( ServiceNS ) getMixed().get( NsdPackage.Literals.DOCUMENT_ROOT__SERVICE_NS, true );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetServiceNS( ServiceNS newServiceNS, NotificationChain msgs ) {
        return ( ( FeatureMap.Internal ) getMixed() ).basicAdd( NsdPackage.Literals.DOCUMENT_ROOT__SERVICE_NS,
                newServiceNS, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setServiceNS( ServiceNS newServiceNS ) {
        ( ( FeatureMap.Internal ) getMixed() ).set( NsdPackage.Literals.DOCUMENT_ROOT__SERVICE_NS, newServiceNS );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetServiceNS( NotificationChain msgs ) {
        // TODO: implement this method to unset the contained 'Service NS' containment reference
        // -> this method is automatically invoked to keep the containment relationship in synch
        // -> do not modify other features
        // -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetServiceNS() {
        ( ( FeatureMap.Internal ) getMixed() ).clear( NsdPackage.Literals.DOCUMENT_ROOT__SERVICE_NS );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetServiceNS() {
        return !( ( FeatureMap.Internal ) getMixed() ).isEmpty( NsdPackage.Literals.DOCUMENT_ROOT__SERVICE_NS );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case NsdPackage.DOCUMENT_ROOT__MIXED:
            return ( ( InternalEList< ? > ) getMixed() ).basicRemove( otherEnd, msgs );
        case NsdPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
            return ( ( InternalEList< ? > ) getXMLNSPrefixMap() ).basicRemove( otherEnd, msgs );
        case NsdPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
            return ( ( InternalEList< ? > ) getXSISchemaLocation() ).basicRemove( otherEnd, msgs );
        case NsdPackage.DOCUMENT_ROOT__APPLICABLE_SERVICE_NS:
            return basicUnsetApplicableServiceNS( msgs );
        case NsdPackage.DOCUMENT_ROOT__NS:
            return basicUnsetNS( msgs );
        case NsdPackage.DOCUMENT_ROOT__NS_DOC:
            return basicUnsetNSDoc( msgs );
        case NsdPackage.DOCUMENT_ROOT__SERVICE_NS:
            return basicUnsetServiceNS( msgs );
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
        case NsdPackage.DOCUMENT_ROOT__MIXED:
            if( coreType ) return getMixed();
            return ( ( FeatureMap.Internal ) getMixed() ).getWrapper();
        case NsdPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
            if( coreType )
                return getXMLNSPrefixMap();
            else
                return getXMLNSPrefixMap().map();
        case NsdPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
            if( coreType )
                return getXSISchemaLocation();
            else
                return getXSISchemaLocation().map();
        case NsdPackage.DOCUMENT_ROOT__APPLICABLE_SERVICE_NS:
            return getApplicableServiceNS();
        case NsdPackage.DOCUMENT_ROOT__NS:
            return getNS();
        case NsdPackage.DOCUMENT_ROOT__NS_DOC:
            return getNSDoc();
        case NsdPackage.DOCUMENT_ROOT__SERVICE_NS:
            return getServiceNS();
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
        case NsdPackage.DOCUMENT_ROOT__MIXED:
            ( ( FeatureMap.Internal ) getMixed() ).set( newValue );
            return;
        case NsdPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
            ( ( EStructuralFeature.Setting ) getXMLNSPrefixMap() ).set( newValue );
            return;
        case NsdPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
            ( ( EStructuralFeature.Setting ) getXSISchemaLocation() ).set( newValue );
            return;
        case NsdPackage.DOCUMENT_ROOT__APPLICABLE_SERVICE_NS:
            setApplicableServiceNS( ( ApplicableServiceNS ) newValue );
            return;
        case NsdPackage.DOCUMENT_ROOT__NS:
            setNS( ( NS ) newValue );
            return;
        case NsdPackage.DOCUMENT_ROOT__NS_DOC:
            setNSDoc( ( NSDoc ) newValue );
            return;
        case NsdPackage.DOCUMENT_ROOT__SERVICE_NS:
            setServiceNS( ( ServiceNS ) newValue );
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
        case NsdPackage.DOCUMENT_ROOT__MIXED:
            getMixed().clear();
            return;
        case NsdPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
            getXMLNSPrefixMap().clear();
            return;
        case NsdPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
            getXSISchemaLocation().clear();
            return;
        case NsdPackage.DOCUMENT_ROOT__APPLICABLE_SERVICE_NS:
            unsetApplicableServiceNS();
            return;
        case NsdPackage.DOCUMENT_ROOT__NS:
            unsetNS();
            return;
        case NsdPackage.DOCUMENT_ROOT__NS_DOC:
            unsetNSDoc();
            return;
        case NsdPackage.DOCUMENT_ROOT__SERVICE_NS:
            unsetServiceNS();
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
        case NsdPackage.DOCUMENT_ROOT__MIXED:
            return mixed != null && !mixed.isEmpty();
        case NsdPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
            return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
        case NsdPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
            return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
        case NsdPackage.DOCUMENT_ROOT__APPLICABLE_SERVICE_NS:
            return isSetApplicableServiceNS();
        case NsdPackage.DOCUMENT_ROOT__NS:
            return isSetNS();
        case NsdPackage.DOCUMENT_ROOT__NS_DOC:
            return isSetNSDoc();
        case NsdPackage.DOCUMENT_ROOT__SERVICE_NS:
            return isSetServiceNS();
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
        result.append( " (mixed: " );
        result.append( mixed );
        result.append( ')' );
        return result.toString();
    }

} //DocumentRootImpl
