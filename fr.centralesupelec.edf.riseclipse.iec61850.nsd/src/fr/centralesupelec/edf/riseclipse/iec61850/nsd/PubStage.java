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
 * A representation of the literals of the enumeration '<em><b>Pub Stage</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Publication stage of the namespace.
 * <!-- end-model-doc -->
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getPubStage()
 * @model extendedMetaData="name='tPubStage'"
 * @generated
 */
public enum PubStage implements Enumerator {
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
     * The '<em><b>Draft DC</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Draft for comment (Internal draft)
     * <!-- end-model-doc -->
     * @see #DRAFT_DC_VALUE
     * @generated
     * @ordered
     */
    DRAFT_DC( 1, "draftDC", "draftDC" ),
    /**
     * The '<em><b>DC</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Draft for comment
     * <!-- end-model-doc -->
     * @see #DC_VALUE
     * @generated
     * @ordered
     */
    DC( 2, "DC", "DC" ),
    /**
     * The '<em><b>Draft DC2</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Draft for comment 2 (Internal draft)
     * <!-- end-model-doc -->
     * @see #DRAFT_DC2_VALUE
     * @generated
     * @ordered
     */
    DRAFT_DC2( 3, "draftDC2", "draftDC2" ),
    /**
     * The '<em><b>DC2</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Draft for comment 2
     * <!-- end-model-doc -->
     * @see #DC2_VALUE
     * @generated
     * @ordered
     */
    DC2( 4, "DC2", "DC2" ),
    /**
     * The '<em><b>Draft CD</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Committee Draft (Internal draft)
     * <!-- end-model-doc -->
     * @see #DRAFT_CD_VALUE
     * @generated
     * @ordered
     */
    DRAFT_CD( 5, "draftCD", "draftCD" ),
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
    CD( 6, "CD", "CD" ),

    /**
     * The '<em><b>Draft CD2</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Committee Draft 2 (Internal draft)
     * <!-- end-model-doc -->
     * @see #DRAFT_CD2_VALUE
     * @generated
     * @ordered
     */
    DRAFT_CD2( 7, "draftCD2", "draftCD2" ),
    /**
     * The '<em><b>CD2</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Committee Draft 2
     * <!-- end-model-doc -->
     * @see #CD2_VALUE
     * @generated
     * @ordered
     */
    CD2( 8, "CD2", "CD2" ),
    /**
     * The '<em><b>Draft CD3</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Committee Draft 3 (Internal draft)
     * <!-- end-model-doc -->
     * @see #DRAFT_CD3_VALUE
     * @generated
     * @ordered
     */
    DRAFT_CD3( 9, "draftCD3", "draftCD3" ),
    /**
     * The '<em><b>CD3</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Committee Draft 3
     * <!-- end-model-doc -->
     * @see #CD3_VALUE
     * @generated
     * @ordered
     */
    CD3( 10, "CD3", "CD3" ),
    /**
     * The '<em><b>Draft CDV</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Committee Draft for Vote (internal draft)
     * <!-- end-model-doc -->
     * @see #DRAFT_CDV_VALUE
     * @generated
     * @ordered
     */
    DRAFT_CDV( 11, "draftCDV", "draftCDV" ),
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
    CDV( 12, "CDV", "CDV" ),

    /**
     * The '<em><b>Draft DTS</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Draft Technical Specification (internal draft)
     * <!-- end-model-doc -->
     * @see #DRAFT_DTS_VALUE
     * @generated
     * @ordered
     */
    DRAFT_DTS( 13, "draftDTS", "draftDTS" ),
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
    DTS( 14, "DTS", "DTS" ),

    /**
     * The '<em><b>Draft DTR</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Draft Technical Report (internal draft)
     * <!-- end-model-doc -->
     * @see #DRAFT_DTR_VALUE
     * @generated
     * @ordered
     */
    DRAFT_DTR( 15, "draftDTR", "draftDTR" ),
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
    DTR( 16, "DTR", "DTR" ),

    /**
     * The '<em><b>Draft FDIS</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Final Draft International Standard (internal draft)
     * <!-- end-model-doc -->
     * @see #DRAFT_FDIS_VALUE
     * @generated
     * @ordered
     */
    DRAFT_FDIS( 17, "draftFDIS", "draftFDIS" ),
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
    FDIS( 18, "FDIS", "FDIS" ),

