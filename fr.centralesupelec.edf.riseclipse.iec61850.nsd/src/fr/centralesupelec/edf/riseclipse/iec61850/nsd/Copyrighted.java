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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Copyrighted</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Copyrighted#getCopyright <em>Copyright</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getCopyrighted()
 * @model extendedMetaData="name='tCopyrighted' kind='elementOnly'"
 * @generated
 */
public interface Copyrighted extends NsdObject {
    /**
     * Returns the value of the '<em><b>Copyright</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CopyrightNotice#getParentCopyrighted <em>Parent Copyrighted</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Copyright</em>' containment reference.
     * @see #isSetCopyright()
     * @see #unsetCopyright()
     * @see #setCopyright(CopyrightNotice)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getCopyrighted_Copyright()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.CopyrightNotice#getParentCopyrighted
     * @model opposite="parentCopyrighted" containment="true" unsettable="true"
     *        extendedMetaData="kind='element' name='Copyright' namespace='##targetNamespace'"
     * @generated
     */
    CopyrightNotice getCopyright();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Copyrighted#getCopyright <em>Copyright</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Copyright</em>' containment reference.
     * @see #isSetCopyright()
     * @see #unsetCopyright()
     * @see #getCopyright()
     * @generated
     */
    void setCopyright( CopyrightNotice value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Copyrighted#getCopyright <em>Copyright</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCopyright()
     * @see #getCopyright()
     * @see #setCopyright(CopyrightNotice)
     * @generated
     */
    void unsetCopyright();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Copyrighted#getCopyright <em>Copyright</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Copyright</em>' containment reference is set.
     * @see #unsetCopyright()
     * @see #getCopyright()
     * @see #setCopyright(CopyrightNotice)
     * @generated
     */
    boolean isSetCopyright();

} // Copyrighted
