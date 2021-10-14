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
package fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.TupleValue;

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AbstractLNClass;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AnyLNClass;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClasses;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract LN Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AbstractLNClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AbstractLNClassImpl#getParentLNClasses <em>Parent LN Classes</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AbstractLNClassImpl#getReferredByAnyLNClass <em>Referred By Any LN Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractLNClassImpl extends AnyLNClassImpl implements AbstractLNClass {
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
     * The cached value of the '{@link #getReferredByAnyLNClass() <em>Referred By Any LN Class</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredByAnyLNClass()
     * @generated
     * @ordered
     */
    protected EList< AnyLNClass > referredByAnyLNClass;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AbstractLNClassImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.ABSTRACT_LN_CLASS;
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
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.ABSTRACT_LN_CLASS__NAME, oldName, name,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.ABSTRACT_LN_CLASS__NAME, oldName,
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
    public LNClasses getParentLNClasses() {
        if( eContainerFeatureID() != NsdPackage.ABSTRACT_LN_CLASS__PARENT_LN_CLASSES ) return null;
        return ( LNClasses ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentLNClasses( LNClasses newParentLNClasses, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentLNClasses,
                NsdPackage.ABSTRACT_LN_CLASS__PARENT_LN_CLASSES, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentLNClasses( LNClasses newParentLNClasses ) {
        if( newParentLNClasses != eInternalContainer()
                || ( eContainerFeatureID() != NsdPackage.ABSTRACT_LN_CLASS__PARENT_LN_CLASSES
                        && newParentLNClasses != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentLNClasses ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            if( newParentLNClasses != null )
                msgs = ( ( InternalEObject ) newParentLNClasses ).eInverseAdd( this,
                        NsdPackage.LN_CLASSES__ABSTRACT_LN_CLASS, LNClasses.class, msgs );
            msgs = basicSetParentLNClasses( newParentLNClasses, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.ABSTRACT_LN_CLASS__PARENT_LN_CLASSES,
                    newParentLNClasses, newParentLNClasses ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< AnyLNClass > getReferredByAnyLNClass() {
        if( referredByAnyLNClass == null ) {
            referredByAnyLNClass = new EObjectWithInverseResolvingEList.Unsettable< >( AnyLNClass.class,
                    this, NsdPackage.ABSTRACT_LN_CLASS__REFERRED_BY_ANY_LN_CLASS,
                    NsdPackage.ANY_LN_CLASS__REFERS_TO_ABSTRACT_LN_CLASS );
        }
        return referredByAnyLNClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredByAnyLNClass() {
        if( referredByAnyLNClass != null ) ( ( InternalEList.Unsettable< ? > ) referredByAnyLNClass ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredByAnyLNClass() {
        return referredByAnyLNClass != null && ( ( InternalEList.Unsettable< ? > ) referredByAnyLNClass ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean nameAttributeRequired( final DiagnosticChain diagnostics, final Map< Object, Object > context ) {
        final String constraintName = "AbstractLNClass::nameAttributeRequired";
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
                    NsdPackage.Literals.ABSTRACT_LN_CLASS___NAME_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP );
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
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case NsdPackage.ABSTRACT_LN_CLASS__PARENT_LN_CLASSES:
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            return basicSetParentLNClasses( ( LNClasses ) otherEnd, msgs );
        case NsdPackage.ABSTRACT_LN_CLASS__REFERRED_BY_ANY_LN_CLASS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReferredByAnyLNClass() )
                    .basicAdd( otherEnd, msgs );
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
        case NsdPackage.ABSTRACT_LN_CLASS__PARENT_LN_CLASSES:
            return basicSetParentLNClasses( null, msgs );
        case NsdPackage.ABSTRACT_LN_CLASS__REFERRED_BY_ANY_LN_CLASS:
            return ( ( InternalEList< ? > ) getReferredByAnyLNClass() ).basicRemove( otherEnd, msgs );
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
        case NsdPackage.ABSTRACT_LN_CLASS__PARENT_LN_CLASSES:
            return eInternalContainer().eInverseRemove( this, NsdPackage.LN_CLASSES__ABSTRACT_LN_CLASS, LNClasses.class,
                    msgs );
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
        case NsdPackage.ABSTRACT_LN_CLASS__NAME:
            return getName();
        case NsdPackage.ABSTRACT_LN_CLASS__PARENT_LN_CLASSES:
            return getParentLNClasses();
        case NsdPackage.ABSTRACT_LN_CLASS__REFERRED_BY_ANY_LN_CLASS:
            return getReferredByAnyLNClass();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case NsdPackage.ABSTRACT_LN_CLASS__NAME:
            setName( ( String ) newValue );
            return;
        case NsdPackage.ABSTRACT_LN_CLASS__PARENT_LN_CLASSES:
            setParentLNClasses( ( LNClasses ) newValue );
            return;
        case NsdPackage.ABSTRACT_LN_CLASS__REFERRED_BY_ANY_LN_CLASS:
            getReferredByAnyLNClass().clear();
            getReferredByAnyLNClass().addAll( ( Collection< ? extends AnyLNClass > ) newValue );
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
        case NsdPackage.ABSTRACT_LN_CLASS__NAME:
            unsetName();
            return;
        case NsdPackage.ABSTRACT_LN_CLASS__PARENT_LN_CLASSES:
            setParentLNClasses( ( LNClasses ) null );
            return;
        case NsdPackage.ABSTRACT_LN_CLASS__REFERRED_BY_ANY_LN_CLASS:
            unsetReferredByAnyLNClass();
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
        case NsdPackage.ABSTRACT_LN_CLASS__NAME:
            return isSetName();
        case NsdPackage.ABSTRACT_LN_CLASS__PARENT_LN_CLASSES:
            return getParentLNClasses() != null;
        case NsdPackage.ABSTRACT_LN_CLASS__REFERRED_BY_ANY_LN_CLASS:
            return isSetReferredByAnyLNClass();
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
        case NsdPackage.ABSTRACT_LN_CLASS___NAME_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP:
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
        result.append( " (name: " );
        if( nameESet )
            result.append( name );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //AbstractLNClassImpl
