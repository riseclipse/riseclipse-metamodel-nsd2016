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

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DataObjectItemProvider extends DocumentedClassItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataObjectItemProvider( AdapterFactory adapterFactory ) {
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
            addDsPresCondPropertyDescriptor( object );
            addDsPresCondArgsPropertyDescriptor( object );
            addDsPresCondArgsIDPropertyDescriptor( object );
            addRefersToDsPresCondArgsDocPropertyDescriptor( object );
            addUnderlyingTypePropertyDescriptor( object );
            addUnderlyingTypeKindPropertyDescriptor( object );
            addRefersToUnderlyingBasicTypePropertyDescriptor( object );
            addRefersToUnderlyingConstructedAttributePropertyDescriptor( object );
            addRefersToUnderlyingEnumerationPropertyDescriptor( object );
            addUnderlyingControlTypePropertyDescriptor( object );
            addNamePropertyDescriptor( object );
            addTransientPropertyDescriptor( object );
            addTypePropertyDescriptor( object );
            addRefersToCDCPropertyDescriptor( object );
            addRefersToPresenceConditionPropertyDescriptor( object );
            addRefersToPresenceConditionDerivedStatisticsPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Ds Pres Cond feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDsPresCondPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_AgPresenceConditionDerivedStatistics_dsPresCond_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_AgPresenceConditionDerivedStatistics_dsPresCond_feature",
                                "_UI_AgPresenceConditionDerivedStatistics_type" ),
                        NsdPackage.Literals.AG_PRESENCE_CONDITION_DERIVED_STATISTICS__DS_PRES_COND,
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Ds Pres Cond Args feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDsPresCondArgsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_AgPresenceConditionDerivedStatistics_dsPresCondArgs_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_AgPresenceConditionDerivedStatistics_dsPresCondArgs_feature",
                                "_UI_AgPresenceConditionDerivedStatistics_type" ),
                        NsdPackage.Literals.AG_PRESENCE_CONDITION_DERIVED_STATISTICS__DS_PRES_COND_ARGS,
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Ds Pres Cond Args ID feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDsPresCondArgsIDPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_AgPresenceConditionDerivedStatistics_dsPresCondArgsID_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_AgPresenceConditionDerivedStatistics_dsPresCondArgsID_feature",
                                "_UI_AgPresenceConditionDerivedStatistics_type" ),
                        NsdPackage.Literals.AG_PRESENCE_CONDITION_DERIVED_STATISTICS__DS_PRES_COND_ARGS_ID,
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Refers To Ds Pres Cond Args Doc feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRefersToDsPresCondArgsDocPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_AgPresenceConditionDerivedStatistics_refersToDsPresCondArgsDoc_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_AgPresenceConditionDerivedStatistics_refersToDsPresCondArgsDoc_feature",
                                "_UI_AgPresenceConditionDerivedStatistics_type" ),
                        NsdPackage.Literals.AG_PRESENCE_CONDITION_DERIVED_STATISTICS__REFERS_TO_DS_PRES_COND_ARGS_DOC,
                        true,
                        false,
                        true,
                        null,
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
                        getString( "_UI_DataObject_name_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_DataObject_name_feature",
                                "_UI_DataObject_type" ),
                        NsdPackage.Literals.DATA_OBJECT__NAME,
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
     * This adds a property descriptor for the Transient feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTransientPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_DataObject_transient_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_DataObject_transient_feature",
                                "_UI_DataObject_type" ),
                        NsdPackage.Literals.DATA_OBJECT__TRANSIENT,
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
                        getString( "_UI_DataObject_type_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_DataObject_type_feature",
                                "_UI_DataObject_type" ),
                        NsdPackage.Literals.DATA_OBJECT__TYPE,
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
                        getString( "_UI_DataObject_refersToCDC_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_DataObject_refersToCDC_feature",
                                "_UI_DataObject_type" ),
                        NsdPackage.Literals.DATA_OBJECT__REFERS_TO_CDC,
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
                        getString( "_UI_DataObject_refersToPresenceCondition_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_DataObject_refersToPresenceCondition_feature", "_UI_DataObject_type" ),
                        NsdPackage.Literals.DATA_OBJECT__REFERS_TO_PRESENCE_CONDITION,
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Refers To Presence Condition Derived Statistics feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRefersToPresenceConditionDerivedStatisticsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_DataObject_refersToPresenceConditionDerivedStatistics_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_DataObject_refersToPresenceConditionDerivedStatistics_feature", "_UI_DataObject_type" ),
                NsdPackage.Literals.DATA_OBJECT__REFERS_TO_PRESENCE_CONDITION_DERIVED_STATISTICS,
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
     * This adds a property descriptor for the Refers To Underlying Basic Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRefersToUnderlyingBasicTypePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_AgUnderlyingType_refersToUnderlyingBasicType_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_AgUnderlyingType_refersToUnderlyingBasicType_feature", "_UI_AgUnderlyingType_type" ),
                NsdPackage.Literals.AG_UNDERLYING_TYPE__REFERS_TO_UNDERLYING_BASIC_TYPE,
                true,
                false,
                true,
                null,
                null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Refers To Underlying Constructed Attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRefersToUnderlyingConstructedAttributePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_AgUnderlyingType_refersToUnderlyingConstructedAttribute_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_AgUnderlyingType_refersToUnderlyingConstructedAttribute_feature",
                                "_UI_AgUnderlyingType_type" ),
                        NsdPackage.Literals.AG_UNDERLYING_TYPE__REFERS_TO_UNDERLYING_CONSTRUCTED_ATTRIBUTE,
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Refers To Underlying Enumeration feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRefersToUnderlyingEnumerationPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_AgUnderlyingType_refersToUnderlyingEnumeration_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_AgUnderlyingType_refersToUnderlyingEnumeration_feature", "_UI_AgUnderlyingType_type" ),
                NsdPackage.Literals.AG_UNDERLYING_TYPE__REFERS_TO_UNDERLYING_ENUMERATION,
                true,
                false,
                true,
                null,
                null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Underlying Control Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUnderlyingControlTypePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_AgUnderlyingType_underlyingControlType_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_AgUnderlyingType_underlyingControlType_feature", "_UI_AgUnderlyingType_type" ),
                        NsdPackage.Literals.AG_UNDERLYING_TYPE__UNDERLYING_CONTROL_TYPE,
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This returns DataObject.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/DataObject" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( DataObject ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_DataObject_type" )
                : getString( "_UI_DataObject_type" ) + " " + label;
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

        switch( notification.getFeatureID( DataObject.class ) ) {
        case NsdPackage.DATA_OBJECT__PRES_COND:
        case NsdPackage.DATA_OBJECT__PRES_COND_ARGS:
        case NsdPackage.DATA_OBJECT__PRES_COND_ARGS_ID:
        case NsdPackage.DATA_OBJECT__DS_PRES_COND:
        case NsdPackage.DATA_OBJECT__DS_PRES_COND_ARGS:
        case NsdPackage.DATA_OBJECT__DS_PRES_COND_ARGS_ID:
        case NsdPackage.DATA_OBJECT__UNDERLYING_TYPE:
        case NsdPackage.DATA_OBJECT__UNDERLYING_TYPE_KIND:
        case NsdPackage.DATA_OBJECT__UNDERLYING_CONTROL_TYPE:
        case NsdPackage.DATA_OBJECT__NAME:
        case NsdPackage.DATA_OBJECT__TRANSIENT:
        case NsdPackage.DATA_OBJECT__TYPE:
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
