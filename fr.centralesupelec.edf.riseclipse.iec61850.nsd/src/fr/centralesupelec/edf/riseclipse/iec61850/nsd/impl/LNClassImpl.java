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

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AnyLNClass;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClass;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClasses;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdTables;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LN Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.LNClassImpl#isCanHaveLOG <em>Can Have LOG</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.LNClassImpl#isIsExtension <em>Is Extension</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.LNClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.LNClassImpl#getParentLNClasses <em>Parent LN Classes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LNClassImpl extends AnyLNClassImpl implements LNClass {
    /**
     * The default value of the '{@link #isCanHaveLOG() <em>Can Have LOG</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isCanHaveLOG()
     * @generated
     * @ordered
     */
    protected static final boolean CAN_HAVE_LOG_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isCanHaveLOG() <em>Can Have LOG</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isCanHaveLOG()
     * @generated
     * @ordered
     */
    protected boolean canHaveLOG = CAN_HAVE_LOG_EDEFAULT;

    /**
     * This is true if the Can Have LOG attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean canHaveLOGESet;

    /**
     * The default value of the '{@link #isIsExtension() <em>Is Extension</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsExtension()
     * @generated
     * @ordered
     */
    protected static final boolean IS_EXTENSION_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsExtension() <em>Is Extension</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsExtension()
     * @generated
     * @ordered
     */
    protected boolean isExtension = IS_EXTENSION_EDEFAULT;

    /**
     * This is true if the Is Extension attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isExtensionESet;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LNClassImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.LN_CLASS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isCanHaveLOG() {
        return canHaveLOG;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCanHaveLOG( boolean newCanHaveLOG ) {
        boolean oldCanHaveLOG = canHaveLOG;
        canHaveLOG = newCanHaveLOG;
        boolean oldCanHaveLOGESet = canHaveLOGESet;
        canHaveLOGESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.LN_CLASS__CAN_HAVE_LOG, oldCanHaveLOG,
                    canHaveLOG, !oldCanHaveLOGESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCanHaveLOG() {
        boolean oldCanHaveLOG = canHaveLOG;
        boolean oldCanHaveLOGESet = canHaveLOGESet;
        canHaveLOG = CAN_HAVE_LOG_EDEFAULT;
        canHaveLOGESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.LN_CLASS__CAN_HAVE_LOG, oldCanHaveLOG,
                    CAN_HAVE_LOG_EDEFAULT, oldCanHaveLOGESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCanHaveLOG() {
        return canHaveLOGESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isIsExtension() {
        return isExtension;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsExtension( boolean newIsExtension ) {
        boolean oldIsExtension = isExtension;
        isExtension = newIsExtension;
        boolean oldIsExtensionESet = isExtensionESet;
        isExtensionESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.LN_CLASS__IS_EXTENSION, oldIsExtension,
                    isExtension, !oldIsExtensionESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIsExtension() {
        boolean oldIsExtension = isExtension;
        boolean oldIsExtensionESet = isExtensionESet;
        isExtension = IS_EXTENSION_EDEFAULT;
        isExtensionESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.LN_CLASS__IS_EXTENSION, oldIsExtension,
                    IS_EXTENSION_EDEFAULT, oldIsExtensionESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIsExtension() {
        return isExtensionESet;
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
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.LN_CLASS__NAME, oldName, name,
                    !oldNameESet ) );
        }
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
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.LN_CLASS__NAME, oldName, NAME_EDEFAULT,
                    oldNameESet ) );
        }
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
        if( eContainerFeatureID() != NsdPackage.LN_CLASS__PARENT_LN_CLASSES ) {
            return null;
        }
        return ( LNClasses ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentLNClasses( LNClasses newParentLNClasses, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentLNClasses, NsdPackage.LN_CLASS__PARENT_LN_CLASSES,
                msgs );
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
                || ( eContainerFeatureID() != NsdPackage.LN_CLASS__PARENT_LN_CLASSES && newParentLNClasses != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentLNClasses ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentLNClasses != null ) {
                msgs = ( ( InternalEObject ) newParentLNClasses ).eInverseAdd( this, NsdPackage.LN_CLASSES__LN_CLASS,
                        LNClasses.class, msgs );
            }
            msgs = basicSetParentLNClasses( newParentLNClasses, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.LN_CLASS__PARENT_LN_CLASSES,
                    newParentLNClasses, newParentLNClasses ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean nameAttributeRequired( final DiagnosticChain diagnostics, final Map< Object, Object > context ) {
        final String constraintName = "LNClass::nameAttributeRequired";
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
            final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor( this );
            final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate( executor,
                    NsdPackage.Literals.LN_CLASS___NAME_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP );
            final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
                    .evaluate( executor, severity_0, NsdTables.INT_0 ).booleanValue();
            /*@NonInvalid*/ boolean IF_le;
            if( le ) {
                IF_le = true;
            }
            else {
                final /*@NonInvalid*/ String name = this.getName();
                final /*@NonInvalid*/ boolean status = name != null;
                /*@NonInvalid*/ Object IF_status;
                if( status ) {
                    IF_status = ValueUtil.TRUE_VALUE;
                }
                else {
                    final /*@NonInvalid*/ TupleValue TUP_ = ValueUtil.createTupleOfEach( NsdTables.TUPLid_,
                            NsdTables.STR_The_32_name_32_attribute_32_is_32_required, status );
                    IF_status = TUP_;
                }
                final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
                        .evaluate( executor, TypeId.BOOLEAN, constraintName, this, ( Object ) null, diagnostics,
                                context, ( Object ) null, severity_0, IF_status, NsdTables.INT_0 )
                        .booleanValue();
                IF_le = logDiagnostic;
            }
            return IF_le;
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
        case NsdPackage.LN_CLASS__PARENT_LN_CLASSES:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentLNClasses( ( LNClasses ) otherEnd, msgs );
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
        case NsdPackage.LN_CLASS__PARENT_LN_CLASSES:
            return basicSetParentLNClasses( null, msgs );
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
        case NsdPackage.LN_CLASS__PARENT_LN_CLASSES:
            return eInternalContainer().eInverseRemove( this, NsdPackage.LN_CLASSES__LN_CLASS, LNClasses.class, msgs );
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
        case NsdPackage.LN_CLASS__CAN_HAVE_LOG:
            return isCanHaveLOG();
        case NsdPackage.LN_CLASS__IS_EXTENSION:
            return isIsExtension();
        case NsdPackage.LN_CLASS__NAME:
            return getName();
        case NsdPackage.LN_CLASS__PARENT_LN_CLASSES:
            return getParentLNClasses();
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
        case NsdPackage.LN_CLASS__CAN_HAVE_LOG:
            setCanHaveLOG( ( Boolean ) newValue );
            return;
        case NsdPackage.LN_CLASS__IS_EXTENSION:
            setIsExtension( ( Boolean ) newValue );
            return;
        case NsdPackage.LN_CLASS__NAME:
            setName( ( String ) newValue );
            return;
        case NsdPackage.LN_CLASS__PARENT_LN_CLASSES:
            setParentLNClasses( ( LNClasses ) newValue );
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
        case NsdPackage.LN_CLASS__CAN_HAVE_LOG:
            unsetCanHaveLOG();
            return;
        case NsdPackage.LN_CLASS__IS_EXTENSION:
            unsetIsExtension();
            return;
        case NsdPackage.LN_CLASS__NAME:
            unsetName();
            return;
        case NsdPackage.LN_CLASS__PARENT_LN_CLASSES:
            setParentLNClasses( ( LNClasses ) null );
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
        case NsdPackage.LN_CLASS__CAN_HAVE_LOG:
            return isSetCanHaveLOG();
        case NsdPackage.LN_CLASS__IS_EXTENSION:
            return isSetIsExtension();
        case NsdPackage.LN_CLASS__NAME:
            return isSetName();
        case NsdPackage.LN_CLASS__PARENT_LN_CLASSES:
            return getParentLNClasses() != null;
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
        case NsdPackage.LN_CLASS___NAME_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP:
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
        if( eIsProxy() ) {
            return super.toString();
        }

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (canHaveLOG: " );
        if( canHaveLOGESet ) {
            result.append( canHaveLOG );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", isExtension: " );
        if( isExtensionESet ) {
            result.append( isExtension );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", name: " );
        if( nameESet ) {
            result.append( name );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ')' );
        return result.toString();
    }

    public void addDataObjectsFromExtendedLNClass( IRiseClipseConsole console ) {
        console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                "LNClassImpl.addDataObjectsFromExtendedLNClass() for: ",
                getName(), " in namespace \"", getNsIdentification(), "\"" );

        AnyLNClass lnClass = getResourceSet().findLNClass( getName(), getNsIdentification().getDependsOn(), true );
        if( lnClass == null ) {
            console.error( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    "while processing LNClass extension in namespace: ", getNsIdentification(),
                    ": LNClass (name: ", getName(), ") not found" );
            return;
        }
        while( lnClass != null ) {
            for( DataObject do_ : lnClass.getDataObject() ) {
                // An extension may replace a DataObject already present in the extended class,
                // for example to change its presence condition
                // See mail 9 February 2024 from Aurélie
                boolean alreadyPresent = getDataObject()
                        .stream()
                        .anyMatch( d -> d.getName().equals( do_.getName() ) );
                if( alreadyPresent ) {
                    continue;
                }
                DataObject copy = EcoreUtil.copy( do_ );
                getDataObject().add( copy );
                // filename not copied
                copy.setFilename( do_.getFilename() );
                // References not copied
                copy.setExplicitLinksBuilt( false );
                copy.buildExplicitLinks( console );
            }
            lnClass = lnClass.getRefersToAbstractLNClass();
        }
        return;
    }

} //LNClassImpl
