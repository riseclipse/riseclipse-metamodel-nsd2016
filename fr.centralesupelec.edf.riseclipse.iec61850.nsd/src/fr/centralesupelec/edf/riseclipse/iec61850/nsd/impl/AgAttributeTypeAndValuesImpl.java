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
package fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl;

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgAttributeTypeAndValues;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ag Attribute Type And Values</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AgAttributeTypeAndValuesImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AgAttributeTypeAndValuesImpl#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AgAttributeTypeAndValuesImpl#getMinValue <em>Min Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AgAttributeTypeAndValuesImpl extends AgAttributeTypeImpl implements AgAttributeTypeAndValues {
    /**
     * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefaultValue()
     * @generated
     * @ordered
     */
    protected static final String DEFAULT_VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefaultValue()
     * @generated
     * @ordered
     */
    protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

    /**
     * This is true if the Default Value attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean defaultValueESet;

    /**
     * The default value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxValue()
     * @generated
     * @ordered
     */
    protected static final BigDecimal MAX_VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxValue()
     * @generated
     * @ordered
     */
    protected BigDecimal maxValue = MAX_VALUE_EDEFAULT;

    /**
     * This is true if the Max Value attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maxValueESet;

    /**
     * The default value of the '{@link #getMinValue() <em>Min Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinValue()
     * @generated
     * @ordered
     */
    protected static final BigDecimal MIN_VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMinValue() <em>Min Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinValue()
     * @generated
     * @ordered
     */
    protected BigDecimal minValue = MIN_VALUE_EDEFAULT;

    /**
     * This is true if the Min Value attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean minValueESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AgAttributeTypeAndValuesImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.AG_ATTRIBUTE_TYPE_AND_VALUES;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDefaultValue( String newDefaultValue ) {
        String oldDefaultValue = defaultValue;
        defaultValue = newDefaultValue;
        boolean oldDefaultValueESet = defaultValueESet;
        defaultValueESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    NsdPackage.AG_ATTRIBUTE_TYPE_AND_VALUES__DEFAULT_VALUE, oldDefaultValue, defaultValue,
                    !oldDefaultValueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDefaultValue() {
        String oldDefaultValue = defaultValue;
        boolean oldDefaultValueESet = defaultValueESet;
        defaultValue = DEFAULT_VALUE_EDEFAULT;
        defaultValueESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    NsdPackage.AG_ATTRIBUTE_TYPE_AND_VALUES__DEFAULT_VALUE, oldDefaultValue, DEFAULT_VALUE_EDEFAULT,
                    oldDefaultValueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDefaultValue() {
        return defaultValueESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BigDecimal getMaxValue() {
        return maxValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaxValue( BigDecimal newMaxValue ) {
        BigDecimal oldMaxValue = maxValue;
        maxValue = newMaxValue;
        boolean oldMaxValueESet = maxValueESet;
        maxValueESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.AG_ATTRIBUTE_TYPE_AND_VALUES__MAX_VALUE,
                    oldMaxValue, maxValue, !oldMaxValueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMaxValue() {
        BigDecimal oldMaxValue = maxValue;
        boolean oldMaxValueESet = maxValueESet;
        maxValue = MAX_VALUE_EDEFAULT;
        maxValueESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    NsdPackage.AG_ATTRIBUTE_TYPE_AND_VALUES__MAX_VALUE, oldMaxValue, MAX_VALUE_EDEFAULT,
                    oldMaxValueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMaxValue() {
        return maxValueESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BigDecimal getMinValue() {
        return minValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMinValue( BigDecimal newMinValue ) {
        BigDecimal oldMinValue = minValue;
        minValue = newMinValue;
        boolean oldMinValueESet = minValueESet;
        minValueESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.AG_ATTRIBUTE_TYPE_AND_VALUES__MIN_VALUE,
                    oldMinValue, minValue, !oldMinValueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMinValue() {
        BigDecimal oldMinValue = minValue;
        boolean oldMinValueESet = minValueESet;
        minValue = MIN_VALUE_EDEFAULT;
        minValueESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    NsdPackage.AG_ATTRIBUTE_TYPE_AND_VALUES__MIN_VALUE, oldMinValue, MIN_VALUE_EDEFAULT,
                    oldMinValueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMinValue() {
        return minValueESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case NsdPackage.AG_ATTRIBUTE_TYPE_AND_VALUES__DEFAULT_VALUE:
            return getDefaultValue();
        case NsdPackage.AG_ATTRIBUTE_TYPE_AND_VALUES__MAX_VALUE:
            return getMaxValue();
        case NsdPackage.AG_ATTRIBUTE_TYPE_AND_VALUES__MIN_VALUE:
            return getMinValue();
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
        case NsdPackage.AG_ATTRIBUTE_TYPE_AND_VALUES__DEFAULT_VALUE:
            setDefaultValue( ( String ) newValue );
            return;
        case NsdPackage.AG_ATTRIBUTE_TYPE_AND_VALUES__MAX_VALUE:
            setMaxValue( ( BigDecimal ) newValue );
            return;
        case NsdPackage.AG_ATTRIBUTE_TYPE_AND_VALUES__MIN_VALUE:
            setMinValue( ( BigDecimal ) newValue );
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
        case NsdPackage.AG_ATTRIBUTE_TYPE_AND_VALUES__DEFAULT_VALUE:
            unsetDefaultValue();
            return;
        case NsdPackage.AG_ATTRIBUTE_TYPE_AND_VALUES__MAX_VALUE:
            unsetMaxValue();
            return;
        case NsdPackage.AG_ATTRIBUTE_TYPE_AND_VALUES__MIN_VALUE:
            unsetMinValue();
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
        case NsdPackage.AG_ATTRIBUTE_TYPE_AND_VALUES__DEFAULT_VALUE:
            return isSetDefaultValue();
        case NsdPackage.AG_ATTRIBUTE_TYPE_AND_VALUES__MAX_VALUE:
            return isSetMaxValue();
        case NsdPackage.AG_ATTRIBUTE_TYPE_AND_VALUES__MIN_VALUE:
            return isSetMinValue();
        }
        return super.eIsSet( featureID );
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
        result.append( " (defaultValue: " );
        if( defaultValueESet )
            result.append( defaultValue );
        else
            result.append( "<unset>" );
        result.append( ", maxValue: " );
        if( maxValueESet )
            result.append( maxValue );
        else
            result.append( "<unset>" );
        result.append( ", minValue: " );
        if( minValueESet )
            result.append( minValue );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //AgAttributeTypeAndValuesImpl
