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
package fr.centralesupelec.edf.riseclipse.iec61850.nsd.provider;

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SubDataObjectItemProvider extends DocumentedClassItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SubDataObjectItemProvider( AdapterFactory adapterFactory ) {
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
            addIsArrayPropertyDescriptor( object );
            addMaxIndexAttributePropertyDescriptor( object );
            addMinIndexPropertyDescriptor( object );
            addSizeAttributePropertyDescriptor( object );
            addUnderlyingTypePropertyDescriptor( object );
            addUnderlyingTypeKindPropertyDescriptor( object );
            addNamePropertyDescriptor( object );
            addTypePropertyDescriptor( object );
            addRefersToCDCPropertyDescriptor( object );
            addRefersToPresenceConditionPropertyDescriptor( object );
            addRefersToSizeAttributePropertyDescriptor( object );
            addRefersToMaxIndexAttributePropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
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
                        getResourceLocator(),
                        getString( "_UI_AgArray_isArray_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AgArray_isArray_feature",
                                "_UI_AgArray_type" ),
                        NsdPackage.Literals.AG_ARRAY__IS_ARRAY,
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_AgArray_maxIndexAttribute_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AgArray_maxIndexAttribute_feature",
                                "_UI_AgArray_type" ),
                        NsdPackage.Literals.AG_ARRAY__MAX_INDEX_ATTRIBUTE,
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_AgArray_minIndex_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AgArray_minIndex_feature",
                                "_UI_AgArray_type" ),
                        NsdPackage.Literals.AG_ARRAY__MIN_INDEX,
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
                        getString( "_UI_SubDataObject_name_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SubDataObject_name_feature",
                                "_UI_SubDataObject_type" ),
                        NsdPackage.Literals.SUB_DATA_OBJECT__NAME,
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
     * This adds a property descriptor for the Size Attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSizeAttributePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_AgArray_sizeAttribute_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AgArray_sizeAttribute_feature",
                                "_UI_AgArray_type" ),
                        NsdPackage.Literals.AG_ARRAY__SIZE_ATTRIBUTE,
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
                        getString( "_UI_SubDataObject_type_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SubDataObject_type_feature",
                                "_UI_SubDataObject_type" ),
                        NsdPackage.Literals.SUB_DATA_OBJECT__TYPE,
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Refers To CDC feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRefersToCDCPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_SubDataObject_refersToCDC_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SubDataObject_refersToCDC_feature",
                                "_UI_SubDataObject_type" ),
                        NsdPackage.Literals.SUB_DATA_OBJECT__REFERS_TO_CDC,
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Refers To Presence Condition feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRefersToPresenceConditionPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_SubDataObject_refersToPresenceCondition_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_SubDataObject_refersToPresenceCondition_feature", "_UI_SubDataObject_type" ),
                        NsdPackage.Literals.SUB_DATA_OBJECT__REFERS_TO_PRESENCE_CONDITION,
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Refers To Size Attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRefersToSizeAttributePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_SubDataObject_refersToSizeAttribute_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_SubDataObject_refersToSizeAttribute_feature", "_UI_SubDataObject_type" ),
                        NsdPackage.Literals.SUB_DATA_OBJECT__REFERS_TO_SIZE_ATTRIBUTE,
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Refers To Max Index Attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRefersToMaxIndexAttributePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_SubDataObject_refersToMaxIndexAttribute_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_SubDataObject_refersToMaxIndexAttribute_feature", "_UI_SubDataObject_type" ),
                        NsdPackage.Literals.SUB_DATA_OBJECT__REFERS_TO_MAX_INDEX_ATTRIBUTE,
                        true,
                        false,
                        true,
                        null,
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
     * This returns SubDataObject.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/SubDataObject" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( SubDataObject ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_SubDataObject_type" )
                : getString( "_UI_SubDataObject_type" ) + " " + label;
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

        switch( notification.getFeatureID( SubDataObject.class ) ) {
        case NsdPackage.SUB_DATA_OBJECT__PRES_COND:
        case NsdPackage.SUB_DATA_OBJECT__PRES_COND_ARGS:
        case NsdPackage.SUB_DATA_OBJECT__PRES_COND_ARGS_ID:
        case NsdPackage.SUB_DATA_OBJECT__IS_ARRAY:
        case NsdPackage.SUB_DATA_OBJECT__MAX_INDEX_ATTRIBUTE:
        case NsdPackage.SUB_DATA_OBJECT__MIN_INDEX:
        case NsdPackage.SUB_DATA_OBJECT__SIZE_ATTRIBUTE:
        case NsdPackage.SUB_DATA_OBJECT__UNDERLYING_TYPE:
        case NsdPackage.SUB_DATA_OBJECT__UNDERLYING_TYPE_KIND:
        case NsdPackage.SUB_DATA_OBJECT__NAME:
        case NsdPackage.SUB_DATA_OBJECT__TYPE:
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
