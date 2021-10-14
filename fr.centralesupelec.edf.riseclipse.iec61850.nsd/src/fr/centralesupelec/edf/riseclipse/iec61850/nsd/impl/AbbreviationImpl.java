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
package fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.TupleValue;

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviation;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviations;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdTables;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.util.NsIdentification;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.util.NsdResourceSetImpl;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abbreviation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AbbreviationImpl#getDescID <em>Desc ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AbbreviationImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AbbreviationImpl#getParentAbbreviations <em>Parent Abbreviations</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AbbreviationImpl#getRefersToDoc <em>Refers To Doc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbbreviationImpl extends NsdObjectImpl implements Abbreviation {
    /**
     * The default value of the '{@link #getDescID() <em>Desc ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDescID()
     * @generated
     * @ordered
     */
    protected static final String DESC_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDescID() <em>Desc ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDescID()
     * @generated
     * @ordered
     */
    protected String descID = DESC_ID_EDEFAULT;

    /**
     * This is true if the Desc ID attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean descIDESet;

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * This is true if the Name attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean nameESet;

    /**
     * The cached value of the '{@link #getRefersToDoc() <em>Refers To Doc</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToDoc()
     * @generated
     * @ordered
     */
    protected Doc refersToDoc;

    /**
     * This is true if the Refers To Doc reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToDocESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AbbreviationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.ABBREVIATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getDescID() {
        return descID;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDescID( String newDescID ) {
        String oldDescID = descID;
        descID = newDescID;
        boolean oldDescIDESet = descIDESet;
        descIDESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.ABBREVIATION__DESC_ID, oldDescID, descID,
                    !oldDescIDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDescID() {
        String oldDescID = descID;
        boolean oldDescIDESet = descIDESet;
        descID = DESC_ID_EDEFAULT;
        descIDESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.ABBREVIATION__DESC_ID, oldDescID,
                    DESC_ID_EDEFAULT, oldDescIDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDescID() {
        return descIDESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setName( String newName ) {
        String oldName = name;
        name = newName;
        boolean oldNameESet = nameESet;
        nameESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.ABBREVIATION__NAME, oldName, name,
                    !oldNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetName() {
        String oldName = name;
        boolean oldNameESet = nameESet;
        name = NAME_EDEFAULT;
        nameESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.ABBREVIATION__NAME, oldName,
                    NAME_EDEFAULT, oldNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetName() {
        return nameESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Abbreviations getParentAbbreviations() {
        if( eContainerFeatureID() != NsdPackage.ABBREVIATION__PARENT_ABBREVIATIONS ) return null;
        return ( Abbreviations ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentAbbreviations( Abbreviations newParentAbbreviations,
            NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentAbbreviations,
                NsdPackage.ABBREVIATION__PARENT_ABBREVIATIONS, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentAbbreviations( Abbreviations newParentAbbreviations ) {
        if( newParentAbbreviations != eInternalContainer()
                || ( eContainerFeatureID() != NsdPackage.ABBREVIATION__PARENT_ABBREVIATIONS
                        && newParentAbbreviations != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentAbbreviations ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            if( newParentAbbreviations != null )
                msgs = ( ( InternalEObject ) newParentAbbreviations ).eInverseAdd( this,
                        NsdPackage.ABBREVIATIONS__ABBREVIATION, Abbreviations.class, msgs );
            msgs = basicSetParentAbbreviations( newParentAbbreviations, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.ABBREVIATION__PARENT_ABBREVIATIONS,
                    newParentAbbreviations, newParentAbbreviations ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Doc getRefersToDoc() {
        return refersToDoc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToDoc( Doc newRefersToDoc, NotificationChain msgs ) {
        Doc oldRefersToDoc = refersToDoc;
        refersToDoc = newRefersToDoc;
        boolean oldRefersToDocESet = refersToDocESet;
        refersToDocESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    NsdPackage.ABBREVIATION__REFERS_TO_DOC, oldRefersToDoc, newRefersToDoc, !oldRefersToDocESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRefersToDoc( Doc newRefersToDoc ) {
        if( newRefersToDoc != refersToDoc ) {
            NotificationChain msgs = null;
            if( refersToDoc != null )
                msgs = ( ( InternalEObject ) refersToDoc ).eInverseRemove( this,
                        NsdPackage.DOC__REFERRED_BY_ABBREVIATION, Doc.class, msgs );
            if( newRefersToDoc != null )
                msgs = ( ( InternalEObject ) newRefersToDoc ).eInverseAdd( this,
                        NsdPackage.DOC__REFERRED_BY_ABBREVIATION, Doc.class, msgs );
            msgs = basicSetRefersToDoc( newRefersToDoc, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToDocESet = refersToDocESet;
            refersToDocESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.ABBREVIATION__REFERS_TO_DOC,
                        newRefersToDoc, newRefersToDoc, !oldRefersToDocESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToDoc( NotificationChain msgs ) {
        Doc oldRefersToDoc = refersToDoc;
        refersToDoc = null;
        boolean oldRefersToDocESet = refersToDocESet;
        refersToDocESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    NsdPackage.ABBREVIATION__REFERS_TO_DOC, oldRefersToDoc, null, oldRefersToDocESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRefersToDoc() {
        if( refersToDoc != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToDoc ).eInverseRemove( this, NsdPackage.DOC__REFERRED_BY_ABBREVIATION,
                    Doc.class, msgs );
            msgs = basicUnsetRefersToDoc( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToDocESet = refersToDocESet;
            refersToDocESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.ABBREVIATION__REFERS_TO_DOC, null,
                        null, oldRefersToDocESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToDoc() {
        return refersToDocESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean nameAttributeRequired( final DiagnosticChain diagnostics, final Map< Object, Object > context ) {
        final String constraintName = "Abbreviation::nameAttributeRequired";
        try {
            /**
             *
             * inv nameAttributeRequired:
             *   let severity : Integer[1] = constraintName.getSeverity()
             *   in
             *     if severity <= 0
             *     then true
             *     else
             *       let
             *         result : OclAny[1] = let status : Boolean[1] = self.name <> null
             *         in
             *           if status = true
             *           then true
             *           else
             *             Tuple{message = 'The name attribute is required', status = status
             *             }
             *           endif
             *       in
             *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
             *     endif
             */
            final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor( this, context );
            final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate( executor,
                    NsdPackage.Literals.ABBREVIATION___NAME_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP );
            final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
                    .evaluate( executor, severity_0, NsdTables.INT_0 ).booleanValue();
            /*@NonInvalid*/ boolean symbol_2;
            if( le ) {
                symbol_2 = true;
            }
            else {
                final /*@NonInvalid*/ String name = this.getName();
                final /*@NonInvalid*/ boolean status = name != null;
                /*@NonInvalid*/ Object symbol_1;
                if( status ) {
                    symbol_1 = ValueUtil.TRUE_VALUE;
                }
                else {
                    final /*@NonInvalid*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach( NsdTables.TUPLid_,
                            NsdTables.STR_The_32_name_32_attribute_32_is_32_required, status );
                    symbol_1 = symbol_0;
                }
                final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
                        .evaluate( executor, TypeId.BOOLEAN, constraintName, this, ( Object ) null, diagnostics,
                                context, ( Object ) null, severity_0, symbol_1, NsdTables.INT_0 )
                        .booleanValue();
                symbol_2 = logDiagnostic;
            }
            return symbol_2;
        }
        catch( Throwable e ) {
            return ValueUtil.validationFailedDiagnostic( constraintName, this, diagnostics, context, e );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case NsdPackage.ABBREVIATION__PARENT_ABBREVIATIONS:
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            return basicSetParentAbbreviations( ( Abbreviations ) otherEnd, msgs );
        case NsdPackage.ABBREVIATION__REFERS_TO_DOC:
            if( refersToDoc != null )
                msgs = ( ( InternalEObject ) refersToDoc ).eInverseRemove( this,
                        NsdPackage.DOC__REFERRED_BY_ABBREVIATION, Doc.class, msgs );
            return basicSetRefersToDoc( ( Doc ) otherEnd, msgs );
        }
        return super.eInverseAdd( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case NsdPackage.ABBREVIATION__PARENT_ABBREVIATIONS:
            return basicSetParentAbbreviations( null, msgs );
        case NsdPackage.ABBREVIATION__REFERS_TO_DOC:
            return basicUnsetRefersToDoc( msgs );
        }
        return super.eInverseRemove( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature( NotificationChain msgs ) {
        switch( eContainerFeatureID() ) {
        case NsdPackage.ABBREVIATION__PARENT_ABBREVIATIONS:
            return eInternalContainer().eInverseRemove( this, NsdPackage.ABBREVIATIONS__ABBREVIATION,
                    Abbreviations.class, msgs );
        }
        return super.eBasicRemoveFromContainerFeature( msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case NsdPackage.ABBREVIATION__DESC_ID:
            return getDescID();
        case NsdPackage.ABBREVIATION__NAME:
            return getName();
        case NsdPackage.ABBREVIATION__PARENT_ABBREVIATIONS:
            return getParentAbbreviations();
        case NsdPackage.ABBREVIATION__REFERS_TO_DOC:
            return getRefersToDoc();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case NsdPackage.ABBREVIATION__DESC_ID:
            setDescID( ( String ) newValue );
            return;
        case NsdPackage.ABBREVIATION__NAME:
            setName( ( String ) newValue );
            return;
        case NsdPackage.ABBREVIATION__PARENT_ABBREVIATIONS:
            setParentAbbreviations( ( Abbreviations ) newValue );
            return;
        case NsdPackage.ABBREVIATION__REFERS_TO_DOC:
            setRefersToDoc( ( Doc ) newValue );
            return;
        }
        super.eSet( featureID, newValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset( int featureID ) {
        switch( featureID ) {
        case NsdPackage.ABBREVIATION__DESC_ID:
            unsetDescID();
            return;
        case NsdPackage.ABBREVIATION__NAME:
            unsetName();
            return;
        case NsdPackage.ABBREVIATION__PARENT_ABBREVIATIONS:
            setParentAbbreviations( ( Abbreviations ) null );
            return;
        case NsdPackage.ABBREVIATION__REFERS_TO_DOC:
            unsetRefersToDoc();
            return;
        }
        super.eUnset( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet( int featureID ) {
        switch( featureID ) {
        case NsdPackage.ABBREVIATION__DESC_ID:
            return isSetDescID();
        case NsdPackage.ABBREVIATION__NAME:
            return isSetName();
        case NsdPackage.ABBREVIATION__PARENT_ABBREVIATIONS:
            return getParentAbbreviations() != null;
        case NsdPackage.ABBREVIATION__REFERS_TO_DOC:
            return isSetRefersToDoc();
        }
        return super.eIsSet( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    @SuppressWarnings( "unchecked" )
    public Object eInvoke( int operationID, EList< ? > arguments ) throws InvocationTargetException {
        switch( operationID ) {
        case NsdPackage.ABBREVIATION___NAME_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP:
            return nameAttributeRequired( ( DiagnosticChain ) arguments.get( 0 ),
                    ( Map< Object, Object > ) arguments.get( 1 ) );
        }
        return super.eInvoke( operationID, arguments );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if( eIsProxy() ) return super.toString();

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (descID: " );
        if( descIDESet )
            result.append( descID );
        else
            result.append( "<unset>" );
        result.append( ", name: " );
        if( nameESet )
            result.append( name );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

    @Override
    public boolean buildExplicitLinks( IRiseClipseConsole console, boolean forceUpdate ) {
        if( super.buildExplicitLinks( console, forceUpdate ) ) return true;

        if( isSetDescID() ) {
            if( this.eResource().getResourceSet() instanceof NsdResourceSetImpl ) {
                Doc doc = ( ( NsdResourceSetImpl ) this.eResource().getResourceSet() )
                        .findDoc( new NsIdentification( getParentAbbreviations().getParentNS() ), getDescID() );
                if( doc != null ) setRefersToDoc( doc );
            }
        }

        return false;
    }

} //AbbreviationImpl
