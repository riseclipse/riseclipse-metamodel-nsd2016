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
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceDataAttribute;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceDataAttribute} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TServiceDataAttributeItemProvider extends TDocumentedClassItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TServiceDataAttributeItemProvider( AdapterFactory adapterFactory ) {
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

            addFcPropertyDescriptor( object );
            addNamePropertyDescriptor( object );
            addPresCondPropertyDescriptor( object );
            addPresCondArgsPropertyDescriptor( object );
            addPresCondArgsIDPropertyDescriptor( object );
            addTypePropertyDescriptor( object );
            addTypeKindPropertyDescriptor( object );
            addUnderlyingTypePropertyDescriptor( object );
            addUnderlyingTypeKindPropertyDescriptor( object );
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
                        getResourceLocator(), getString( "_UI_TServiceDataAttribute_fc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TServiceDataAttribute_fc_feature",
                                "_UI_TServiceDataAttribute_type" ),
                        NsdPackage.Literals.TSERVICE_DATA_ATTRIBUTE__FC, true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
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
                        getResourceLocator(), getString( "_UI_TServiceDataAttribute_name_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TServiceDataAttribute_name_feature",
                                "_UI_TServiceDataAttribute_type" ),
                        NsdPackage.Literals.TSERVICE_DATA_ATTRIBUTE__NAME, true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Pres Cond feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPresCondPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_TServiceDataAttribute_presCond_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_TServiceDataAttribute_presCond_feature",
                        "_UI_TServiceDataAttribute_type" ),
                NsdPackage.Literals.TSERVICE_DATA_ATTRIBUTE__PRES_COND, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Pres Cond Args feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPresCondArgsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_TServiceDataAttribute_presCondArgs_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_TServiceDataAttribute_presCondArgs_feature",
                        "_UI_TServiceDataAttribute_type" ),
                NsdPackage.Literals.TSERVICE_DATA_ATTRIBUTE__PRES_COND_ARGS, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
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
                        getResourceLocator(), getString( "_UI_TServiceDataAttribute_presCondArgsID_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_TServiceDataAttribute_presCondArgsID_feature", "_UI_TServiceDataAttribute_type" ),
                        NsdPackage.Literals.TSERVICE_DATA_ATTRIBUTE__PRES_COND_ARGS_ID, true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
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
                        getResourceLocator(), getString( "_UI_TServiceDataAttribute_type_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TServiceDataAttribute_type_feature",
                                "_UI_TServiceDataAttribute_type" ),
                        NsdPackage.Literals.TSERVICE_DATA_ATTRIBUTE__TYPE, true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Type Kind feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTypeKindPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_TServiceDataAttribute_typeKind_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_TServiceDataAttribute_typeKind_feature",
                        "_UI_TServiceDataAttribute_type" ),
                NsdPackage.Literals.TSERVICE_DATA_ATTRIBUTE__TYPE_KIND, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
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
                        getResourceLocator(), getString( "_UI_TServiceDataAttribute_underlyingType_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_TServiceDataAttribute_underlyingType_feature", "_UI_TServiceDataAttribute_type" ),
                        NsdPackage.Literals.TSERVICE_DATA_ATTRIBUTE__UNDERLYING_TYPE, true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Underlying Type Kind feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUnderlyingTypeKindPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_TServiceDataAttribute_underlyingTypeKind_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_TServiceDataAttribute_underlyingTypeKind_feature",
                        "_UI_TServiceDataAttribute_type" ),
                NsdPackage.Literals.TSERVICE_DATA_ATTRIBUTE__UNDERLYING_TYPE_KIND, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This returns TServiceDataAttribute.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/TServiceDataAttribute" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( TServiceDataAttribute ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_TServiceDataAttribute_type" )
                : getString( "_UI_TServiceDataAttribute_type" ) + " " + label;
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

        switch( notification.getFeatureID( TServiceDataAttribute.class ) ) {
        case NsdPackage.TSERVICE_DATA_ATTRIBUTE__FC:
        case NsdPackage.TSERVICE_DATA_ATTRIBUTE__NAME:
        case NsdPackage.TSERVICE_DATA_ATTRIBUTE__PRES_COND:
        case NsdPackage.TSERVICE_DATA_ATTRIBUTE__PRES_COND_ARGS:
        case NsdPackage.TSERVICE_DATA_ATTRIBUTE__PRES_COND_ARGS_ID:
        case NsdPackage.TSERVICE_DATA_ATTRIBUTE__TYPE:
        case NsdPackage.TSERVICE_DATA_ATTRIBUTE__TYPE_KIND:
        case NsdPackage.TSERVICE_DATA_ATTRIBUTE__UNDERLYING_TYPE:
        case NsdPackage.TSERVICE_DATA_ATTRIBUTE__UNDERLYING_TYPE_KIND:
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
