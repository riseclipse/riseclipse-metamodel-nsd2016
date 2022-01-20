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

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LN Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClass#isCanHaveLOG <em>Can Have LOG</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClass#isIsExtension <em>Is Extension</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClass#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClass#getParentLNClasses <em>Parent LN Classes</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getLNClass()
 * @model extendedMetaData="name='tLNClass' kind='elementOnly'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='nameAttributeRequired'"
 * @generated
 */
public interface LNClass extends AnyLNClass {
    /**
     * Returns the value of the '<em><b>Can Have LOG</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Can Have LOG</em>' attribute.
     * @see #isSetCanHaveLOG()
     * @see #unsetCanHaveLOG()
     * @see #setCanHaveLOG(boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getLNClass_CanHaveLOG()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='canHaveLOG'"
     * @generated
     */
    boolean isCanHaveLOG();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClass#isCanHaveLOG <em>Can Have LOG</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Can Have LOG</em>' attribute.
     * @see #isSetCanHaveLOG()
     * @see #unsetCanHaveLOG()
     * @see #isCanHaveLOG()
     * @generated
     */
    void setCanHaveLOG( boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClass#isCanHaveLOG <em>Can Have LOG</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCanHaveLOG()
     * @see #isCanHaveLOG()
     * @see #setCanHaveLOG(boolean)
     * @generated
     */
    void unsetCanHaveLOG();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClass#isCanHaveLOG <em>Can Have LOG</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Can Have LOG</em>' attribute is set.
     * @see #unsetCanHaveLOG()
     * @see #isCanHaveLOG()
     * @see #setCanHaveLOG(boolean)
     * @generated
     */
    boolean isSetCanHaveLOG();

    /**
     * Returns the value of the '<em><b>Is Extension</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Extension</em>' attribute.
     * @see #isSetIsExtension()
     * @see #unsetIsExtension()
     * @see #setIsExtension(boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getLNClass_IsExtension()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='isExtension'"
     * @generated
     */
    boolean isIsExtension();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClass#isIsExtension <em>Is Extension</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Extension</em>' attribute.
     * @see #isSetIsExtension()
     * @see #unsetIsExtension()
     * @see #isIsExtension()
     * @generated
     */
    void setIsExtension( boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClass#isIsExtension <em>Is Extension</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsExtension()
     * @see #isIsExtension()
     * @see #setIsExtension(boolean)
     * @generated
     */
    void unsetIsExtension();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClass#isIsExtension <em>Is Extension</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Extension</em>' attribute is set.
     * @see #unsetIsExtension()
     * @see #isIsExtension()
     * @see #setIsExtension(boolean)
     * @generated
     */
    boolean isSetIsExtension();

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #isSetName()
     * @see #unsetName()
     * @see #setName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getLNClass_Name()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    @Override
    String getName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClass#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #isSetName()
     * @see #unsetName()
     * @see #getName()
     * @generated
     */
    void setName( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClass#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetName()
     * @see #getName()
     * @see #setName(String)
     * @generated
     */
    void unsetName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClass#getName <em>Name</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Name</em>' attribute is set.
     * @see #unsetName()
     * @see #getName()
     * @see #setName(String)
     * @generated
     */
    boolean isSetName();

    /**
     * Returns the value of the '<em><b>Parent LN Classes</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClasses#getLNClass <em>LN Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent LN Classes</em>' container reference.
     * @see #setParentLNClasses(LNClasses)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getLNClass_ParentLNClasses()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClasses#getLNClass
     * @model opposite="lNClass" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    @Override
    LNClasses getParentLNClasses();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClass#getParentLNClasses <em>Parent LN Classes</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent LN Classes</em>' container reference.
     * @see #getParentLNClasses()
     * @generated
     */
    void setParentLNClasses( LNClasses value );

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'The name attribute is required\',\n\tstatus : Boolean = \n\t\t\tself.name &lt;&gt; null\n}.status'"
     * @generated
     */
    boolean nameAttributeRequired( DiagnosticChain diagnostics, Map< Object, Object > context );

} // LNClass
