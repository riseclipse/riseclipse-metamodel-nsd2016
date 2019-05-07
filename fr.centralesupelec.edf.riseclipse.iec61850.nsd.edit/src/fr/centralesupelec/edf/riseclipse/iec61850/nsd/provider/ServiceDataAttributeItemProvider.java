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
package fr.centralesupelec.edf.riseclipse.iec61850.nsd.provider;

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceDataAttributeItemProvider extends DocumentedClassItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ServiceDataAttributeItemProvider( AdapterFactory adapterFactory ) {
        super( adapterFactory );
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List< IItemPropertyDescriptor > getPropertyDescriptors( Object object ) {
        if( itemPropertyDescriptors == null ) {
            super.getPropertyDescriptors( object );

            addPresCondPropertyDescriptor( object );
            addPresCondArgsPropertyDescriptor( object );
            addPresCondArgsIDPropertyDescriptor( object );
            addRefersToPresCondArgsDocPropertyDescriptor( object );
            addTypePropertyDescriptor( object );
            addTypeKindPropertyDescriptor( object );
            addUnderlyingTypePropertyDescriptor( object );
            addUnderlyingTypeKindPropertyDescriptor( object );
            addFcPropertyDescriptor( object );
            addNamePropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Fc feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFcPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_ServiceDataAttribute_fc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ServiceDataAttribute_fc_feature",
                                "_UI_ServiceDataAttribute_type" ),
                        NsdPackage.Literals.SERVICE_DATA_ATTRIBUTE__FC,
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNamePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_ServiceDataAttribute_name_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ServiceDataAttribute_name_feature",
                                "_UI_ServiceDataAttribute_type" ),
                        NsdPackage.Literals.SERVICE_DATA_ATTRIBUTE__NAME,
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Pres Cond feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPresCondPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_AgPresenceCondition_presCond_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AgPresenceCondition_presCond_feature",
                                "_UI_AgPresenceCondition_type" ),
                        NsdPackage.Literals.AG_PRESENCE_CONDITION__PRES_COND,
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Pres Cond Args feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPresCondArgsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_AgPresenceCondition_presCondArgs_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AgPresenceCondition_presCondArgs_feature",
                                "_UI_AgPresenceCondition_type" ),
                        NsdPackage.Literals.AG_PRESENCE_CONDITION__PRES_COND_ARGS,
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Pres Cond Args ID feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPresCondArgsIDPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_AgPresenceCondition_presCondArgsID_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_AgPresenceCondition_presCondArgsID_feature", "_UI_AgPresenceCondition_type" ),
                        NsdPackage.Literals.AG_PRESENCE_CONDITION__PRES_COND_ARGS_ID,
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Refers To Pres Cond Args Doc feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRefersToPresCondArgsDocPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_AgPresenceCondition_refersToPresCondArgsDoc_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_AgPresenceCondition_refersToPresCondArgsDoc_feature", "_UI_AgPresenceCondition_type" ),
                NsdPackage.Literals.AG_PRESENCE_CONDITION__REFERS_TO_PRES_COND_ARGS_DOC,
                true,
                false,
                true,
                null,
                null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTypePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_AgAttributeType_type_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AgAttributeType_type_feature",
                                "_UI_AgAttributeType_type" ),
                        NsdPackage.Literals.AG_ATTRIBUTE_TYPE__TYPE,
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Type Kind feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTypeKindPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_AgAttributeType_typeKind_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AgAttributeType_typeKind_feature",
                                "_UI_AgAttributeType_type" ),
                        NsdPackage.Literals.AG_ATTRIBUTE_TYPE__TYPE_KIND,
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Underlying Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUnderlyingTypePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_AgUnderlyingType_underlyingType_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AgUnderlyingType_underlyingType_feature",
                                "_UI_AgUnderlyingType_type" ),
                        NsdPackage.Literals.AG_UNDERLYING_TYPE__UNDERLYING_TYPE,
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Underlying Type Kind feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUnderlyingTypeKindPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_AgUnderlyingType_underlyingTypeKind_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_AgUnderlyingType_underlyingTypeKind_feature", "_UI_AgUnderlyingType_type" ),
                        NsdPackage.Literals.AG_UNDERLYING_TYPE__UNDERLYING_TYPE_KIND,
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This returns ServiceDataAttribute.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/ServiceDataAttribute" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( ServiceDataAttribute ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_ServiceDataAttribute_type" )
                : getString( "_UI_ServiceDataAttribute_type" ) + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged( Notification notification ) {
        updateChildren( notification );

        switch( notification.getFeatureID( ServiceDataAttribute.class ) ) {
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__PRES_COND:
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__PRES_COND_ARGS:
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__PRES_COND_ARGS_ID:
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__TYPE:
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__TYPE_KIND:
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__UNDERLYING_TYPE:
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__UNDERLYING_TYPE_KIND:
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__FC:
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__NAME:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), false, true ) );
            return;
        }
        super.notifyChanged( notification );
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors( Collection< Object > newChildDescriptors, Object object ) {
        super.collectNewChildDescriptors( newChildDescriptors, object );
    }

}