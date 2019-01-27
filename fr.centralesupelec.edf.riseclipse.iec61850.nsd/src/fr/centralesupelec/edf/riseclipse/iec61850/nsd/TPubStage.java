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
package fr.centralesupelec.edf.riseclipse.iec61850.nsd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>TPub Stage</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Publication stage of the namespace.
 * <!-- end-model-doc -->
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTPubStage()
 * @model extendedMetaData="name='tPubStage'"
 * @generated
 */
public enum TPubStage implements Enumerator {
    /**
     * The '<em><b>WD</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Working Draft
     * <!-- end-model-doc -->
     * @see #WD_VALUE
     * @generated
     * @ordered
     */
    WD( 0, "WD", "WD" ),

    /**
     * The '<em><b>CD</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Committee Draft
     * <!-- end-model-doc -->
     * @see #CD_VALUE
     * @generated
     * @ordered
     */
    CD( 1, "CD", "CD" ),

    /**
     * The '<em><b>CDV</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Committee Draft for Vote
     * <!-- end-model-doc -->
     * @see #CDV_VALUE
     * @generated
     * @ordered
     */
    CDV( 2, "CDV", "CDV" ),

    /**
     * The '<em><b>DTS</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Draft Technical Specification
     * <!-- end-model-doc -->
     * @see #DTS_VALUE
     * @generated
     * @ordered
     */
    DTS( 3, "DTS", "DTS" ),

    /**
     * The '<em><b>DTR</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Draft Technical Report
     * <!-- end-model-doc -->
     * @see #DTR_VALUE
     * @generated
     * @ordered
     */
    DTR( 4, "DTR", "DTR" ),

    /**
     * The '<em><b>FDIS</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Final Draft International Standard
     * <!-- end-model-doc -->
     * @see #FDIS_VALUE
     * @generated
     * @ordered
     */
    FDIS( 5, "FDIS", "FDIS" ),

    /**
     * The '<em><b>TS</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Technical Specification
     * <!-- end-model-doc -->
     * @see #TS_VALUE
     * @generated
     * @ordered
     */
    TS( 6, "TS", "TS" ),

    /**
     * The '<em><b>TR</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Technical Report
     * <!-- end-model-doc -->
     * @see #TR_VALUE
     * @generated
     * @ordered
     */
    TR( 7, "TR", "TR" ),

    /**
     * The '<em><b>IS</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * International Standard
     * <!-- end-model-doc -->
     * @see #IS_VALUE
     * @generated
     * @ordered
     */
    IS( 8, "IS", "IS" );

    /**
     * The '<em><b>WD</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Working Draft
     * <!-- end-model-doc -->
     * @see #WD
     * @model
     * @generated
     * @ordered
     */
    public static final int WD_VALUE = 0;

    /**
     * The '<em><b>CD</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Committee Draft
     * <!-- end-model-doc -->
     * @see #CD
     * @model
     * @generated
     * @ordered
     */
    public static final int CD_VALUE = 1;

    /**
     * The '<em><b>CDV</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Committee Draft for Vote
     * <!-- end-model-doc -->
     * @see #CDV
     * @model
     * @generated
     * @ordered
     */
    public static final int CDV_VALUE = 2;

    /**
     * The '<em><b>DTS</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Draft Technical Specification
     * <!-- end-model-doc -->
     * @see #DTS
     * @model
     * @generated
     * @ordered
     */
    public static final int DTS_VALUE = 3;

    /**
     * The '<em><b>DTR</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Draft Technical Report
     * <!-- end-model-doc -->
     * @see #DTR
     * @model
     * @generated
     * @ordered
     */
    public static final int DTR_VALUE = 4;

    /**
     * The '<em><b>FDIS</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Final Draft International Standard
     * <!-- end-model-doc -->
     * @see #FDIS
     * @model
     * @generated
     * @ordered
     */
    public static final int FDIS_VALUE = 5;

    /**
     * The '<em><b>TS</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Technical Specification
     * <!-- end-model-doc -->
     * @see #TS
     * @model
     * @generated
     * @ordered
     */
    public static final int TS_VALUE = 6;

    /**
     * The '<em><b>TR</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Technical Report
     * <!-- end-model-doc -->
     * @see #TR
     * @model
     * @generated
     * @ordered
     */
    public static final int TR_VALUE = 7;

    /**
     * The '<em><b>IS</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * International Standard
     * <!-- end-model-doc -->
     * @see #IS
     * @model
     * @generated
     * @ordered
     */
    public static final int IS_VALUE = 8;

    /**
     * An array of all the '<em><b>TPub Stage</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final TPubStage[] VALUES_ARRAY = new TPubStage[] { WD, CD, CDV, DTS, DTR, FDIS, TS, TR, IS, };

    /**
     * A public read-only list of all the '<em><b>TPub Stage</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< TPubStage > VALUES = Collections.unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>TPub Stage</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static TPubStage get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            TPubStage result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>TPub Stage</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static TPubStage getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            TPubStage result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>TPub Stage</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static TPubStage get( int value ) {
        switch( value ) {
        case WD_VALUE:
            return WD;
        case CD_VALUE:
            return CD;
        case CDV_VALUE:
            return CDV;
        case DTS_VALUE:
            return DTS;
        case DTR_VALUE:
            return DTR;
        case FDIS_VALUE:
            return FDIS;
        case TS_VALUE:
            return TS;
        case TR_VALUE:
            return TR;
        case IS_VALUE:
            return IS;
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
    private TPubStage( int value, String name, String literal ) {
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

} //TPubStage
