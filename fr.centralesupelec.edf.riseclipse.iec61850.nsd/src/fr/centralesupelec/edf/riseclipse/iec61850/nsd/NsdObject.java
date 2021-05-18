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

import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdObject#getLineNumber <em>Line Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdObject#isExplicitLinksBuilt <em>Explicit Links Built</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getNsdObject()
 * @model abstract="true"
 * @generated
 */
public interface NsdObject extends EObject {

    /**
     * Returns the value of the '<em><b>Line Number</b></em>' attribute.
     * The default value is <code>"-1"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Line Number</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Line Number</em>' attribute.
     * @see #setLineNumber(int)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getNsdObject_LineNumber()
     * @model default="-1" required="true" transient="true"
     * @generated
     */
    int getLineNumber();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdObject#getLineNumber <em>Line Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Line Number</em>' attribute.
     * @see #getLineNumber()
     * @generated
     */
    void setLineNumber( int value );

    /**
     * Returns the value of the '<em><b>Explicit Links Built</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Explicit Links Built</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Explicit Links Built</em>' attribute.
     * @see #setExplicitLinksBuilt(boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getNsdObject_ExplicitLinksBuilt()
     * @model default="false" required="true" transient="true"
     * @generated
     */
    boolean isExplicitLinksBuilt();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdObject#isExplicitLinksBuilt <em>Explicit Links Built</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Explicit Links Built</em>' attribute.
     * @see #isExplicitLinksBuilt()
     * @generated
     */
    void setExplicitLinksBuilt( boolean value );

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model consoleType="fr.centralesupelec.edf.riseclipse.iec61850.nsd.IRiseClipseConsole"
     * @generated
     */
    boolean buildExplicitLinks( IRiseClipseConsole console );

    /*
     * @generated NOT
     */
    void setFilename( String filename );

    String getFilename();
} // NsdObject
