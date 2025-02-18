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
package fr.centralesupelec.edf.riseclipse.iec61850.nsd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Defined Attribute Type Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDefinedAttributeTypeKind()
 * @model extendedMetaData="name='tDefinedAttributeTypeKind'"
 * @generated
 */
public enum DefinedAttributeTypeKind implements Enumerator {
    /**
     * The '<em><b>BASIC</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The type of the data attribute is a basic one (e.g., BOOLEAN, INT32), including CODED ENUMs (e.g., Dbpos, Tcmd) and PACKED LISTs (Timestamp, Quality, OptFlds).
     * <!-- end-model-doc -->
     * @see #BASIC_VALUE
     * @generated
     * @ordered
     */
    BASIC( 0, "BASIC", "BASIC" ),

    /**
     * The '<em><b>ENUMERATED</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The type of the data attribute is an enumeration.
     * <!-- end-model-doc -->
     * @see #ENUMERATED_VALUE
     * @generated
     * @ordered
     */
    ENUMERATED( 1, "ENUMERATED", "ENUMERATED" ),

    /**
     * The '<em><b>CONSTRUCTED</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The type of the data attribute is a constructed (composed) one.
     * <!-- end-model-doc -->
     * @see #CONSTRUCTED_VALUE
     * @generated
     * @ordered
     */
    CONSTRUCTED( 2, "CONSTRUCTED", "CONSTRUCTED" ),
    /**
    * The '<em><b>SCSM</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * The type of the data attribute is defined by an SCSM ServiceTypeRealization.
    * <!-- end-model-doc -->
    * @see #SCSM_VALUE
    * @generated
    * @ordered
    */
    SCSM( 3, "SCSM", "SCSM" );

    /**
     * The '<em><b>BASIC</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The type of the data attribute is a basic one (e.g., BOOLEAN, INT32), including CODED ENUMs (e.g., Dbpos, Tcmd) and PACKED LISTs (Timestamp, Quality, OptFlds).
     * <!-- end-model-doc -->
     * @see #BASIC
     * @model
     * @generated
     * @ordered
     */
    public static final int BASIC_VALUE = 0;

    /**
     * The '<em><b>ENUMERATED</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The type of the data attribute is an enumeration.
     * <!-- end-model-doc -->
     * @see #ENUMERATED
     * @model
     * @generated
     * @ordered
     */
    public static final int ENUMERATED_VALUE = 1;

    /**
     * The '<em><b>CONSTRUCTED</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The type of the data attribute is a constructed (composed) one.
     * <!-- end-model-doc -->
     * @see #CONSTRUCTED
     * @model
     * @generated
     * @ordered
     */
    public static final int CONSTRUCTED_VALUE = 2;

    /**
     * The '<em><b>SCSM</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The type of the data attribute is defined by an SCSM ServiceTypeRealization.
     * <!-- end-model-doc -->
     * @see #SCSM
     * @model
     * @generated
     * @ordered
     */
    public static final int SCSM_VALUE = 3;

    /**
     * An array of all the '<em><b>Defined Attribute Type Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final DefinedAttributeTypeKind[] VALUES_ARRAY = new DefinedAttributeTypeKind[] {
            BASIC,
            ENUMERATED,
            CONSTRUCTED,
            SCSM,
    };

    /**
     * A public read-only list of all the '<em><b>Defined Attribute Type Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< DefinedAttributeTypeKind > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Defined Attribute Type Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static DefinedAttributeTypeKind get( String literal ) {
        for( DefinedAttributeTypeKind result : VALUES_ARRAY ) {
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Defined Attribute Type Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static DefinedAttributeTypeKind getByName( String name ) {
        for( DefinedAttributeTypeKind result : VALUES_ARRAY ) {
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Defined Attribute Type Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static DefinedAttributeTypeKind get( int value ) {
        switch( value ) {
        case BASIC_VALUE:
            return BASIC;
        case ENUMERATED_VALUE:
            return ENUMERATED;
        case CONSTRUCTED_VALUE:
            return CONSTRUCTED;
        case SCSM_VALUE:
            return SCSM;
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
    private DefinedAttributeTypeKind( int value, String name, String literal ) {
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

} //DefinedAttributeTypeKind
