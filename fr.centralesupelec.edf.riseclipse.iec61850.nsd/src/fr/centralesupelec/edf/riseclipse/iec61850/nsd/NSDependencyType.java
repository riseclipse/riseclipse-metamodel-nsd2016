/**
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
 * A representation of the literals of the enumeration '<em><b>NS Dependency Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Type of namespace dependency.
 * <!-- end-model-doc -->
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getNSDependencyType()
 * @model extendedMetaData="name='tNSDependencyType'"
 * @generated
 */
public enum NSDependencyType implements Enumerator {
    /**
     * The '<em><b>Depends On</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * This namespace depends on the one mentioned
     * <!-- end-model-doc -->
     * @see #DEPENDS_ON_VALUE
     * @generated
     * @ordered
     */
    DEPENDS_ON( 0, "dependsOn", "dependsOn" ),

    /**
     * The '<em><b>Includes</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * This namespace includes on the one mentioned
     * <!-- end-model-doc -->
     * @see #INCLUDES_VALUE
     * @generated
     * @ordered
     */
    INCLUDES( 1, "includes", "includes" ),

    /**
     * The '<em><b>Extends</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * This namespace extends on the one mentioned
     * <!-- end-model-doc -->
     * @see #EXTENDS_VALUE
     * @generated
     * @ordered
     */
    EXTENDS( 2, "extends", "extends" );

    /**
     * The '<em><b>Depends On</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * This namespace depends on the one mentioned
     * <!-- end-model-doc -->
     * @see #DEPENDS_ON
     * @model name="dependsOn"
     * @generated
     * @ordered
     */
    public static final int DEPENDS_ON_VALUE = 0;

    /**
     * The '<em><b>Includes</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * This namespace includes on the one mentioned
     * <!-- end-model-doc -->
     * @see #INCLUDES
     * @model name="includes"
     * @generated
     * @ordered
     */
    public static final int INCLUDES_VALUE = 1;

    /**
     * The '<em><b>Extends</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * This namespace extends on the one mentioned
     * <!-- end-model-doc -->
     * @see #EXTENDS
     * @model name="extends"
     * @generated
     * @ordered
     */
    public static final int EXTENDS_VALUE = 2;

    /**
     * An array of all the '<em><b>NS Dependency Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final NSDependencyType[] VALUES_ARRAY = new NSDependencyType[] {
            DEPENDS_ON,
            INCLUDES,
            EXTENDS,
    };

    /**
     * A public read-only list of all the '<em><b>NS Dependency Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< NSDependencyType > VALUES = Collections.unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>NS Dependency Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static NSDependencyType get( String literal ) {
        for( NSDependencyType result : VALUES_ARRAY ) {
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>NS Dependency Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static NSDependencyType getByName( String name ) {
        for( NSDependencyType result : VALUES_ARRAY ) {
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>NS Dependency Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static NSDependencyType get( int value ) {
        switch( value ) {
        case DEPENDS_ON_VALUE:
            return DEPENDS_ON;
        case INCLUDES_VALUE:
            return INCLUDES;
        case EXTENDS_VALUE:
            return EXTENDS;
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
    private NSDependencyType( int value, String name, String literal ) {
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

} //NSDependencyType
