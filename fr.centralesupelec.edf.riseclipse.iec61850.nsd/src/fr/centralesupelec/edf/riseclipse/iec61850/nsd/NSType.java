/*
 *  Copyright (c) 2016-2025 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v2.0
 *  which accompanies this distribution, and is available at
 *  https://www.eclipse.org/legal/epl-v20.html
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
 *      https://riseclipse.github.io/
 *
 */
package fr.centralesupelec.edf.riseclipse.iec61850.nsd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>NS Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Type of namespace.
 * <!-- end-model-doc -->
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getNSType()
 * @model extendedMetaData="name='tNSType'"
 * @generated
 */
public enum NSType implements Enumerator {
    /**
     * The '<em><b>Basic</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Basic namespace
     * <!-- end-model-doc -->
     * @see #BASIC_VALUE
     * @generated
     * @ordered
     */
    BASIC( 0, "basic", "basic" ),

    /**
     * The '<em><b>Domain</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Domain namespace
     * <!-- end-model-doc -->
     * @see #DOMAIN_VALUE
     * @generated
     * @ordered
     */
    DOMAIN( 1, "domain", "domain" ),

    /**
     * The '<em><b>Transitional</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Transitional namespace
     * <!-- end-model-doc -->
     * @see #TRANSITIONAL_VALUE
     * @generated
     * @ordered
     */
    TRANSITIONAL( 2, "transitional", "transitional" ),

    /**
     * The '<em><b>Product</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Product namespace
     * <!-- end-model-doc -->
     * @see #PRODUCT_VALUE
     * @generated
     * @ordered
     */
    PRODUCT( 3, "product", "product" ),

    /**
     * The '<em><b>Private</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Private namespace
     * <!-- end-model-doc -->
     * @see #PRIVATE_VALUE
     * @generated
     * @ordered
     */
    PRIVATE( 4, "private", "private" );

    /**
     * The '<em><b>Basic</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Basic namespace
     * <!-- end-model-doc -->
     * @see #BASIC
     * @model name="basic"
     * @generated
     * @ordered
     */
    public static final int BASIC_VALUE = 0;

    /**
     * The '<em><b>Domain</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Domain namespace
     * <!-- end-model-doc -->
     * @see #DOMAIN
     * @model name="domain"
     * @generated
     * @ordered
     */
    public static final int DOMAIN_VALUE = 1;

    /**
     * The '<em><b>Transitional</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Transitional namespace
     * <!-- end-model-doc -->
     * @see #TRANSITIONAL
     * @model name="transitional"
     * @generated
     * @ordered
     */
    public static final int TRANSITIONAL_VALUE = 2;

    /**
     * The '<em><b>Product</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Product namespace
     * <!-- end-model-doc -->
     * @see #PRODUCT
     * @model name="product"
     * @generated
     * @ordered
     */
    public static final int PRODUCT_VALUE = 3;

    /**
     * The '<em><b>Private</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Private namespace
     * <!-- end-model-doc -->
     * @see #PRIVATE
     * @model name="private"
     * @generated
     * @ordered
     */
    public static final int PRIVATE_VALUE = 4;

    /**
     * An array of all the '<em><b>NS Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final NSType[] VALUES_ARRAY = new NSType[] {
            BASIC,
            DOMAIN,
            TRANSITIONAL,
            PRODUCT,
            PRIVATE,
    };

    /**
     * A public read-only list of all the '<em><b>NS Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< NSType > VALUES = Collections.unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>NS Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static NSType get( String literal ) {
        for( NSType result : VALUES_ARRAY ) {
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>NS Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static NSType getByName( String name ) {
        for( NSType result : VALUES_ARRAY ) {
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>NS Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static NSType get( int value ) {
        switch( value ) {
        case BASIC_VALUE:
            return BASIC;
        case DOMAIN_VALUE:
            return DOMAIN;
        case TRANSITIONAL_VALUE:
            return TRANSITIONAL;
        case PRODUCT_VALUE:
            return PRODUCT;
        case PRIVATE_VALUE:
            return PRIVATE;
        }
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final int value;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String name;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String literal;

    /**
     * Only this class can construct instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private NSType( int value, String name, String literal ) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int getValue() {
        return value;
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
    public String getLiteral() {
        return literal;
    }

    /**
     * Returns the literal value of the enumerator, which is its string representation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        return literal;
    }

} //NSType