    /**
     * The '<em><b>Draft TS</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Technical Specification (internal draft)
     * <!-- end-model-doc -->
     * @see #DRAFT_TS_VALUE
     * @generated
     * @ordered
     */
    DRAFT_TS( 19, "draftTS", "draftTS" ),
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
    TS( 20, "TS", "TS" ),

    /**
     * The '<em><b>Draft TR</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Technical Report (internal draft)
     * <!-- end-model-doc -->
     * @see #DRAFT_TR_VALUE
     * @generated
     * @ordered
     */
    DRAFT_TR( 21, "draftTR", "draftTR" ),
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
    TR( 22, "TR", "TR" ),

    /**
     * The '<em><b>Draft IS</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * International Standard (internal draft)
     * <!-- end-model-doc -->
     * @see #DRAFT_IS_VALUE
     * @generated
     * @ordered
     */
    DRAFT_IS( 23, "draftIS", "draftIS" ),
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
    IS( 24, "IS", "IS" ),
    /**
     * The '<em><b>PAS</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Publicly Available Specification
     * <!-- end-model-doc -->
     * @see #PAS_VALUE
     * @generated
     * @ordered
     */
    PAS( 25, "PAS", "PAS" );

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
     * The '<em><b>Draft DC</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Draft for comment (Internal draft)
     * <!-- end-model-doc -->
     * @see #DRAFT_DC
     * @model name="draftDC"
     * @generated
     * @ordered
     */
    public static final int DRAFT_DC_VALUE = 1;

    /**
     * The '<em><b>DC</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Draft for comment
     * <!-- end-model-doc -->
     * @see #DC
     * @model
     * @generated
     * @ordered
     */
    public static final int DC_VALUE = 2;

    /**
     * The '<em><b>Draft DC2</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Draft for comment 2 (Internal draft)
     * <!-- end-model-doc -->
     * @see #DRAFT_DC2
     * @model name="draftDC2"
     * @generated
     * @ordered
     */
    public static final int DRAFT_DC2_VALUE = 3;

    /**
     * The '<em><b>DC2</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Draft for comment 2
     * <!-- end-model-doc -->
     * @see #DC2
     * @model
     * @generated
     * @ordered
     */
    public static final int DC2_VALUE = 4;

    /**
     * The '<em><b>Draft CD</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Committee Draft (Internal draft)
     * <!-- end-model-doc -->
     * @see #DRAFT_CD
     * @model name="draftCD"
     * @generated
     * @ordered
     */
    public static final int DRAFT_CD_VALUE = 5;

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
    public static final int CD_VALUE = 6;

    /**
     * The '<em><b>Draft CD2</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Committee Draft 2 (Internal draft)
     * <!-- end-model-doc -->
     * @see #DRAFT_CD2
     * @model name="draftCD2"
     * @generated
     * @ordered
     */
    public static final int DRAFT_CD2_VALUE = 7;

    /**
     * The '<em><b>CD2</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Committee Draft 2
     * <!-- end-model-doc -->
     * @see #CD2
     * @model
     * @generated
     * @ordered
     */
    public static final int CD2_VALUE = 8;

    /**
     * The '<em><b>Draft CD3</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Committee Draft 3 (Internal draft)
     * <!-- end-model-doc -->
     * @see #DRAFT_CD3
     * @model name="draftCD3"
     * @generated
     * @ordered
     */
    public static final int DRAFT_CD3_VALUE = 9;

    /**
     * The '<em><b>CD3</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Committee Draft 3
     * <!-- end-model-doc -->
     * @see #CD3
     * @model
     * @generated
     * @ordered
     */
    public static final int CD3_VALUE = 10;

    /**
     * The '<em><b>Draft CDV</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Committee Draft for Vote (internal draft)
     * <!-- end-model-doc -->
     * @see #DRAFT_CDV
     * @model name="draftCDV"
     * @generated
     * @ordered
     */
    public static final int DRAFT_CDV_VALUE = 11;

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
    public static final int CDV_VALUE = 12;

    /**
     * The '<em><b>Draft DTS</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Draft Technical Specification (internal draft)
     * <!-- end-model-doc -->
     * @see #DRAFT_DTS
     * @model name="draftDTS"
     * @generated
     * @ordered
     */
    public static final int DRAFT_DTS_VALUE = 13;

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
    public static final int DTS_VALUE = 14;

    /**
     * The '<em><b>Draft DTR</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Draft Technical Report (internal draft)
     * <!-- end-model-doc -->
     * @see #DRAFT_DTR
     * @model name="draftDTR"
     * @generated
     * @ordered
     */
    public static final int DRAFT_DTR_VALUE = 15;

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
    public static final int DTR_VALUE = 16;

