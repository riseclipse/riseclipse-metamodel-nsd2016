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

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdFactory;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TNSItemProvider extends TCopyrightedItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TNSItemProvider( AdapterFactory adapterFactory ) {
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

            addDescIDPropertyDescriptor( object );
            addIdPropertyDescriptor( object );
            addPublicationStagePropertyDescriptor( object );
            addReleasePropertyDescriptor( object );
            addRevisionPropertyDescriptor( object );
            addUmlDatePropertyDescriptor( object );
            addUmlVersionPropertyDescriptor( object );
            addVersionPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
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
                        getResourceLocator(), getString( "_UI_TNS_descID_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TNS_descID_feature", "_UI_TNS_type" ),
                        NsdPackage.Literals.TNS__DESC_ID, true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Id feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIdPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_TNS_id_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TNS_id_feature", "_UI_TNS_type" ),
                        NsdPackage.Literals.TNS__ID, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null, null ) );
    }

    /**
     * This adds a property descriptor for the Publication Stage feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPublicationStagePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_TNS_publicationStage_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TNS_publicationStage_feature",
                                "_UI_TNS_type" ),
                        NsdPackage.Literals.TNS__PUBLICATION_STAGE, true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Release feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReleasePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_TNS_release_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TNS_release_feature", "_UI_TNS_type" ),
                        NsdPackage.Literals.TNS__RELEASE, true, false, false,
                        ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Revision feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRevisionPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_TNS_revision_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TNS_revision_feature", "_UI_TNS_type" ),
                        NsdPackage.Literals.TNS__REVISION, true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Uml Date feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUmlDatePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_TNS_umlDate_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TNS_umlDate_feature", "_UI_TNS_type" ),
                        NsdPackage.Literals.TNS__UML_DATE, true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Uml Version feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUmlVersionPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_TNS_umlVersion_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TNS_umlVersion_feature", "_UI_TNS_type" ),
                        NsdPackage.Literals.TNS__UML_VERSION, true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Version feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVersionPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_TNS_version_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TNS_version_feature", "_UI_TNS_type" ),
                        NsdPackage.Literals.TNS__VERSION, true, false, false,
                        ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null ) );
    }

    /**
     * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
     * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
     * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Collection< ? extends EStructuralFeature > getChildrenFeatures( Object object ) {
        if( childrenFeatures == null ) {
            super.getChildrenFeatures( object );
            childrenFeatures.add( NsdPackage.Literals.TNS__CHANGES );
            childrenFeatures.add( NsdPackage.Literals.TNS__DEPENDS_ON );
            childrenFeatures.add( NsdPackage.Literals.TNS__BASIC_TYPES );
            childrenFeatures.add( NsdPackage.Literals.TNS__FUNCTIONAL_CONSTRAINTS );
            childrenFeatures.add( NsdPackage.Literals.TNS__PRESENCE_CONDITIONS );
            childrenFeatures.add( NsdPackage.Literals.TNS__ABBREVIATIONS );
            childrenFeatures.add( NsdPackage.Literals.TNS__ENUMERATIONS );
            childrenFeatures.add( NsdPackage.Literals.TNS__CONSTRUCTED_ATTRIBUTES );
            childrenFeatures.add( NsdPackage.Literals.TNS__CD_CS );
            childrenFeatures.add( NsdPackage.Literals.TNS__LN_CLASSES );
        }
        return childrenFeatures;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EStructuralFeature getChildFeature( Object object, Object child ) {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature( object, child );
    }

    /**
     * This returns TNS.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/TNS" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( TNS ) object ).getId();
        return label == null || label.length() == 0 ? getString( "_UI_TNS_type" )
                : getString( "_UI_TNS_type" ) + " " + label;
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

        switch( notification.getFeatureID( TNS.class ) ) {
        case NsdPackage.TNS__DESC_ID:
        case NsdPackage.TNS__ID:
        case NsdPackage.TNS__PUBLICATION_STAGE:
        case NsdPackage.TNS__RELEASE:
        case NsdPackage.TNS__REVISION:
        case NsdPackage.TNS__UML_DATE:
        case NsdPackage.TNS__UML_VERSION:
        case NsdPackage.TNS__VERSION:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), false, true ) );
            return;
        case NsdPackage.TNS__CHANGES:
        case NsdPackage.TNS__DEPENDS_ON:
        case NsdPackage.TNS__BASIC_TYPES:
        case NsdPackage.TNS__FUNCTIONAL_CONSTRAINTS:
        case NsdPackage.TNS__PRESENCE_CONDITIONS:
        case NsdPackage.TNS__ABBREVIATIONS:
        case NsdPackage.TNS__ENUMERATIONS:
        case NsdPackage.TNS__CONSTRUCTED_ATTRIBUTES:
        case NsdPackage.TNS__CD_CS:
        case NsdPackage.TNS__LN_CLASSES:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), true, false ) );
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

        newChildDescriptors
                .add( createChildParameter( NsdPackage.Literals.TNS__CHANGES, NsdFactory.eINSTANCE.createTChanges() ) );

        newChildDescriptors.add( createChildParameter( NsdPackage.Literals.TNS__DEPENDS_ON,
                NsdFactory.eINSTANCE.createDependsOnType() ) );

        newChildDescriptors.add( createChildParameter( NsdPackage.Literals.TNS__BASIC_TYPES,
                NsdFactory.eINSTANCE.createTBasicTypes() ) );

        newChildDescriptors.add( createChildParameter( NsdPackage.Literals.TNS__FUNCTIONAL_CONSTRAINTS,
                NsdFactory.eINSTANCE.createTFunctionalConstraints() ) );

        newChildDescriptors.add( createChildParameter( NsdPackage.Literals.TNS__PRESENCE_CONDITIONS,
                NsdFactory.eINSTANCE.createTPresenceConditions() ) );

        newChildDescriptors.add( createChildParameter( NsdPackage.Literals.TNS__ABBREVIATIONS,
                NsdFactory.eINSTANCE.createTAbbreviations() ) );

        newChildDescriptors.add( createChildParameter( NsdPackage.Literals.TNS__ENUMERATIONS,
                NsdFactory.eINSTANCE.createTEnumerations() ) );

        newChildDescriptors.add( createChildParameter( NsdPackage.Literals.TNS__CONSTRUCTED_ATTRIBUTES,
                NsdFactory.eINSTANCE.createTConstructedAttributes() ) );

        newChildDescriptors
                .add( createChildParameter( NsdPackage.Literals.TNS__CD_CS, NsdFactory.eINSTANCE.createTCDCs() ) );

        newChildDescriptors.add(
                createChildParameter( NsdPackage.Literals.TNS__LN_CLASSES, NsdFactory.eINSTANCE.createTLNClasses() ) );
    }

}
