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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TData Set Member Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Indication of a given object can be a data set member of a given control block.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataSetMemberOf#getCb <em>Cb</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTDataSetMemberOf()
 * @model extendedMetaData="name='tDataSetMemberOf' kind='empty'"
 * @generated
 */
public interface TDataSetMemberOf extends EObject {
    /**
     * Returns the value of the '<em><b>Cb</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCBKind}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Control block kind.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Cb</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCBKind
     * @see #isSetCb()
     * @see #unsetCb()
     * @see #setCb(TCBKind)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTDataSetMemberOf_Cb()
     * @model unsettable="true" required="true"
     *        extendedMetaData="kind='attribute' name='cb'"
     * @generated
     */
    TCBKind getCb();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataSetMemberOf#getCb <em>Cb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cb</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCBKind
     * @see #isSetCb()
     * @see #unsetCb()
     * @see #getCb()
     * @generated
     */
    void setCb( TCBKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataSetMemberOf#getCb <em>Cb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCb()
     * @see #getCb()
     * @see #setCb(TCBKind)
     * @generated
     */
    void unsetCb();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataSetMemberOf#getCb <em>Cb</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Cb</em>' attribute is set.
     * @see #unsetCb()
     * @see #getCb()
     * @see #setCb(TCBKind)
     * @generated
     */
    boolean isSetCb();

} // TDataSetMemberOf
