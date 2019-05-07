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

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdFactory;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;

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
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NSItemProvider extends CopyrightedItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NSItemProvider( AdapterFactory adapterFactory ) {
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

            addReleasePropertyDescriptor( object );
            addVersionPropertyDescriptor( object );
            addIdPropertyDescriptor( object );
            addRevisionPropertyDescriptor( object );
            addPublicationStagePropertyDescriptor( object );
            addUmlDatePropertyDescriptor( object );
            addUmlVersionPropertyDescriptor( object );
            addDescIDPropertyDescriptor( object );
            addRefersToDocPropertyDescriptor( object );
            addReferredByDependsOnPropertyDescriptor( object );
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
                        getResourceLocator(),
                        getString( "_UI_AgNSdesc_descID_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AgNSdesc_descID_feature",
                                "_UI_AgNSdesc_type" ),
                        NsdPackage.Literals.AG_NSDESC__DESC_ID,
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
                        getString( "_UI_AgNSdesc_refersToDoc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AgNSdesc_refersToDoc_feature",
                                "_UI_AgNSdesc_type" ),
                        NsdPackage.Literals.AG_NSDESC__REFERS_TO_DOC,
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Referred By Depends On feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReferredByDependsOnPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_NS_referredByDependsOn_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_NS_referredByDependsOn_feature",
                                "_UI_NS_type" ),
                        NsdPackage.Literals.NS__REFERRED_BY_DEPENDS_ON,
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_AgNSIdentification_id_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AgNSIdentification_id_feature",
                                "_UI_AgNSIdentification_type" ),
                        NsdPackage.Literals.AG_NS_IDENTIFICATION__ID,
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_AgNSIdentification_publicationStage_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_AgNSIdentification_publicationStage_feature", "_UI_AgNSIdentification_type" ),
                        NsdPackage.Literals.AG_NS_IDENTIFICATION__PUBLICATION_STAGE,
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_AgNSIdentification_release_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AgNSIdentification_release_feature",
                                "_UI_AgNSIdentification_type" ),
                        NsdPackage.Literals.AG_NS_IDENTIFICATION__RELEASE,
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_AgNSIdentification_revision_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AgNSIdentification_revision_feature",
                                "_UI_AgNSIdentification_type" ),
                        NsdPackage.Literals.AG_NS_IDENTIFICATION__REVISION,
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_AgUML_umlDate_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AgUML_umlDate_feature",
                                "_UI_AgUML_type" ),
                        NsdPackage.Literals.AG_UML__UML_DATE,
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_AgUML_umlVersion_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AgUML_umlVersion_feature",
                                "_UI_AgUML_type" ),
                        NsdPackage.Literals.AG_UML__UML_VERSION,
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_AgNSIdentification_version_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AgNSIdentification_version_feature",
                                "_UI_AgNSIdentification_type" ),
                        NsdPackage.Literals.AG_NS_IDENTIFICATION__VERSION,
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
            childrenFeatures.add( NsdPackage.Literals.NS__CHANGES );
            childrenFeatures.add( NsdPackage.Literals.NS__DEPENDS_ON );
            childrenFeatures.add( NsdPackage.Literals.NS__BASIC_TYPES );
            childrenFeatures.add( NsdPackage.Literals.NS__FUNCTIONAL_CONSTRAINTS );
            childrenFeatures.add( NsdPackage.Literals.NS__PRESENCE_CONDITIONS );
            childrenFeatures.add( NsdPackage.Literals.NS__ABBREVIATIONS );
            childrenFeatures.add( NsdPackage.Literals.NS__ENUMERATIONS );
            childrenFeatures.add( NsdPackage.Literals.NS__CONSTRUCTED_ATTRIBUTES );
            childrenFeatures.add( NsdPackage.Literals.NS__CD_CS );
            childrenFeatures.add( NsdPackage.Literals.NS__LN_CLASSES );
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
     * This returns NS.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/NS" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( NS ) object ).getId();
        return label == null || label.length() == 0 ? getString( "_UI_NS_type" )
                : getString( "_UI_NS_type" ) + " " + label;
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

        switch( notification.getFeatureID( NS.class ) ) {
        case NsdPackage.NS__RELEASE:
        case NsdPackage.NS__VERSION:
        case NsdPackage.NS__ID:
        case NsdPackage.NS__REVISION:
        case NsdPackage.NS__PUBLICATION_STAGE:
        case NsdPackage.NS__UML_DATE:
        case NsdPackage.NS__UML_VERSION:
        case NsdPackage.NS__DESC_ID:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), false, true ) );
            return;
        case NsdPackage.NS__CHANGES:
        case NsdPackage.NS__DEPENDS_ON:
        case NsdPackage.NS__BASIC_TYPES:
        case NsdPackage.NS__FUNCTIONAL_CONSTRAINTS:
        case NsdPackage.NS__PRESENCE_CONDITIONS:
        case NsdPackage.NS__ABBREVIATIONS:
        case NsdPackage.NS__ENUMERATIONS:
        case NsdPackage.NS__CONSTRUCTED_ATTRIBUTES:
        case NsdPackage.NS__CD_CS:
        case NsdPackage.NS__LN_CLASSES:
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

        newChildDescriptors.add( createChildParameter( NsdPackage.Literals.NS__CHANGES,
                NsdFactory.eINSTANCE.createChanges() ) );

        newChildDescriptors.add( createChildParameter( NsdPackage.Literals.NS__DEPENDS_ON,
                NsdFactory.eINSTANCE.createDependsOn() ) );

        newChildDescriptors.add( createChildParameter( NsdPackage.Literals.NS__BASIC_TYPES,
                NsdFactory.eINSTANCE.createBasicTypes() ) );

        newChildDescriptors.add( createChildParameter( NsdPackage.Literals.NS__FUNCTIONAL_CONSTRAINTS,
                NsdFactory.eINSTANCE.createFunctionalConstraints() ) );

        newChildDescriptors.add( createChildParameter( NsdPackage.Literals.NS__PRESENCE_CONDITIONS,
                NsdFactory.eINSTANCE.createPresenceConditions() ) );

        newChildDescriptors.add( createChildParameter( NsdPackage.Literals.NS__ABBREVIATIONS,
                NsdFactory.eINSTANCE.createAbbreviations() ) );

        newChildDescriptors.add( createChildParameter( NsdPackage.Literals.NS__ENUMERATIONS,
                NsdFactory.eINSTANCE.createEnumerations() ) );

        newChildDescriptors.add( createChildParameter( NsdPackage.Literals.NS__CONSTRUCTED_ATTRIBUTES,
                NsdFactory.eINSTANCE.createConstructedAttributes() ) );

        newChildDescriptors.add( createChildParameter( NsdPackage.Literals.NS__CD_CS,
                NsdFactory.eINSTANCE.createCDCs() ) );

        newChildDescriptors.add( createChildParameter( NsdPackage.Literals.NS__LN_CLASSES,
                NsdFactory.eINSTANCE.createLNClasses() ) );
    }

}
