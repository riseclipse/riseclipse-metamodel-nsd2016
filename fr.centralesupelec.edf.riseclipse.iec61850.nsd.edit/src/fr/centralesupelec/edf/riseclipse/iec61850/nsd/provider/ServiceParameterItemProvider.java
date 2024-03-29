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
package fr.centralesupelec.edf.riseclipse.iec61850.nsd.provider;

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceParameter;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceParameter} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceParameterItemProvider extends DocumentedClassItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ServiceParameterItemProvider( AdapterFactory adapterFactory ) {
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

            addTypePropertyDescriptor( object );
            addTypeKindPropertyDescriptor( object );
            addRefersToBasicTypePropertyDescriptor( object );
            addRefersToConstructedAttributePropertyDescriptor( object );
            addRefersToEnumerationPropertyDescriptor( object );
            addDefaultValuePropertyDescriptor( object );
            addMaxValuePropertyDescriptor( object );
            addMinValuePropertyDescriptor( object );
            addNamePropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Default Value feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDefaultValuePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_AgAttributeTypeAndValues_defaultValue_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_AgAttributeTypeAndValues_defaultValue_feature",
                        "_UI_AgAttributeTypeAndValues_type" ),
                NsdPackage.Literals.AG_ATTRIBUTE_TYPE_AND_VALUES__DEFAULT_VALUE,
                true,
                false,
                false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Max Value feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMaxValuePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_AgAttributeTypeAndValues_maxValue_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_AgAttributeTypeAndValues_maxValue_feature", "_UI_AgAttributeTypeAndValues_type" ),
                        NsdPackage.Literals.AG_ATTRIBUTE_TYPE_AND_VALUES__MAX_VALUE,
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Min Value feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMinValuePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_AgAttributeTypeAndValues_minValue_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_AgAttributeTypeAndValues_minValue_feature", "_UI_AgAttributeTypeAndValues_type" ),
                        NsdPackage.Literals.AG_ATTRIBUTE_TYPE_AND_VALUES__MIN_VALUE,
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
                        getString( "_UI_ServiceParameter_name_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ServiceParameter_name_feature",
                                "_UI_ServiceParameter_type" ),
                        NsdPackage.Literals.SERVICE_PARAMETER__NAME,
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
     * This adds a property descriptor for the Refers To Basic Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRefersToBasicTypePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_AgAttributeType_refersToBasicType_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_AgAttributeType_refersToBasicType_feature", "_UI_AgAttributeType_type" ),
                        NsdPackage.Literals.AG_ATTRIBUTE_TYPE__REFERS_TO_BASIC_TYPE,
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Refers To Constructed Attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRefersToConstructedAttributePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_AgAttributeType_refersToConstructedAttribute_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_AgAttributeType_refersToConstructedAttribute_feature", "_UI_AgAttributeType_type" ),
                NsdPackage.Literals.AG_ATTRIBUTE_TYPE__REFERS_TO_CONSTRUCTED_ATTRIBUTE,
                true,
                false,
                true,
                null,
                null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Refers To Enumeration feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRefersToEnumerationPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_AgAttributeType_refersToEnumeration_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_AgAttributeType_refersToEnumeration_feature", "_UI_AgAttributeType_type" ),
                        NsdPackage.Literals.AG_ATTRIBUTE_TYPE__REFERS_TO_ENUMERATION,
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This returns ServiceParameter.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/ServiceParameter" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( ServiceParameter ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_ServiceParameter_type" )
                : getString( "_UI_ServiceParameter_type" ) + " " + label;
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

        switch( notification.getFeatureID( ServiceParameter.class ) ) {
        case NsdPackage.SERVICE_PARAMETER__TYPE:
        case NsdPackage.SERVICE_PARAMETER__TYPE_KIND:
        case NsdPackage.SERVICE_PARAMETER__DEFAULT_VALUE:
        case NsdPackage.SERVICE_PARAMETER__MAX_VALUE:
        case NsdPackage.SERVICE_PARAMETER__MIN_VALUE:
        case NsdPackage.SERVICE_PARAMETER__NAME:
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
