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
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDoc;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDoc} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TDocItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
        IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TDocItemProvider( AdapterFactory adapterFactory ) {
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

            addIdPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
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
                        getResourceLocator(), getString( "_UI_TDoc_id_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TDoc_id_feature", "_UI_TDoc_type" ),
                        NsdPackage.Literals.TDOC__ID, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null, null ) );
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
            childrenFeatures.add( NsdPackage.Literals.TDOC__MIXED );
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
     * This returns TDoc.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/TDoc" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( TDoc ) object ).getId();
        return label == null || label.length() == 0 ? getString( "_UI_TDoc_type" )
                : getString( "_UI_TDoc_type" ) + " " + label;
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

        switch( notification.getFeatureID( TDoc.class ) ) {
        case NsdPackage.TDOC__ID:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), false, true ) );
            return;
        case NsdPackage.TDOC__MIXED:
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

        newChildDescriptors.add( createChildParameter( NsdPackage.Literals.TDOC__MIXED,
                FeatureMapUtil.createEntry( XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__COMMENT, "" ) ) );

        newChildDescriptors.add( createChildParameter( NsdPackage.Literals.TDOC__MIXED,
                FeatureMapUtil.createEntry( XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__TEXT, "" ) ) );

        newChildDescriptors.add( createChildParameter( NsdPackage.Literals.TDOC__MIXED,
                FeatureMapUtil.createEntry( XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__PROCESSING_INSTRUCTION,
                        XMLTypeFactory.eINSTANCE.createProcessingInstruction() ) ) );

        newChildDescriptors.add( createChildParameter( NsdPackage.Literals.TDOC__MIXED,
                FeatureMapUtil.createEntry( XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__CDATA, "" ) ) );

        newChildDescriptors.add( createChildParameter( NsdPackage.Literals.TDOC__MIXED,
                FeatureMapUtil.createEntry( NsdPackage.Literals.DOCUMENT_ROOT__APPLICABLE_SERVICE_NS,
                        NsdFactory.eINSTANCE.createTApplicableServiceNS() ) ) );

        newChildDescriptors.add( createChildParameter( NsdPackage.Literals.TDOC__MIXED, FeatureMapUtil.createEntry(
                NsdPackage.Literals.DOCUMENT_ROOT__COPYRIGHT, NsdFactory.eINSTANCE.createTCopyrightNotice() ) ) );

        newChildDescriptors.add( createChildParameter( NsdPackage.Literals.TDOC__MIXED, FeatureMapUtil
                .createEntry( NsdPackage.Literals.DOCUMENT_ROOT__NS, NsdFactory.eINSTANCE.createTNS() ) ) );

        newChildDescriptors.add( createChildParameter( NsdPackage.Literals.TDOC__MIXED, FeatureMapUtil
                .createEntry( NsdPackage.Literals.DOCUMENT_ROOT__NS_DOC, NsdFactory.eINSTANCE.createTNSDoc() ) ) );

        newChildDescriptors.add( createChildParameter( NsdPackage.Literals.TDOC__MIXED, FeatureMapUtil.createEntry(
                NsdPackage.Literals.DOCUMENT_ROOT__SERVICE_NS, NsdFactory.eINSTANCE.createTServiceNS() ) ) );
    }

    /**
     * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCreateChildText( Object owner, Object feature, Object child, Collection< ? > selection ) {
        Object childFeature = feature;
        Object childObject = child;

        if( childFeature instanceof EStructuralFeature
                && FeatureMapUtil.isFeatureMap( ( EStructuralFeature ) childFeature ) ) {
            FeatureMap.Entry entry = ( FeatureMap.Entry ) childObject;
            childFeature = entry.getEStructuralFeature();
            childObject = entry.getValue();
        }

        boolean qualify = childFeature == NsdPackage.Literals.DOCUMENT_ROOT__APPLICABLE_SERVICE_NS
                || childFeature == NsdPackage.Literals.DOCUMENT_ROOT__COPYRIGHT
                || childFeature == NsdPackage.Literals.DOCUMENT_ROOT__NS
                || childFeature == NsdPackage.Literals.DOCUMENT_ROOT__NS_DOC
                || childFeature == NsdPackage.Literals.DOCUMENT_ROOT__SERVICE_NS;

        if( qualify ) {
            return getString( "_UI_CreateChild_text2",
                    new Object[] { getTypeText( childObject ), getFeatureText( childFeature ), getTypeText( owner ) } );
        }
        return super.getCreateChildText( owner, feature, child, selection );
    }

    /**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return NSDEditPlugin.INSTANCE;
    }

}
