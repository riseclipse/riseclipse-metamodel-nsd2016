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

import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.DefinedAttributeTypeKind;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdFactory;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceConstructedAttribute;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceConstructedAttributes;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.util.NsIdentification;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.util.NsIdentificationName;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Constructed Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceConstructedAttributeImpl#isTypeKindParameterized <em>Type Kind Parameterized</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceConstructedAttributeImpl#getParentServiceConstructedAttributes <em>Parent Service Constructed Attributes</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceConstructedAttributeImpl#getParameterizedSubDataAttributeNames <em>Parameterized Sub Data Attribute Names</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceConstructedAttributeImpl extends ConstructedAttributeImpl implements ServiceConstructedAttribute {
    /**
     * The default value of the '{@link #isTypeKindParameterized() <em>Type Kind Parameterized</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isTypeKindParameterized()
     * @generated
     * @ordered
     */
    protected static final boolean TYPE_KIND_PARAMETERIZED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isTypeKindParameterized() <em>Type Kind Parameterized</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isTypeKindParameterized()
     * @generated
     * @ordered
     */
    protected boolean typeKindParameterized = TYPE_KIND_PARAMETERIZED_EDEFAULT;

    /**
     * This is true if the Type Kind Parameterized attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean typeKindParameterizedESet;

    /**
     * The cached value of the '{@link #getParameterizedSubDataAttributeNames() <em>Parameterized Sub Data Attribute Names</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParameterizedSubDataAttributeNames()
     * @generated
     * @ordered
     */
    protected EList< String > parameterizedSubDataAttributeNames;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ServiceConstructedAttributeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.SERVICE_CONSTRUCTED_ATTRIBUTE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isTypeKindParameterized() {
        return typeKindParameterized;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTypeKindParameterized( boolean newTypeKindParameterized ) {
        boolean oldTypeKindParameterized = typeKindParameterized;
        typeKindParameterized = newTypeKindParameterized;
        boolean oldTypeKindParameterizedESet = typeKindParameterizedESet;
        typeKindParameterizedESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    NsdPackage.SERVICE_CONSTRUCTED_ATTRIBUTE__TYPE_KIND_PARAMETERIZED, oldTypeKindParameterized,
                    typeKindParameterized, !oldTypeKindParameterizedESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTypeKindParameterized() {
        boolean oldTypeKindParameterized = typeKindParameterized;
        boolean oldTypeKindParameterizedESet = typeKindParameterizedESet;
        typeKindParameterized = TYPE_KIND_PARAMETERIZED_EDEFAULT;
        typeKindParameterizedESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    NsdPackage.SERVICE_CONSTRUCTED_ATTRIBUTE__TYPE_KIND_PARAMETERIZED, oldTypeKindParameterized,
                    TYPE_KIND_PARAMETERIZED_EDEFAULT, oldTypeKindParameterizedESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTypeKindParameterized() {
        return typeKindParameterizedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServiceConstructedAttributes getParentServiceConstructedAttributes() {
        if( eContainerFeatureID() != NsdPackage.SERVICE_CONSTRUCTED_ATTRIBUTE__PARENT_SERVICE_CONSTRUCTED_ATTRIBUTES ) {
            return null;
        }
        return ( ServiceConstructedAttributes ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentServiceConstructedAttributes(
            ServiceConstructedAttributes newParentServiceConstructedAttributes, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentServiceConstructedAttributes,
                NsdPackage.SERVICE_CONSTRUCTED_ATTRIBUTE__PARENT_SERVICE_CONSTRUCTED_ATTRIBUTES, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentServiceConstructedAttributes(
            ServiceConstructedAttributes newParentServiceConstructedAttributes ) {
        if( newParentServiceConstructedAttributes != eInternalContainer()
                || ( eContainerFeatureID() != NsdPackage.SERVICE_CONSTRUCTED_ATTRIBUTE__PARENT_SERVICE_CONSTRUCTED_ATTRIBUTES
                        && newParentServiceConstructedAttributes != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentServiceConstructedAttributes ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentServiceConstructedAttributes != null ) {
                msgs = ( ( InternalEObject ) newParentServiceConstructedAttributes ).eInverseAdd( this,
                        NsdPackage.SERVICE_CONSTRUCTED_ATTRIBUTES__SERVICE_CONSTRUCTED_ATTRIBUTE,
                        ServiceConstructedAttributes.class, msgs );
            }
            msgs = basicSetParentServiceConstructedAttributes( newParentServiceConstructedAttributes, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    NsdPackage.SERVICE_CONSTRUCTED_ATTRIBUTE__PARENT_SERVICE_CONSTRUCTED_ATTRIBUTES,
                    newParentServiceConstructedAttributes, newParentServiceConstructedAttributes ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< String > getParameterizedSubDataAttributeNames() {
        if( parameterizedSubDataAttributeNames == null ) {
            parameterizedSubDataAttributeNames = new EDataTypeUniqueEList.Unsettable< >( String.class, this,
                    NsdPackage.SERVICE_CONSTRUCTED_ATTRIBUTE__PARAMETERIZED_SUB_DATA_ATTRIBUTE_NAMES );
        }
        return parameterizedSubDataAttributeNames;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetParameterizedSubDataAttributeNames() {
        if( parameterizedSubDataAttributeNames != null ) {
            ( ( InternalEList.Unsettable< ? > ) parameterizedSubDataAttributeNames ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetParameterizedSubDataAttributeNames() {
        return parameterizedSubDataAttributeNames != null
                && ( ( InternalEList.Unsettable< ? > ) parameterizedSubDataAttributeNames ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case NsdPackage.SERVICE_CONSTRUCTED_ATTRIBUTE__PARENT_SERVICE_CONSTRUCTED_ATTRIBUTES:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentServiceConstructedAttributes( ( ServiceConstructedAttributes ) otherEnd, msgs );
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
        case NsdPackage.SERVICE_CONSTRUCTED_ATTRIBUTE__PARENT_SERVICE_CONSTRUCTED_ATTRIBUTES:
            return basicSetParentServiceConstructedAttributes( null, msgs );
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
        case NsdPackage.SERVICE_CONSTRUCTED_ATTRIBUTE__PARENT_SERVICE_CONSTRUCTED_ATTRIBUTES:
            return eInternalContainer().eInverseRemove( this,
                    NsdPackage.SERVICE_CONSTRUCTED_ATTRIBUTES__SERVICE_CONSTRUCTED_ATTRIBUTE,
                    ServiceConstructedAttributes.class, msgs );
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
        case NsdPackage.SERVICE_CONSTRUCTED_ATTRIBUTE__TYPE_KIND_PARAMETERIZED:
            return isTypeKindParameterized();
        case NsdPackage.SERVICE_CONSTRUCTED_ATTRIBUTE__PARENT_SERVICE_CONSTRUCTED_ATTRIBUTES:
            return getParentServiceConstructedAttributes();
        case NsdPackage.SERVICE_CONSTRUCTED_ATTRIBUTE__PARAMETERIZED_SUB_DATA_ATTRIBUTE_NAMES:
            return getParameterizedSubDataAttributeNames();
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
        case NsdPackage.SERVICE_CONSTRUCTED_ATTRIBUTE__TYPE_KIND_PARAMETERIZED:
            setTypeKindParameterized( ( Boolean ) newValue );
            return;
        case NsdPackage.SERVICE_CONSTRUCTED_ATTRIBUTE__PARENT_SERVICE_CONSTRUCTED_ATTRIBUTES:
            setParentServiceConstructedAttributes( ( ServiceConstructedAttributes ) newValue );
            return;
        case NsdPackage.SERVICE_CONSTRUCTED_ATTRIBUTE__PARAMETERIZED_SUB_DATA_ATTRIBUTE_NAMES:
            getParameterizedSubDataAttributeNames().clear();
            getParameterizedSubDataAttributeNames().addAll( ( Collection< ? extends String > ) newValue );
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
        case NsdPackage.SERVICE_CONSTRUCTED_ATTRIBUTE__TYPE_KIND_PARAMETERIZED:
            unsetTypeKindParameterized();
            return;
        case NsdPackage.SERVICE_CONSTRUCTED_ATTRIBUTE__PARENT_SERVICE_CONSTRUCTED_ATTRIBUTES:
            setParentServiceConstructedAttributes( ( ServiceConstructedAttributes ) null );
            return;
        case NsdPackage.SERVICE_CONSTRUCTED_ATTRIBUTE__PARAMETERIZED_SUB_DATA_ATTRIBUTE_NAMES:
            unsetParameterizedSubDataAttributeNames();
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
        case NsdPackage.SERVICE_CONSTRUCTED_ATTRIBUTE__TYPE_KIND_PARAMETERIZED:
            return isSetTypeKindParameterized();
        case NsdPackage.SERVICE_CONSTRUCTED_ATTRIBUTE__PARENT_SERVICE_CONSTRUCTED_ATTRIBUTES:
            return getParentServiceConstructedAttributes() != null;
        case NsdPackage.SERVICE_CONSTRUCTED_ATTRIBUTE__PARAMETERIZED_SUB_DATA_ATTRIBUTE_NAMES:
            return isSetParameterizedSubDataAttributeNames();
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
        if( eIsProxy() ) {
            return super.toString();
        }

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (typeKindParameterized: " );
        if( typeKindParameterizedESet ) {
            result.append( typeKindParameterized );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", parameterizedSubDataAttributeNames: " );
        result.append( parameterizedSubDataAttributeNames );
        result.append( ')' );
        return result.toString();
    }

    @Override
    public NsIdentification getNsIdentification() {
        if( getParentServiceConstructedAttributes() != null ) {
            return NsIdentification.of( getParentServiceConstructedAttributes().getParentServiceNS() );
        }
        return super.getNsIdentification();
    }

    //@formatter:off

    // Use only type as key; not typeKind
    private static IdentityHashMap< NsIdentificationName, HashMap< String, ServiceConstructedAttribute >> parameterizedServiceConstructedAttributes = new IdentityHashMap<>();

    public ServiceConstructedAttribute getParameterizedServiceConstructedAttribute(
            DefinedAttributeTypeKind underlyingTypeKind, String underlyingType, NsIdentification nsIdentification, IRiseClipseConsole console ) {
        if( getParameterizedSubDataAttributeNames().isEmpty() ) {
            console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    "ServiceConstructedAttribute ", getName(), " has no parameterized sub data attribute" );
            return this;
        }

        NsIdentificationName key = NsIdentificationName.of( getNsIdentification(), getName() );
        if( ! parameterizedServiceConstructedAttributes.containsKey( key )) {
            parameterizedServiceConstructedAttributes.put( key, new HashMap<>() );
        }
        if( ! parameterizedServiceConstructedAttributes.get( key ).containsKey( underlyingType ) ) {
            ServiceConstructedAttribute pSCA = EcoreUtil.copy( this );
            pSCA.setFilename( getFilename() );
            NS ns = getResourceSet().getNS( nsIdentification );
            if( ns.getConstructedAttributes() == null ) {
                ns.setConstructedAttributes( NsdFactory.eINSTANCE.createConstructedAttributes() );
            }
            pSCA.setParentConstructedAttributes( ns.getConstructedAttributes() );
            for( int i = 0; i < getSubDataAttribute().size(); ++i ) {
                if( pSCA.getParameterizedSubDataAttributeNames().contains( getSubDataAttribute().get( i ).getName() )) {
                    pSCA.getSubDataAttribute().get( i ).setTypeKind( underlyingTypeKind );
                    pSCA.getSubDataAttribute().get( i ).setType( underlyingType );
                }
                pSCA.getSubDataAttribute().get( i ).setExplicitLinksBuilt( false );
                pSCA.getSubDataAttribute().get( i ).buildExplicitLinks( console );
            }

            pSCA.setExplicitLinksBuilt( false );
            pSCA.buildExplicitLinks( console );

            parameterizedServiceConstructedAttributes.get( key ).put( underlyingType, pSCA );
        }

        return parameterizedServiceConstructedAttributes.get( key ).get( underlyingType );
    }

    //@formatter:on

} //ServiceConstructedAttributeImpl
