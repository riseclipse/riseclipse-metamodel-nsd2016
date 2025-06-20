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
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ag NS Identification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSIdentification#getId <em>Id</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSIdentification#getVersion <em>Version</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSIdentification#getRevision <em>Revision</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSIdentification#getRelease <em>Release</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSIdentification#getPublicationStage <em>Publication Stage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSIdentification#getNamespaceType <em>Namespace Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSIdentification#isDeprecated <em>Deprecated</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getAgNSIdentification()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='versionAttributeRequired'"
 * @generated
 */
public interface AgNSIdentification extends EObject {
    /**
     * Returns the value of the '<em><b>Release</b></em>' attribute.
     * The default value is <code>"1"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Release</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Release</em>' attribute.
     * @see #isSetRelease()
     * @see #unsetRelease()
     * @see #setRelease(int)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getAgNSIdentification_Release()
     * @model default="1" unsettable="true"
     *        extendedMetaData="kind='attribute' name='release'"
     * @generated
     */
    int getRelease();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSIdentification#getRelease <em>Release</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Release</em>' attribute.
     * @see #isSetRelease()
     * @see #unsetRelease()
     * @see #getRelease()
     * @generated
     */
    void setRelease( int value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSIdentification#getRelease <em>Release</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRelease()
     * @see #getRelease()
     * @see #setRelease(int)
     * @generated
     */
    void unsetRelease();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSIdentification#getRelease <em>Release</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Release</em>' attribute is set.
     * @see #unsetRelease()
     * @see #getRelease()
     * @see #setRelease(int)
     * @generated
     */
    boolean isSetRelease();

    /**
     * Returns the value of the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Version</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Version</em>' attribute.
     * @see #isSetVersion()
     * @see #unsetVersion()
     * @see #setVersion(Integer)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getAgNSIdentification_Version()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='version'"
     * @generated
     */
    Integer getVersion();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSIdentification#getVersion <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Version</em>' attribute.
     * @see #isSetVersion()
     * @see #unsetVersion()
     * @see #getVersion()
     * @generated
     */
    void setVersion( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSIdentification#getVersion <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVersion()
     * @see #getVersion()
     * @see #setVersion(Integer)
     * @generated
     */
    void unsetVersion();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSIdentification#getVersion <em>Version</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Version</em>' attribute is set.
     * @see #unsetVersion()
     * @see #getVersion()
     * @see #setVersion(Integer)
     * @generated
     */
    boolean isSetVersion();

    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #isSetId()
     * @see #unsetId()
     * @see #setId(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getAgNSIdentification_Id()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='id'"
     * @generated
     */
    String getId();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSIdentification#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #isSetId()
     * @see #unsetId()
     * @see #getId()
     * @generated
     */
    void setId( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSIdentification#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetId()
     * @see #getId()
     * @see #setId(String)
     * @generated
     */
    void unsetId();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSIdentification#getId <em>Id</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Id</em>' attribute is set.
     * @see #unsetId()
     * @see #getId()
     * @see #setId(String)
     * @generated
     */
    boolean isSetId();

    /**
     * Returns the value of the '<em><b>Revision</b></em>' attribute.
     * The default value is <code>"A"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Revision</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Revision</em>' attribute.
     * @see #isSetRevision()
     * @see #unsetRevision()
     * @see #setRevision(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getAgNSIdentification_Revision()
     * @model default="A" unsettable="true"
     *        extendedMetaData="kind='attribute' name='revision'"
     * @generated
     */
    String getRevision();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSIdentification#getRevision <em>Revision</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Revision</em>' attribute.
     * @see #isSetRevision()
     * @see #unsetRevision()
     * @see #getRevision()
     * @generated
     */
    void setRevision( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSIdentification#getRevision <em>Revision</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRevision()
     * @see #getRevision()
     * @see #setRevision(String)
     * @generated
     */
    void unsetRevision();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSIdentification#getRevision <em>Revision</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Revision</em>' attribute is set.
     * @see #unsetRevision()
     * @see #getRevision()
     * @see #setRevision(String)
     * @generated
     */
    boolean isSetRevision();

    /**
     * Returns the value of the '<em><b>Publication Stage</b></em>' attribute.
     * The default value is <code>"IS"</code>.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PubStage}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Publication Stage</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Publication Stage</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.PubStage
     * @see #isSetPublicationStage()
     * @see #unsetPublicationStage()
     * @see #setPublicationStage(PubStage)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getAgNSIdentification_PublicationStage()
     * @model default="IS" unsettable="true"
     *        extendedMetaData="kind='attribute' name='publicationStage'"
     * @generated
     */
    PubStage getPublicationStage();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSIdentification#getPublicationStage <em>Publication Stage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Publication Stage</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.PubStage
     * @see #isSetPublicationStage()
     * @see #unsetPublicationStage()
     * @see #getPublicationStage()
     * @generated
     */
    void setPublicationStage( PubStage value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSIdentification#getPublicationStage <em>Publication Stage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPublicationStage()
     * @see #getPublicationStage()
     * @see #setPublicationStage(PubStage)
     * @generated
     */
    void unsetPublicationStage();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSIdentification#getPublicationStage <em>Publication Stage</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Publication Stage</em>' attribute is set.
     * @see #unsetPublicationStage()
     * @see #getPublicationStage()
     * @see #setPublicationStage(PubStage)
     * @generated
     */
    boolean isSetPublicationStage();

    /**
     * Returns the value of the '<em><b>Namespace Type</b></em>' attribute.
     * The default value is <code>"basic"</code>.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Namespace Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSType
     * @see #isSetNamespaceType()
     * @see #unsetNamespaceType()
     * @see #setNamespaceType(NSType)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getAgNSIdentification_NamespaceType()
     * @model default="basic" unsettable="true"
     *        extendedMetaData="kind='attribute' name='namespaceType'"
     * @generated
     */
    NSType getNamespaceType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSIdentification#getNamespaceType <em>Namespace Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Namespace Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSType
     * @see #isSetNamespaceType()
     * @see #unsetNamespaceType()
     * @see #getNamespaceType()
     * @generated
     */
    void setNamespaceType( NSType value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSIdentification#getNamespaceType <em>Namespace Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNamespaceType()
     * @see #getNamespaceType()
     * @see #setNamespaceType(NSType)
     * @generated
     */
    void unsetNamespaceType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSIdentification#getNamespaceType <em>Namespace Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Namespace Type</em>' attribute is set.
     * @see #unsetNamespaceType()
     * @see #getNamespaceType()
     * @see #setNamespaceType(NSType)
     * @generated
     */
    boolean isSetNamespaceType();

    /**
     * Returns the value of the '<em><b>Deprecated</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Deprecated</em>' attribute.
     * @see #isSetDeprecated()
     * @see #unsetDeprecated()
     * @see #setDeprecated(boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getAgNSIdentification_Deprecated()
     * @model default="false" unsettable="true"
     *        extendedMetaData="kind='attribute' name='deprecated'"
     * @generated
     */
    boolean isDeprecated();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSIdentification#isDeprecated <em>Deprecated</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Deprecated</em>' attribute.
     * @see #isSetDeprecated()
     * @see #unsetDeprecated()
     * @see #isDeprecated()
     * @generated
     */
    void setDeprecated( boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSIdentification#isDeprecated <em>Deprecated</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDeprecated()
     * @see #isDeprecated()
     * @see #setDeprecated(boolean)
     * @generated
     */
    void unsetDeprecated();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSIdentification#isDeprecated <em>Deprecated</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Deprecated</em>' attribute is set.
     * @see #unsetDeprecated()
     * @see #isDeprecated()
     * @see #setDeprecated(boolean)
     * @generated
     */
    boolean isSetDeprecated();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'The id attribute is required\',\n\tstatus : Boolean = \n\t\t\tself.id &lt;&gt; null\n}.status'"
     * @generated
     */
    boolean idAttributeRequired( DiagnosticChain diagnostics, Map< Object, Object > context );

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'The version attribute is required\',\n\tstatus : Boolean = \n\t\t\tself.version &lt;&gt; null\n}.status'"
     * @generated
     */
    boolean versionAttributeRequired( DiagnosticChain diagnostics, Map< Object, Object > context );

} // AgNSIdentification
