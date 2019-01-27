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

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentRoot;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TApplicableServiceNS;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCopyrightNotice;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNSDoc;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS;

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
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DocumentRootImpl#getCopyright <em>Copyright</em>}</li>
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
    public TApplicableServiceNS getApplicableServiceNS() {
        return ( TApplicableServiceNS ) getMixed().get( NsdPackage.Literals.DOCUMENT_ROOT__APPLICABLE_SERVICE_NS,
                true );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetApplicableServiceNS( TApplicableServiceNS newApplicableServiceNS,
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
    public void setApplicableServiceNS( TApplicableServiceNS newApplicableServiceNS ) {
        ( ( FeatureMap.Internal ) getMixed() ).set( NsdPackage.Literals.DOCUMENT_ROOT__APPLICABLE_SERVICE_NS,
                newApplicableServiceNS );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TCopyrightNotice getCopyright() {
        return ( TCopyrightNotice ) getMixed().get( NsdPackage.Literals.DOCUMENT_ROOT__COPYRIGHT, true );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCopyright( TCopyrightNotice newCopyright, NotificationChain msgs ) {
        return ( ( FeatureMap.Internal ) getMixed() ).basicAdd( NsdPackage.Literals.DOCUMENT_ROOT__COPYRIGHT,
                newCopyright, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCopyright( TCopyrightNotice newCopyright ) {
        ( ( FeatureMap.Internal ) getMixed() ).set( NsdPackage.Literals.DOCUMENT_ROOT__COPYRIGHT, newCopyright );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TNS getNS() {
        return ( TNS ) getMixed().get( NsdPackage.Literals.DOCUMENT_ROOT__NS, true );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetNS( TNS newNS, NotificationChain msgs ) {
        return ( ( FeatureMap.Internal ) getMixed() ).basicAdd( NsdPackage.Literals.DOCUMENT_ROOT__NS, newNS, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNS( TNS newNS ) {
        ( ( FeatureMap.Internal ) getMixed() ).set( NsdPackage.Literals.DOCUMENT_ROOT__NS, newNS );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TNSDoc getNSDoc() {
        return ( TNSDoc ) getMixed().get( NsdPackage.Literals.DOCUMENT_ROOT__NS_DOC, true );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetNSDoc( TNSDoc newNSDoc, NotificationChain msgs ) {
        return ( ( FeatureMap.Internal ) getMixed() ).basicAdd( NsdPackage.Literals.DOCUMENT_ROOT__NS_DOC, newNSDoc,
                msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNSDoc( TNSDoc newNSDoc ) {
        ( ( FeatureMap.Internal ) getMixed() ).set( NsdPackage.Literals.DOCUMENT_ROOT__NS_DOC, newNSDoc );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TServiceNS getServiceNS() {
        return ( TServiceNS ) getMixed().get( NsdPackage.Literals.DOCUMENT_ROOT__SERVICE_NS, true );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetServiceNS( TServiceNS newServiceNS, NotificationChain msgs ) {
        return ( ( FeatureMap.Internal ) getMixed() ).basicAdd( NsdPackage.Literals.DOCUMENT_ROOT__SERVICE_NS,
                newServiceNS, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setServiceNS( TServiceNS newServiceNS ) {
        ( ( FeatureMap.Internal ) getMixed() ).set( NsdPackage.Literals.DOCUMENT_ROOT__SERVICE_NS, newServiceNS );
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
            return basicSetApplicableServiceNS( null, msgs );
        case NsdPackage.DOCUMENT_ROOT__COPYRIGHT:
            return basicSetCopyright( null, msgs );
        case NsdPackage.DOCUMENT_ROOT__NS:
            return basicSetNS( null, msgs );
        case NsdPackage.DOCUMENT_ROOT__NS_DOC:
            return basicSetNSDoc( null, msgs );
        case NsdPackage.DOCUMENT_ROOT__SERVICE_NS:
            return basicSetServiceNS( null, msgs );
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
        case NsdPackage.DOCUMENT_ROOT__COPYRIGHT:
            return getCopyright();
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
            setApplicableServiceNS( ( TApplicableServiceNS ) newValue );
            return;
        case NsdPackage.DOCUMENT_ROOT__COPYRIGHT:
            setCopyright( ( TCopyrightNotice ) newValue );
            return;
        case NsdPackage.DOCUMENT_ROOT__NS:
            setNS( ( TNS ) newValue );
            return;
        case NsdPackage.DOCUMENT_ROOT__NS_DOC:
            setNSDoc( ( TNSDoc ) newValue );
            return;
        case NsdPackage.DOCUMENT_ROOT__SERVICE_NS:
            setServiceNS( ( TServiceNS ) newValue );
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
            setApplicableServiceNS( ( TApplicableServiceNS ) null );
            return;
        case NsdPackage.DOCUMENT_ROOT__COPYRIGHT:
            setCopyright( ( TCopyrightNotice ) null );
            return;
        case NsdPackage.DOCUMENT_ROOT__NS:
            setNS( ( TNS ) null );
            return;
        case NsdPackage.DOCUMENT_ROOT__NS_DOC:
            setNSDoc( ( TNSDoc ) null );
            return;
        case NsdPackage.DOCUMENT_ROOT__SERVICE_NS:
            setServiceNS( ( TServiceNS ) null );
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
            return getApplicableServiceNS() != null;
        case NsdPackage.DOCUMENT_ROOT__COPYRIGHT:
            return getCopyright() != null;
        case NsdPackage.DOCUMENT_ROOT__NS:
            return getNS() != null;
        case NsdPackage.DOCUMENT_ROOT__NS_DOC:
            return getNSDoc() != null;
        case NsdPackage.DOCUMENT_ROOT__SERVICE_NS:
            return getServiceNS() != null;
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
