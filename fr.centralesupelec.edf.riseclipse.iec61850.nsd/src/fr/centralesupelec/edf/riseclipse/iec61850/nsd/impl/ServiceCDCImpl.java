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
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
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

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdTables;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDC;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDCs;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service CDC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceCDCImpl#getServiceDataAttribute <em>Service Data Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceCDCImpl#getCdc <em>Cdc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceCDCImpl#getVariant <em>Variant</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceCDCImpl#getParentServiceCDCs <em>Parent Service CD Cs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceCDCImpl extends NsdObjectImpl implements ServiceCDC {
    /**
     * The cached value of the '{@link #getServiceDataAttribute() <em>Service Data Attribute</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getServiceDataAttribute()
     * @generated
     * @ordered
     */
    protected EList< ServiceDataAttribute > serviceDataAttribute;

    /**
     * The default value of the '{@link #getCdc() <em>Cdc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCdc()
     * @generated
     * @ordered
     */
    protected static final String CDC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCdc() <em>Cdc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCdc()
     * @generated
     * @ordered
     */
    protected String cdc = CDC_EDEFAULT;

    /**
     * This is true if the Cdc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean cdcESet;

    /**
     * The default value of the '{@link #getVariant() <em>Variant</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVariant()
     * @generated
     * @ordered
     */
    protected static final String VARIANT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVariant() <em>Variant</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVariant()
     * @generated
     * @ordered
     */
    protected String variant = VARIANT_EDEFAULT;

    /**
     * This is true if the Variant attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean variantESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ServiceCDCImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.SERVICE_CDC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ServiceDataAttribute > getServiceDataAttribute() {
        if( serviceDataAttribute == null ) {
            serviceDataAttribute = new EObjectContainmentWithInverseEList.Unsettable< >(
                    ServiceDataAttribute.class, this, NsdPackage.SERVICE_CDC__SERVICE_DATA_ATTRIBUTE,
                    NsdPackage.SERVICE_DATA_ATTRIBUTE__PARENT_SERVICE_CDC );
        }
        return serviceDataAttribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetServiceDataAttribute() {
        if( serviceDataAttribute != null ) {
            ( ( InternalEList.Unsettable< ? > ) serviceDataAttribute ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetServiceDataAttribute() {
        return serviceDataAttribute != null && ( ( InternalEList.Unsettable< ? > ) serviceDataAttribute ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCdc() {
        return cdc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCdc( String newCdc ) {
        String oldCdc = cdc;
        cdc = newCdc;
        boolean oldCdcESet = cdcESet;
        cdcESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.SERVICE_CDC__CDC, oldCdc, cdc,
                    !oldCdcESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCdc() {
        String oldCdc = cdc;
        boolean oldCdcESet = cdcESet;
        cdc = CDC_EDEFAULT;
        cdcESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.SERVICE_CDC__CDC, oldCdc, CDC_EDEFAULT,
                    oldCdcESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCdc() {
        return cdcESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getVariant() {
        return variant;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVariant( String newVariant ) {
        String oldVariant = variant;
        variant = newVariant;
        boolean oldVariantESet = variantESet;
        variantESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.SERVICE_CDC__VARIANT, oldVariant,
                    variant, !oldVariantESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVariant() {
        String oldVariant = variant;
        boolean oldVariantESet = variantESet;
        variant = VARIANT_EDEFAULT;
        variantESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.SERVICE_CDC__VARIANT, oldVariant,
                    VARIANT_EDEFAULT, oldVariantESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVariant() {
        return variantESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServiceCDCs getParentServiceCDCs() {
        if( eContainerFeatureID() != NsdPackage.SERVICE_CDC__PARENT_SERVICE_CD_CS ) {
            return null;
        }
        return ( ServiceCDCs ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentServiceCDCs( ServiceCDCs newParentServiceCDCs, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentServiceCDCs,
                NsdPackage.SERVICE_CDC__PARENT_SERVICE_CD_CS, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentServiceCDCs( ServiceCDCs newParentServiceCDCs ) {
        if( newParentServiceCDCs != eInternalContainer()
                || ( eContainerFeatureID() != NsdPackage.SERVICE_CDC__PARENT_SERVICE_CD_CS
                        && newParentServiceCDCs != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentServiceCDCs ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentServiceCDCs != null ) {
                msgs = ( ( InternalEObject ) newParentServiceCDCs ).eInverseAdd( this,
                        NsdPackage.SERVICE_CD_CS__SERVICE_CDC, ServiceCDCs.class, msgs );
            }
            msgs = basicSetParentServiceCDCs( newParentServiceCDCs, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.SERVICE_CDC__PARENT_SERVICE_CD_CS,
                    newParentServiceCDCs, newParentServiceCDCs ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean cdcAttributeRequired( final DiagnosticChain diagnostics, final Map< Object, Object > context ) {
        final String constraintName = "ServiceCDC::cdcAttributeRequired";
        try {
            /**
             *
             * inv cdcAttributeRequired:
             *   let severity : Integer[1] = constraintName.getSeverity()
             *   in
             *     if severity <= 0
             *     then true
             *     else
             *       let
             *         result : OclAny[1] = let status : Boolean[1] = self.cdc <> null
             *         in
             *           if status = true
             *           then true
             *           else
             *             Tuple{message = 'The cdc attribute is required', status = status
             *             }
             *           endif
             *       in
             *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
             *     endif
             */
            final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor( this );
            final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate( executor,
                    NsdPackage.Literals.SERVICE_CDC___CDC_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP );
            final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
                    .evaluate( executor, severity_0, NsdTables.INT_0 ).booleanValue();
            /*@NonInvalid*/ boolean IF_le;
            if( le ) {
                IF_le = true;
            }
            else {
                final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
                        .evaluate( executor, TypeId.BOOLEAN, constraintName, this, ( Object ) null, diagnostics,
                                context, ( Object ) null, severity_0, ValueUtil.TRUE_VALUE, NsdTables.INT_0 )
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
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case NsdPackage.SERVICE_CDC__SERVICE_DATA_ATTRIBUTE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getServiceDataAttribute() )
                    .basicAdd( otherEnd, msgs );
        case NsdPackage.SERVICE_CDC__PARENT_SERVICE_CD_CS:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentServiceCDCs( ( ServiceCDCs ) otherEnd, msgs );
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
        case NsdPackage.SERVICE_CDC__SERVICE_DATA_ATTRIBUTE:
            return ( ( InternalEList< ? > ) getServiceDataAttribute() ).basicRemove( otherEnd, msgs );
        case NsdPackage.SERVICE_CDC__PARENT_SERVICE_CD_CS:
            return basicSetParentServiceCDCs( null, msgs );
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
        case NsdPackage.SERVICE_CDC__PARENT_SERVICE_CD_CS:
            return eInternalContainer().eInverseRemove( this, NsdPackage.SERVICE_CD_CS__SERVICE_CDC, ServiceCDCs.class,
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
        case NsdPackage.SERVICE_CDC__SERVICE_DATA_ATTRIBUTE:
            return getServiceDataAttribute();
        case NsdPackage.SERVICE_CDC__CDC:
            return getCdc();
        case NsdPackage.SERVICE_CDC__VARIANT:
            return getVariant();
        case NsdPackage.SERVICE_CDC__PARENT_SERVICE_CD_CS:
            return getParentServiceCDCs();
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
        case NsdPackage.SERVICE_CDC__SERVICE_DATA_ATTRIBUTE:
            getServiceDataAttribute().clear();
            getServiceDataAttribute().addAll( ( Collection< ? extends ServiceDataAttribute > ) newValue );
            return;
        case NsdPackage.SERVICE_CDC__CDC:
            setCdc( ( String ) newValue );
            return;
        case NsdPackage.SERVICE_CDC__VARIANT:
            setVariant( ( String ) newValue );
            return;
        case NsdPackage.SERVICE_CDC__PARENT_SERVICE_CD_CS:
            setParentServiceCDCs( ( ServiceCDCs ) newValue );
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
        case NsdPackage.SERVICE_CDC__SERVICE_DATA_ATTRIBUTE:
            unsetServiceDataAttribute();
            return;
        case NsdPackage.SERVICE_CDC__CDC:
            unsetCdc();
            return;
        case NsdPackage.SERVICE_CDC__VARIANT:
            unsetVariant();
            return;
        case NsdPackage.SERVICE_CDC__PARENT_SERVICE_CD_CS:
            setParentServiceCDCs( ( ServiceCDCs ) null );
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
        case NsdPackage.SERVICE_CDC__SERVICE_DATA_ATTRIBUTE:
            return isSetServiceDataAttribute();
        case NsdPackage.SERVICE_CDC__CDC:
            return isSetCdc();
        case NsdPackage.SERVICE_CDC__VARIANT:
            return isSetVariant();
        case NsdPackage.SERVICE_CDC__PARENT_SERVICE_CD_CS:
            return getParentServiceCDCs() != null;
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
        case NsdPackage.SERVICE_CDC___CDC_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP:
            return cdcAttributeRequired( ( DiagnosticChain ) arguments.get( 0 ),
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
        result.append( " (cdc: " );
        if( cdcESet ) {
            result.append( cdc );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", variant: " );
        if( variantESet ) {
            result.append( variant );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ')' );
        return result.toString();
    }

} //ServiceCDCImpl
