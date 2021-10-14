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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ag Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgArray#isIsArray <em>Is Array</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgArray#getMaxIndexAttribute <em>Max Index Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgArray#getMinIndex <em>Min Index</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgArray#getSizeAttribute <em>Size Attribute</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getAgArray()
 * @model abstract="true"
 * @generated
 */
public interface AgArray extends EObject {
    /**
     * Returns the value of the '<em><b>Is Array</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Array</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Array</em>' attribute.
     * @see #isSetIsArray()
     * @see #unsetIsArray()
     * @see #setIsArray(boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getAgArray_IsArray()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='isArray'"
     * @generated
     */
    boolean isIsArray();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgArray#isIsArray <em>Is Array</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Array</em>' attribute.
     * @see #isSetIsArray()
     * @see #unsetIsArray()
     * @see #isIsArray()
     * @generated
     */
    void setIsArray( boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgArray#isIsArray <em>Is Array</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsArray()
     * @see #isIsArray()
     * @see #setIsArray(boolean)
     * @generated
     */
    void unsetIsArray();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgArray#isIsArray <em>Is Array</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Array</em>' attribute is set.
     * @see #unsetIsArray()
     * @see #isIsArray()
     * @see #setIsArray(boolean)
     * @generated
     */
    boolean isSetIsArray();

    /**
     * Returns the value of the '<em><b>Max Index Attribute</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max Index Attribute</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max Index Attribute</em>' attribute.
     * @see #isSetMaxIndexAttribute()
     * @see #unsetMaxIndexAttribute()
     * @see #setMaxIndexAttribute(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getAgArray_MaxIndexAttribute()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='maxIndexAttribute'"
     * @generated
     */
    String getMaxIndexAttribute();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgArray#getMaxIndexAttribute <em>Max Index Attribute</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Index Attribute</em>' attribute.
     * @see #isSetMaxIndexAttribute()
     * @see #unsetMaxIndexAttribute()
     * @see #getMaxIndexAttribute()
     * @generated
     */
    void setMaxIndexAttribute( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgArray#getMaxIndexAttribute <em>Max Index Attribute</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaxIndexAttribute()
     * @see #getMaxIndexAttribute()
     * @see #setMaxIndexAttribute(String)
     * @generated
     */
    void unsetMaxIndexAttribute();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgArray#getMaxIndexAttribute <em>Max Index Attribute</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Max Index Attribute</em>' attribute is set.
     * @see #unsetMaxIndexAttribute()
     * @see #getMaxIndexAttribute()
     * @see #setMaxIndexAttribute(String)
     * @generated
     */
    boolean isSetMaxIndexAttribute();

    /**
     * Returns the value of the '<em><b>Min Index</b></em>' attribute.
     * The default value is <code>"0"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Min Index</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Min Index</em>' attribute.
     * @see #isSetMinIndex()
     * @see #unsetMinIndex()
     * @see #setMinIndex(long)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getAgArray_MinIndex()
     * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
     *        extendedMetaData="kind='attribute' name='minIndex'"
     * @generated
     */
    long getMinIndex();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgArray#getMinIndex <em>Min Index</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min Index</em>' attribute.
     * @see #isSetMinIndex()
     * @see #unsetMinIndex()
     * @see #getMinIndex()
     * @generated
     */
    void setMinIndex( long value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgArray#getMinIndex <em>Min Index</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMinIndex()
     * @see #getMinIndex()
     * @see #setMinIndex(long)
     * @generated
     */
    void unsetMinIndex();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgArray#getMinIndex <em>Min Index</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Min Index</em>' attribute is set.
     * @see #unsetMinIndex()
     * @see #getMinIndex()
     * @see #setMinIndex(long)
     * @generated
     */
    boolean isSetMinIndex();

    /**
     * Returns the value of the '<em><b>Size Attribute</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Size Attribute</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Size Attribute</em>' attribute.
     * @see #isSetSizeAttribute()
     * @see #unsetSizeAttribute()
     * @see #setSizeAttribute(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getAgArray_SizeAttribute()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='sizeAttribute'"
     * @generated
     */
    String getSizeAttribute();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgArray#getSizeAttribute <em>Size Attribute</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Size Attribute</em>' attribute.
     * @see #isSetSizeAttribute()
     * @see #unsetSizeAttribute()
     * @see #getSizeAttribute()
     * @generated
     */
    void setSizeAttribute( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgArray#getSizeAttribute <em>Size Attribute</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSizeAttribute()
     * @see #getSizeAttribute()
     * @see #setSizeAttribute(String)
     * @generated
     */
    void unsetSizeAttribute();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgArray#getSizeAttribute <em>Size Attribute</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Size Attribute</em>' attribute is set.
     * @see #unsetSizeAttribute()
     * @see #getSizeAttribute()
     * @see #setSizeAttribute(String)
     * @generated
     */
    boolean isSetSizeAttribute();

} // AgArray
