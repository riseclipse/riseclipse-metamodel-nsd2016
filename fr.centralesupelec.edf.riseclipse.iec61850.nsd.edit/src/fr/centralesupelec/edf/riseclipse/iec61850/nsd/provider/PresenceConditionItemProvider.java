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
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PresenceConditionItemProvider extends NsdObjectItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PresenceConditionItemProvider( AdapterFactory adapterFactory ) {
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

            addArgumentPropertyDescriptor( object );
            addDescIDPropertyDescriptor( object );
            addNamePropertyDescriptor( object );
            addTitleIDPropertyDescriptor( object );
            addReferredByDataObjectPropertyDescriptor( object );
            addReferredByDataObjectForDerivedStatisticsPropertyDescriptor( object );
            addReferredBySubDataObjectPropertyDescriptor( object );
            addReferredByDataAttributePropertyDescriptor( object );
            addReferredBySubDataAttributePropertyDescriptor( object );
            addRefersToDocPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Argument feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addArgumentPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PresenceCondition_argument_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PresenceCondition_argument_feature",
                                "_UI_PresenceCondition_type" ),
                        NsdPackage.Literals.PRESENCE_CONDITION__ARGUMENT,
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Desc ID feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDescIDPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PresenceCondition_descID_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PresenceCondition_descID_feature",
                                "_UI_PresenceCondition_type" ),
                        NsdPackage.Literals.PRESENCE_CONDITION__DESC_ID,
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
                        getString( "_UI_PresenceCondition_name_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PresenceCondition_name_feature",
                                "_UI_PresenceCondition_type" ),
                        NsdPackage.Literals.PRESENCE_CONDITION__NAME,
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Title ID feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTitleIDPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PresenceCondition_titleID_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PresenceCondition_titleID_feature",
                                "_UI_PresenceCondition_type" ),
                        NsdPackage.Literals.PRESENCE_CONDITION__TITLE_ID,
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Referred By Data Object feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReferredByDataObjectPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PresenceCondition_referredByDataObject_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_PresenceCondition_referredByDataObject_feature", "_UI_PresenceCondition_type" ),
                        NsdPackage.Literals.PRESENCE_CONDITION__REFERRED_BY_DATA_OBJECT,
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Referred By Data Object For Derived Statistics feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReferredByDataObjectForDerivedStatisticsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PresenceCondition_referredByDataObjectForDerivedStatistics_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_PresenceCondition_referredByDataObjectForDerivedStatistics_feature",
                                "_UI_PresenceCondition_type" ),
                        NsdPackage.Literals.PRESENCE_CONDITION__REFERRED_BY_DATA_OBJECT_FOR_DERIVED_STATISTICS,
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Referred By Sub Data Object feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReferredBySubDataObjectPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PresenceCondition_referredBySubDataObject_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_PresenceCondition_referredBySubDataObject_feature", "_UI_PresenceCondition_type" ),
                        NsdPackage.Literals.PRESENCE_CONDITION__REFERRED_BY_SUB_DATA_OBJECT,
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Referred By Data Attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReferredByDataAttributePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PresenceCondition_referredByDataAttribute_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_PresenceCondition_referredByDataAttribute_feature", "_UI_PresenceCondition_type" ),
                        NsdPackage.Literals.PRESENCE_CONDITION__REFERRED_BY_DATA_ATTRIBUTE,
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Referred By Sub Data Attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReferredBySubDataAttributePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_PresenceCondition_referredBySubDataAttribute_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_PresenceCondition_referredBySubDataAttribute_feature", "_UI_PresenceCondition_type" ),
                NsdPackage.Literals.PRESENCE_CONDITION__REFERRED_BY_SUB_DATA_ATTRIBUTE,
                true,
                false,
                true,
                null,
                null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Refers To Doc feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRefersToDocPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PresenceCondition_refersToDoc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PresenceCondition_refersToDoc_feature",
                                "_UI_PresenceCondition_type" ),
                        NsdPackage.Literals.PRESENCE_CONDITION__REFERS_TO_DOC,
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This returns PresenceCondition.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/PresenceCondition" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( PresenceCondition ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_PresenceCondition_type" )
                : getString( "_UI_PresenceCondition_type" ) + " " + label;
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

        switch( notification.getFeatureID( PresenceCondition.class ) ) {
        case NsdPackage.PRESENCE_CONDITION__ARGUMENT:
        case NsdPackage.PRESENCE_CONDITION__DESC_ID:
        case NsdPackage.PRESENCE_CONDITION__NAME:
        case NsdPackage.PRESENCE_CONDITION__TITLE_ID:
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
