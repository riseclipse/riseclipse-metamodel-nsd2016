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
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataAttribute;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataAttribute} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TDataAttributeItemProvider extends TDocumentedClassItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TDataAttributeItemProvider( AdapterFactory adapterFactory ) {
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

            addDchgPropertyDescriptor( object );
            addDefaultValuePropertyDescriptor( object );
            addDupdPropertyDescriptor( object );
            addFcPropertyDescriptor( object );
            addIsArrayPropertyDescriptor( object );
            addMaxIndexAttributePropertyDescriptor( object );
            addMaxValuePropertyDescriptor( object );
            addMinIndexPropertyDescriptor( object );
            addMinValuePropertyDescriptor( object );
            addNamePropertyDescriptor( object );
            addPresCondPropertyDescriptor( object );
            addPresCondArgsPropertyDescriptor( object );
            addPresCondArgsIDPropertyDescriptor( object );
            addQchgPropertyDescriptor( object );
            addSizeAttributePropertyDescriptor( object );
            addTypePropertyDescriptor( object );
            addTypeKindPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Dchg feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDchgPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_TDataAttribute_dchg_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TDataAttribute_dchg_feature",
                                "_UI_TDataAttribute_type" ),
                        NsdPackage.Literals.TDATA_ATTRIBUTE__DCHG, true, false, false,
                        ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Default Value feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDefaultValuePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_TDataAttribute_defaultValue_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TDataAttribute_defaultValue_feature",
                                "_UI_TDataAttribute_type" ),
                        NsdPackage.Literals.TDATA_ATTRIBUTE__DEFAULT_VALUE, true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Dupd feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDupdPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_TDataAttribute_dupd_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TDataAttribute_dupd_feature",
                                "_UI_TDataAttribute_type" ),
                        NsdPackage.Literals.TDATA_ATTRIBUTE__DUPD, true, false, false,
                        ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null ) );
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
                        getResourceLocator(), getString( "_UI_TDataAttribute_fc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TDataAttribute_fc_feature",
                                "_UI_TDataAttribute_type" ),
                        NsdPackage.Literals.TDATA_ATTRIBUTE__FC, true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Is Array feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsArrayPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_TDataAttribute_isArray_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TDataAttribute_isArray_feature",
                                "_UI_TDataAttribute_type" ),
                        NsdPackage.Literals.TDATA_ATTRIBUTE__IS_ARRAY, true, false, false,
                        ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Max Index Attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMaxIndexAttributePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_TDataAttribute_maxIndexAttribute_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TDataAttribute_maxIndexAttribute_feature",
                                "_UI_TDataAttribute_type" ),
                        NsdPackage.Literals.TDATA_ATTRIBUTE__MAX_INDEX_ATTRIBUTE, true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
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
                        getResourceLocator(), getString( "_UI_TDataAttribute_maxValue_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TDataAttribute_maxValue_feature",
                                "_UI_TDataAttribute_type" ),
                        NsdPackage.Literals.TDATA_ATTRIBUTE__MAX_VALUE, true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Min Index feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMinIndexPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_TDataAttribute_minIndex_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TDataAttribute_minIndex_feature",
                                "_UI_TDataAttribute_type" ),
                        NsdPackage.Literals.TDATA_ATTRIBUTE__MIN_INDEX, true, false, false,
                        ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null ) );
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
                        getResourceLocator(), getString( "_UI_TDataAttribute_minValue_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TDataAttribute_minValue_feature",
                                "_UI_TDataAttribute_type" ),
                        NsdPackage.Literals.TDATA_ATTRIBUTE__MIN_VALUE, true, false, false,
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
                        getResourceLocator(), getString( "_UI_TDataAttribute_name_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TDataAttribute_name_feature",
                                "_UI_TDataAttribute_type" ),
                        NsdPackage.Literals.TDATA_ATTRIBUTE__NAME, true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
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
                        getResourceLocator(), getString( "_UI_TDataAttribute_presCond_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TDataAttribute_presCond_feature",
                                "_UI_TDataAttribute_type" ),
                        NsdPackage.Literals.TDATA_ATTRIBUTE__PRES_COND, true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
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
                        getResourceLocator(), getString( "_UI_TDataAttribute_presCondArgs_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TDataAttribute_presCondArgs_feature",
                                "_UI_TDataAttribute_type" ),
                        NsdPackage.Literals.TDATA_ATTRIBUTE__PRES_COND_ARGS, true, false, false,
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
                        getResourceLocator(), getString( "_UI_TDataAttribute_presCondArgsID_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TDataAttribute_presCondArgsID_feature",
                                "_UI_TDataAttribute_type" ),
                        NsdPackage.Literals.TDATA_ATTRIBUTE__PRES_COND_ARGS_ID, true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Qchg feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addQchgPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_TDataAttribute_qchg_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TDataAttribute_qchg_feature",
                                "_UI_TDataAttribute_type" ),
                        NsdPackage.Literals.TDATA_ATTRIBUTE__QCHG, true, false, false,
                        ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Size Attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSizeAttributePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_TDataAttribute_sizeAttribute_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TDataAttribute_sizeAttribute_feature",
                                "_UI_TDataAttribute_type" ),
                        NsdPackage.Literals.TDATA_ATTRIBUTE__SIZE_ATTRIBUTE, true, false, false,
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
                        getResourceLocator(), getString( "_UI_TDataAttribute_type_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TDataAttribute_type_feature",
                                "_UI_TDataAttribute_type" ),
                        NsdPackage.Literals.TDATA_ATTRIBUTE__TYPE, true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
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
                        getResourceLocator(), getString( "_UI_TDataAttribute_typeKind_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TDataAttribute_typeKind_feature",
                                "_UI_TDataAttribute_type" ),
                        NsdPackage.Literals.TDATA_ATTRIBUTE__TYPE_KIND, true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This returns TDataAttribute.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/TDataAttribute" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( TDataAttribute ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_TDataAttribute_type" )
                : getString( "_UI_TDataAttribute_type" ) + " " + label;
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

        switch( notification.getFeatureID( TDataAttribute.class ) ) {
        case NsdPackage.TDATA_ATTRIBUTE__DCHG:
        case NsdPackage.TDATA_ATTRIBUTE__DEFAULT_VALUE:
        case NsdPackage.TDATA_ATTRIBUTE__DUPD:
        case NsdPackage.TDATA_ATTRIBUTE__FC:
        case NsdPackage.TDATA_ATTRIBUTE__IS_ARRAY:
        case NsdPackage.TDATA_ATTRIBUTE__MAX_INDEX_ATTRIBUTE:
        case NsdPackage.TDATA_ATTRIBUTE__MAX_VALUE:
        case NsdPackage.TDATA_ATTRIBUTE__MIN_INDEX:
        case NsdPackage.TDATA_ATTRIBUTE__MIN_VALUE:
        case NsdPackage.TDATA_ATTRIBUTE__NAME:
        case NsdPackage.TDATA_ATTRIBUTE__PRES_COND:
        case NsdPackage.TDATA_ATTRIBUTE__PRES_COND_ARGS:
        case NsdPackage.TDATA_ATTRIBUTE__PRES_COND_ARGS_ID:
        case NsdPackage.TDATA_ATTRIBUTE__QCHG:
        case NsdPackage.TDATA_ATTRIBUTE__SIZE_ATTRIBUTE:
        case NsdPackage.TDATA_ATTRIBUTE__TYPE:
        case NsdPackage.TDATA_ATTRIBUTE__TYPE_KIND:
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
