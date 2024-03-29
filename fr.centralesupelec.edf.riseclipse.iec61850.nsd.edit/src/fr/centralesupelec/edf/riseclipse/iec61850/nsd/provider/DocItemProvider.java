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

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdFactory;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DocItemProvider extends NsdObjectItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DocItemProvider( AdapterFactory adapterFactory ) {
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
            addReferredByAgNSDescPropertyDescriptor( object );
            addReferredByPresenceConditionAsDescPropertyDescriptor( object );
            addReferredByAgPresenceConditionPropertyDescriptor( object );
            addReferredByAbbreviationPropertyDescriptor( object );
            addReferredByBasicTypePropertyDescriptor( object );
            addReferredByDocumentedClassPropertyDescriptor( object );
            addReferredByFunctionalConstraintAsDescPropertyDescriptor( object );
            addReferredByAgPresenceConditionDerivedStatisticsPropertyDescriptor( object );
            addReferredByTitledClassPropertyDescriptor( object );
            addReferredByFunctionalConstraintAsTitlePropertyDescriptor( object );
            addReferredByPresenceConditionAsTitlePropertyDescriptor( object );
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
                        getResourceLocator(),
                        getString( "_UI_Doc_id_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Doc_id_feature", "_UI_Doc_type" ),
                        NsdPackage.Literals.DOC__ID,
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Referred By Ag NS Desc feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReferredByAgNSDescPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Doc_ReferredByAgNSDesc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Doc_ReferredByAgNSDesc_feature",
                                "_UI_Doc_type" ),
                        NsdPackage.Literals.DOC__REFERRED_BY_AG_NS_DESC,
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Referred By Presence Condition As Desc feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReferredByPresenceConditionAsDescPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Doc_referredByPresenceConditionAsDesc_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_Doc_referredByPresenceConditionAsDesc_feature", "_UI_Doc_type" ),
                        NsdPackage.Literals.DOC__REFERRED_BY_PRESENCE_CONDITION_AS_DESC,
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Referred By Ag Presence Condition feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReferredByAgPresenceConditionPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Doc_referredByAgPresenceCondition_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_Doc_referredByAgPresenceCondition_feature", "_UI_Doc_type" ),
                        NsdPackage.Literals.DOC__REFERRED_BY_AG_PRESENCE_CONDITION,
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Referred By Abbreviation feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReferredByAbbreviationPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Doc_referredByAbbreviation_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Doc_referredByAbbreviation_feature",
                                "_UI_Doc_type" ),
                        NsdPackage.Literals.DOC__REFERRED_BY_ABBREVIATION,
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Referred By Basic Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReferredByBasicTypePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Doc_referredByBasicType_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Doc_referredByBasicType_feature",
                                "_UI_Doc_type" ),
                        NsdPackage.Literals.DOC__REFERRED_BY_BASIC_TYPE,
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Referred By Documented Class feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReferredByDocumentedClassPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Doc_referredByDocumentedClass_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Doc_referredByDocumentedClass_feature",
                                "_UI_Doc_type" ),
                        NsdPackage.Literals.DOC__REFERRED_BY_DOCUMENTED_CLASS,
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Referred By Functional Constraint As Desc feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReferredByFunctionalConstraintAsDescPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Doc_referredByFunctionalConstraintAsDesc_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_Doc_referredByFunctionalConstraintAsDesc_feature", "_UI_Doc_type" ),
                        NsdPackage.Literals.DOC__REFERRED_BY_FUNCTIONAL_CONSTRAINT_AS_DESC,
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Referred By Ag Presence Condition Derived Statistics feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReferredByAgPresenceConditionDerivedStatisticsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Doc_referredByAgPresenceConditionDerivedStatistics_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_Doc_referredByAgPresenceConditionDerivedStatistics_feature", "_UI_Doc_type" ),
                        NsdPackage.Literals.DOC__REFERRED_BY_AG_PRESENCE_CONDITION_DERIVED_STATISTICS,
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Referred By Titled Class feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReferredByTitledClassPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Doc_referredByTitledClass_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Doc_referredByTitledClass_feature",
                                "_UI_Doc_type" ),
                        NsdPackage.Literals.DOC__REFERRED_BY_TITLED_CLASS,
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Referred By Functional Constraint As Title feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReferredByFunctionalConstraintAsTitlePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Doc_referredByFunctionalConstraintAsTitle_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_Doc_referredByFunctionalConstraintAsTitle_feature", "_UI_Doc_type" ),
                        NsdPackage.Literals.DOC__REFERRED_BY_FUNCTIONAL_CONSTRAINT_AS_TITLE,
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Referred By Presence Condition As Title feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReferredByPresenceConditionAsTitlePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Doc_referredByPresenceConditionAsTitle_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_Doc_referredByPresenceConditionAsTitle_feature", "_UI_Doc_type" ),
                        NsdPackage.Literals.DOC__REFERRED_BY_PRESENCE_CONDITION_AS_TITLE,
                        true,
                        false,
                        true,
                        null,
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
            childrenFeatures.add( NsdPackage.Literals.DOC__MIXED );
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
     * This returns Doc.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/Doc" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( Doc ) object ).getId();
        return label == null || label.length() == 0 ? getString( "_UI_Doc_type" )
                : getString( "_UI_Doc_type" ) + " " + label;
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

        switch( notification.getFeatureID( Doc.class ) ) {
        case NsdPackage.DOC__ID:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), false, true ) );
            return;
        case NsdPackage.DOC__MIXED:
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

        newChildDescriptors.add( createChildParameter( NsdPackage.Literals.DOC__MIXED,
                FeatureMapUtil.createEntry( XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__COMMENT,
                        "" ) ) );

        newChildDescriptors.add( createChildParameter( NsdPackage.Literals.DOC__MIXED,
                FeatureMapUtil.createEntry( XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__TEXT,
                        "" ) ) );

        newChildDescriptors.add( createChildParameter( NsdPackage.Literals.DOC__MIXED,
                FeatureMapUtil.createEntry( XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__PROCESSING_INSTRUCTION,
                        XMLTypeFactory.eINSTANCE.createProcessingInstruction() ) ) );

        newChildDescriptors.add( createChildParameter( NsdPackage.Literals.DOC__MIXED,
                FeatureMapUtil.createEntry( XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__CDATA,
                        "" ) ) );

        newChildDescriptors.add( createChildParameter( NsdPackage.Literals.DOC__MIXED,
                FeatureMapUtil.createEntry( NsdPackage.Literals.DOCUMENT_ROOT__APPLICABLE_SERVICE_NS,
                        NsdFactory.eINSTANCE.createApplicableServiceNS() ) ) );

        newChildDescriptors.add( createChildParameter( NsdPackage.Literals.DOC__MIXED,
                FeatureMapUtil.createEntry( NsdPackage.Literals.DOCUMENT_ROOT__NS,
                        NsdFactory.eINSTANCE.createNS() ) ) );

        newChildDescriptors.add( createChildParameter( NsdPackage.Literals.DOC__MIXED,
                FeatureMapUtil.createEntry( NsdPackage.Literals.DOCUMENT_ROOT__NS_DOC,
                        NsdFactory.eINSTANCE.createNSDoc() ) ) );

        newChildDescriptors.add( createChildParameter( NsdPackage.Literals.DOC__MIXED,
                FeatureMapUtil.createEntry( NsdPackage.Literals.DOCUMENT_ROOT__SERVICE_NS,
                        NsdFactory.eINSTANCE.createServiceNS() ) ) );
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

        boolean qualify = childFeature == NsdPackage.Literals.DOCUMENT_ROOT__APPLICABLE_SERVICE_NS ||
                childFeature == NsdPackage.Literals.DOCUMENT_ROOT__NS ||
                childFeature == NsdPackage.Literals.DOCUMENT_ROOT__NS_DOC ||
                childFeature == NsdPackage.Literals.DOCUMENT_ROOT__SERVICE_NS;

        if( qualify ) {
            return getString( "_UI_CreateChild_text2",
                    new Object[] { getTypeText( childObject ), getFeatureText( childFeature ), getTypeText( owner ) } );
        }
        return super.getCreateChildText( owner, feature, child, selection );
    }

}
