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

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NS Doc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc#getDoc <em>Doc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc#getId <em>Id</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc#getLang <em>Lang</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc#getPublicationStage <em>Publication Stage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc#getRevision <em>Revision</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc#getUmlDate <em>Uml Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc#getUmlVersion <em>Uml Version</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getNSDoc()
 * @model extendedMetaData="name='tNSDoc' kind='elementOnly'"
 * @generated
 */
public interface NSDoc extends Copyrighted, NSDObjectWithVersionAndRelease {
    /**
     * Returns the value of the '<em><b>Doc</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getNSDoc <em>NS Doc</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Doc</em>' containment reference list.
     * @see #isSetDoc()
     * @see #unsetDoc()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getNSDoc_Doc()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getNSDoc
     * @model opposite="nSDoc" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='Doc' namespace='##targetNamespace'"
     * @generated
     */
    EList< Doc > getDoc();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc#getDoc <em>Doc</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDoc()
     * @see #getDoc()
     * @generated
     */
    void unsetDoc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc#getDoc <em>Doc</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Doc</em>' containment reference list is set.
     * @see #unsetDoc()
     * @see #getDoc()
     * @generated
     */
    boolean isSetDoc();

    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #isSetId()
     * @see #unsetId()
     * @see #setId(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getNSDoc_Id()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='id'"
     * @generated
     */
    String getId();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc#getId <em>Id</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetId()
     * @see #getId()
     * @see #setId(String)
     * @generated
     */
    void unsetId();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc#getId <em>Id</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Lang</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Lang</em>' attribute.
     * @see #isSetLang()
     * @see #unsetLang()
     * @see #setLang(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getNSDoc_Lang()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Language"
     *        extendedMetaData="kind='attribute' name='lang'"
     * @generated
     */
    String getLang();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc#getLang <em>Lang</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lang</em>' attribute.
     * @see #isSetLang()
     * @see #unsetLang()
     * @see #getLang()
     * @generated
     */
    void setLang( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc#getLang <em>Lang</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLang()
     * @see #getLang()
     * @see #setLang(String)
     * @generated
     */
    void unsetLang();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc#getLang <em>Lang</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Lang</em>' attribute is set.
     * @see #unsetLang()
     * @see #getLang()
     * @see #setLang(String)
     * @generated
     */
    boolean isSetLang();

    /**
     * Returns the value of the '<em><b>Publication Stage</b></em>' attribute.
     * The default value is <code>"IS"</code>.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PubStage}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Publication Stage</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.PubStage
     * @see #isSetPublicationStage()
     * @see #unsetPublicationStage()
     * @see #setPublicationStage(PubStage)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getNSDoc_PublicationStage()
     * @model default="IS" unsettable="true"
     *        extendedMetaData="kind='attribute' name='publicationStage'"
     * @generated
     */
    PubStage getPublicationStage();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc#getPublicationStage <em>Publication Stage</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc#getPublicationStage <em>Publication Stage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPublicationStage()
     * @see #getPublicationStage()
     * @see #setPublicationStage(PubStage)
     * @generated
     */
    void unsetPublicationStage();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc#getPublicationStage <em>Publication Stage</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Revision</b></em>' attribute.
     * The default value is <code>"A"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Revision</em>' attribute.
     * @see #isSetRevision()
     * @see #unsetRevision()
     * @see #setRevision(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getNSDoc_Revision()
     * @model default="A" unsettable="true"
     *        extendedMetaData="kind='attribute' name='revision'"
     * @generated
     */
    String getRevision();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc#getRevision <em>Revision</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc#getRevision <em>Revision</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRevision()
     * @see #getRevision()
     * @see #setRevision(String)
     * @generated
     */
    void unsetRevision();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc#getRevision <em>Revision</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Uml Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Uml Date</em>' attribute.
     * @see #isSetUmlDate()
     * @see #unsetUmlDate()
     * @see #setUmlDate(XMLGregorianCalendar)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getNSDoc_UmlDate()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.DateTime"
     *        extendedMetaData="kind='attribute' name='umlDate'"
     * @generated
     */
    XMLGregorianCalendar getUmlDate();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc#getUmlDate <em>Uml Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Uml Date</em>' attribute.
     * @see #isSetUmlDate()
     * @see #unsetUmlDate()
     * @see #getUmlDate()
     * @generated
     */
    void setUmlDate( XMLGregorianCalendar value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc#getUmlDate <em>Uml Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUmlDate()
     * @see #getUmlDate()
     * @see #setUmlDate(XMLGregorianCalendar)
     * @generated
     */
    void unsetUmlDate();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc#getUmlDate <em>Uml Date</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Uml Date</em>' attribute is set.
     * @see #unsetUmlDate()
     * @see #getUmlDate()
     * @see #setUmlDate(XMLGregorianCalendar)
     * @generated
     */
    boolean isSetUmlDate();

    /**
     * Returns the value of the '<em><b>Uml Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Uml Version</em>' attribute.
     * @see #isSetUmlVersion()
     * @see #unsetUmlVersion()
     * @see #setUmlVersion(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getNSDoc_UmlVersion()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='umlVersion'"
     * @generated
     */
    String getUmlVersion();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc#getUmlVersion <em>Uml Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Uml Version</em>' attribute.
     * @see #isSetUmlVersion()
     * @see #unsetUmlVersion()
     * @see #getUmlVersion()
     * @generated
     */
    void setUmlVersion( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc#getUmlVersion <em>Uml Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUmlVersion()
     * @see #getUmlVersion()
     * @see #setUmlVersion(String)
     * @generated
     */
    void unsetUmlVersion();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc#getUmlVersion <em>Uml Version</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Uml Version</em>' attribute is set.
     * @see #unsetUmlVersion()
     * @see #getUmlVersion()
     * @see #setUmlVersion(String)
     * @generated
     */
    boolean isSetUmlVersion();

} // NSDoc