    /**
     * The '<em><b>Draft FDIS</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Final Draft International Standard (internal draft)
     * <!-- end-model-doc -->
     * @see #DRAFT_FDIS
     * @model name="draftFDIS"
     * @generated
     * @ordered
     */
    public static final int DRAFT_FDIS_VALUE = 17;

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
    public static final int FDIS_VALUE = 18;

    /**
     * The '<em><b>Draft TS</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Technical Specification (internal draft)
     * <!-- end-model-doc -->
     * @see #DRAFT_TS
     * @model name="draftTS"
     * @generated
     * @ordered
     */
    public static final int DRAFT_TS_VALUE = 19;

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
    public static final int TS_VALUE = 20;

    /**
     * The '<em><b>Draft TR</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Technical Report (internal draft)
     * <!-- end-model-doc -->
     * @see #DRAFT_TR
     * @model name="draftTR"
     * @generated
     * @ordered
     */
    public static final int DRAFT_TR_VALUE = 21;

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
    public static final int TR_VALUE = 22;

    /**
     * The '<em><b>Draft IS</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * International Standard (internal draft)
     * <!-- end-model-doc -->
     * @see #DRAFT_IS
     * @model name="draftIS"
     * @generated
     * @ordered
     */
    public static final int DRAFT_IS_VALUE = 23;

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
    public static final int IS_VALUE = 24;

    /**
     * The '<em><b>PAS</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Publicly Available Specification
     * <!-- end-model-doc -->
     * @see #PAS
     * @model
     * @generated
     * @ordered
     */
    public static final int PAS_VALUE = 25;

    /**
     * An array of all the '<em><b>Pub Stage</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final PubStage[] VALUES_ARRAY = new PubStage[] {
            WD,
            DRAFT_DC,
            DC,
            DRAFT_DC2,
            DC2,
            DRAFT_CD,
            CD,
            DRAFT_CD2,
            CD2,
            DRAFT_CD3,
            CD3,
            DRAFT_CDV,
            CDV,
            DRAFT_DTS,
            DTS,
            DRAFT_DTR,
            DTR,
            DRAFT_FDIS,
            FDIS,
            DRAFT_TS,
            TS,
            DRAFT_TR,
            TR,
            DRAFT_IS,
            IS,
            PAS,
    };

    /**
     * A public read-only list of all the '<em><b>Pub Stage</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< PubStage > VALUES = Collections.unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Pub Stage</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static PubStage get( String literal ) {
        for( PubStage result : VALUES_ARRAY ) {
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Pub Stage</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static PubStage getByName( String name ) {
        for( PubStage result : VALUES_ARRAY ) {
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Pub Stage</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static PubStage get( int value ) {
        switch( value ) {
        case WD_VALUE:
            return WD;
        case DRAFT_DC_VALUE:
            return DRAFT_DC;
        case DC_VALUE:
            return DC;
        case DRAFT_DC2_VALUE:
            return DRAFT_DC2;
        case DC2_VALUE:
            return DC2;
        case DRAFT_CD_VALUE:
            return DRAFT_CD;
        case CD_VALUE:
            return CD;
        case DRAFT_CD2_VALUE:
            return DRAFT_CD2;
        case CD2_VALUE:
            return CD2;
        case DRAFT_CD3_VALUE:
            return DRAFT_CD3;
        case CD3_VALUE:
            return CD3;
        case DRAFT_CDV_VALUE:
            return DRAFT_CDV;
        case CDV_VALUE:
            return CDV;
        case DRAFT_DTS_VALUE:
            return DRAFT_DTS;
        case DTS_VALUE:
            return DTS;
        case DRAFT_DTR_VALUE:
            return DRAFT_DTR;
        case DTR_VALUE:
            return DTR;
        case DRAFT_FDIS_VALUE:
            return DRAFT_FDIS;
        case FDIS_VALUE:
            return FDIS;
        case DRAFT_TS_VALUE:
            return DRAFT_TS;
        case TS_VALUE:
            return TS;
        case DRAFT_TR_VALUE:
            return DRAFT_TR;
        case TR_VALUE:
            return TR;
        case DRAFT_IS_VALUE:
            return DRAFT_IS;
        case IS_VALUE:
            return IS;
        case PAS_VALUE:
            return PAS;
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
    private PubStage( int value, String name, String literal ) {
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

} //PubStage
