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
package fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Map;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.TupleValue;

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSIdentification;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgUML;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdTables;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.PubStage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NS Doc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NSDocImpl#getRelease <em>Release</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NSDocImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NSDocImpl#getId <em>Id</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NSDocImpl#getRevision <em>Revision</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NSDocImpl#getPublicationStage <em>Publication Stage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NSDocImpl#getUmlDate <em>Uml Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NSDocImpl#getUmlVersion <em>Uml Version</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NSDocImpl#getDoc <em>Doc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NSDocImpl#getLang <em>Lang</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NSDocImpl extends CopyrightedImpl implements NSDoc {
    /**
     * The default value of the '{@link #getRelease() <em>Release</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRelease()
     * @generated
     * @ordered
     */
    protected static final Integer RELEASE_EDEFAULT = Integer.valueOf( 1 );

    /**
     * The cached value of the '{@link #getRelease() <em>Release</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRelease()
     * @generated
     * @ordered
     */
    protected Integer release = RELEASE_EDEFAULT;

    /**
     * This is true if the Release attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean releaseESet;

    /**
     * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVersion()
     * @generated
     * @ordered
     */
    protected static final Integer VERSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVersion()
     * @generated
     * @ordered
     */
    protected Integer version = VERSION_EDEFAULT;

    /**
     * This is true if the Version attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean versionESet;

    /**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected static final String ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected String id = ID_EDEFAULT;

    /**
     * This is true if the Id attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean idESet;

    /**
     * The default value of the '{@link #getRevision() <em>Revision</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRevision()
     * @generated
     * @ordered
     */
    protected static final String REVISION_EDEFAULT = "A";

    /**
     * The cached value of the '{@link #getRevision() <em>Revision</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRevision()
     * @generated
     * @ordered
     */
    protected String revision = REVISION_EDEFAULT;

    /**
     * This is true if the Revision attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean revisionESet;

    /**
     * The default value of the '{@link #getPublicationStage() <em>Publication Stage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPublicationStage()
     * @generated
     * @ordered
     */
    protected static final PubStage PUBLICATION_STAGE_EDEFAULT = PubStage.IS;

    /**
     * The cached value of the '{@link #getPublicationStage() <em>Publication Stage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPublicationStage()
     * @generated
     * @ordered
     */
    protected PubStage publicationStage = PUBLICATION_STAGE_EDEFAULT;

    /**
     * This is true if the Publication Stage attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean publicationStageESet;

    /**
     * The default value of the '{@link #getUmlDate() <em>Uml Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUmlDate()
     * @generated
     * @ordered
     */
    protected static final XMLGregorianCalendar UML_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUmlDate() <em>Uml Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUmlDate()
     * @generated
     * @ordered
     */
    protected XMLGregorianCalendar umlDate = UML_DATE_EDEFAULT;

    /**
     * This is true if the Uml Date attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean umlDateESet;

    /**
     * The default value of the '{@link #getUmlVersion() <em>Uml Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUmlVersion()
     * @generated
     * @ordered
     */
    protected static final String UML_VERSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUmlVersion() <em>Uml Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUmlVersion()
     * @generated
     * @ordered
     */
    protected String umlVersion = UML_VERSION_EDEFAULT;

    /**
     * This is true if the Uml Version attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean umlVersionESet;

    /**
     * The cached value of the '{@link #getDoc() <em>Doc</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDoc()
     * @generated
     * @ordered
     */
    protected EList< Doc > doc;

    /**
     * The default value of the '{@link #getLang() <em>Lang</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLang()
     * @generated
     * @ordered
     */
    protected static final String LANG_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLang() <em>Lang</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLang()
     * @generated
     * @ordered
     */
    protected String lang = LANG_EDEFAULT;

    /**
     * This is true if the Lang attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean langESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected NSDocImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.NS_DOC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Doc > getDoc() {
        if( doc == null ) {
            doc = new EObjectContainmentWithInverseEList.Unsettable< >( Doc.class, this, NsdPackage.NS_DOC__DOC,
                    NsdPackage.DOC__PARENT_NS_DOC );
        }
        return doc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDoc() {
        if( doc != null ) ( ( InternalEList.Unsettable< ? > ) doc ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDoc() {
        return doc != null && ( ( InternalEList.Unsettable< ? > ) doc ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getId() {
        return id;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setId( String newId ) {
        String oldId = id;
        id = newId;
        boolean oldIdESet = idESet;
        idESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.NS_DOC__ID, oldId, id, !oldIdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetId() {
        String oldId = id;
        boolean oldIdESet = idESet;
        id = ID_EDEFAULT;
        idESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.NS_DOC__ID, oldId, ID_EDEFAULT,
                    oldIdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetId() {
        return idESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLang() {
        return lang;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLang( String newLang ) {
        String oldLang = lang;
        lang = newLang;
        boolean oldLangESet = langESet;
        langESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.NS_DOC__LANG, oldLang, lang,
                    !oldLangESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLang() {
        String oldLang = lang;
        boolean oldLangESet = langESet;
        lang = LANG_EDEFAULT;
        langESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.NS_DOC__LANG, oldLang, LANG_EDEFAULT,
                    oldLangESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLang() {
        return langESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean langAttributeRequired( final DiagnosticChain diagnostics, final Map< Object, Object > context ) {
        final String constraintName = "NSDoc::langAttributeRequired";
        try {
            /**
             *
             * inv langAttributeRequired:
             *   let severity : Integer[1] = constraintName.getSeverity()
             *   in
             *     if severity <= 0
             *     then true
             *     else
             *       let
             *         result : OclAny[1] = let status : Boolean[1] = self.lang <> null
             *         in
             *           if status = true
             *           then true
             *           else
             *             Tuple{message = 'The lang attribute is required', status = status
             *             }
             *           endif
             *       in
             *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
             *     endif
             */
            final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor( this, context );
            final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate( executor,
                    NsdPackage.Literals.NS_DOC___LANG_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP );
            final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
                    .evaluate( executor, severity_0, NsdTables.INT_0 ).booleanValue();
            /*@NonInvalid*/ boolean symbol_2;
            if( le ) {
                symbol_2 = true;
            }
            else {
                final /*@NonInvalid*/ String lang = this.getLang();
                final /*@NonInvalid*/ boolean status = lang != null;
                /*@NonInvalid*/ Object symbol_1;
                if( status ) {
                    symbol_1 = ValueUtil.TRUE_VALUE;
                }
                else {
                    final /*@NonInvalid*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach( NsdTables.TUPLid_,
                            NsdTables.STR_The_32_lang_32_attribute_32_is_32_required, status );
                    symbol_1 = symbol_0;
                }
                final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
                        .evaluate( executor, TypeId.BOOLEAN, constraintName, this, ( Object ) null, diagnostics,
                                context, ( Object ) null, severity_0, symbol_1, NsdTables.INT_0 )
                        .booleanValue();
                symbol_2 = logDiagnostic;
            }
            return symbol_2;
        }
        catch( Throwable e ) {
            return ValueUtil.validationFailedDiagnostic( constraintName, this, diagnostics, context, e );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean idAttributeRequired( final DiagnosticChain diagnostics, final Map< Object, Object > context ) {
        final String constraintName = "AgNSIdentification::idAttributeRequired";
        try {
            /**
             *
             * inv idAttributeRequired:
             *   let severity : Integer[1] = constraintName.getSeverity()
             *   in
             *     if severity <= 0
             *     then true
             *     else
             *       let
             *         result : OclAny[1] = let status : Boolean[1] = self.id <> null
             *         in
             *           if status = true
             *           then true
             *           else
             *             Tuple{message = 'The id attribute is required', status = status
             *             }
             *           endif
             *       in
             *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
             *     endif
             */
            final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor( this, context );
            final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate( executor,
                    NsdPackage.Literals.AG_NS_IDENTIFICATION___ID_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP );
            final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
                    .evaluate( executor, severity_0, NsdTables.INT_0 ).booleanValue();
            /*@NonInvalid*/ boolean symbol_2;
            if( le ) {
                symbol_2 = true;
            }
            else {
                final /*@NonInvalid*/ String id = this.getId();
                final /*@NonInvalid*/ boolean status = id != null;
                /*@NonInvalid*/ Object symbol_1;
                if( status ) {
                    symbol_1 = ValueUtil.TRUE_VALUE;
                }
                else {
                    final /*@NonInvalid*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach( NsdTables.TUPLid_,
                            NsdTables.STR_The_32_id_32_attribute_32_is_32_required, status );
                    symbol_1 = symbol_0;
                }
                final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
                        .evaluate( executor, TypeId.BOOLEAN, constraintName, this, ( Object ) null, diagnostics,
                                context, ( Object ) null, severity_0, symbol_1, NsdTables.INT_0 )
                        .booleanValue();
                symbol_2 = logDiagnostic;
            }
            return symbol_2;
        }
        catch( Throwable e ) {
            return ValueUtil.validationFailedDiagnostic( constraintName, this, diagnostics, context, e );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean versionAttributeRequired( final DiagnosticChain diagnostics, final Map< Object, Object > context ) {
        final String constraintName = "AgNSIdentification::versionAttributeRequired";
        try {
            /**
             *
             * inv versionAttributeRequired:
             *   let severity : Integer[1] = constraintName.getSeverity()
             *   in
             *     if severity <= 0
             *     then true
             *     else
             *       let
             *         result : OclAny[1] = let status : Boolean[1] = self.version <> null
             *         in
             *           if status = true
             *           then true
             *           else
             *             Tuple{message = 'The version attribute is required', status = status
             *             }
             *           endif
             *       in
             *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
             *     endif
             */
            final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor( this, context );
            final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate( executor,
                    NsdPackage.Literals.AG_NS_IDENTIFICATION___VERSION_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP );
            final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
                    .evaluate( executor, severity_0, NsdTables.INT_0 ).booleanValue();
            /*@NonInvalid*/ boolean symbol_2;
            if( le ) {
                symbol_2 = true;
            }
            else {
                final /*@NonInvalid*/ Integer version = this.getVersion();
                final /*@NonInvalid*/ IntegerValue BOXED_version = version == null ? null
                        : ValueUtil.integerValueOf( version );
                final /*@NonInvalid*/ boolean status = BOXED_version != null;
                /*@NonInvalid*/ Object symbol_1;
                if( status ) {
                    symbol_1 = ValueUtil.TRUE_VALUE;
                }
                else {
                    final /*@NonInvalid*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach( NsdTables.TUPLid_,
                            NsdTables.STR_The_32_version_32_attribute_32_is_32_required, status );
                    symbol_1 = symbol_0;
                }
                final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
                        .evaluate( executor, TypeId.BOOLEAN, constraintName, this, ( Object ) null, diagnostics,
                                context, ( Object ) null, severity_0, symbol_1, NsdTables.INT_0 )
                        .booleanValue();
                symbol_2 = logDiagnostic;
            }
            return symbol_2;
        }
        catch( Throwable e ) {
            return ValueUtil.validationFailedDiagnostic( constraintName, this, diagnostics, context, e );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PubStage getPublicationStage() {
        return publicationStage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPublicationStage( PubStage newPublicationStage ) {
        PubStage oldPublicationStage = publicationStage;
        publicationStage = newPublicationStage == null ? PUBLICATION_STAGE_EDEFAULT : newPublicationStage;
        boolean oldPublicationStageESet = publicationStageESet;
        publicationStageESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.NS_DOC__PUBLICATION_STAGE,
                    oldPublicationStage, publicationStage, !oldPublicationStageESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPublicationStage() {
        PubStage oldPublicationStage = publicationStage;
        boolean oldPublicationStageESet = publicationStageESet;
        publicationStage = PUBLICATION_STAGE_EDEFAULT;
        publicationStageESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.NS_DOC__PUBLICATION_STAGE,
                    oldPublicationStage, PUBLICATION_STAGE_EDEFAULT, oldPublicationStageESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPublicationStage() {
        return publicationStageESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getRelease() {
        return release;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRelease( Integer newRelease ) {
        Integer oldRelease = release;
        release = newRelease;
        boolean oldReleaseESet = releaseESet;
        releaseESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.NS_DOC__RELEASE, oldRelease, release,
                    !oldReleaseESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRelease() {
        Integer oldRelease = release;
        boolean oldReleaseESet = releaseESet;
        release = RELEASE_EDEFAULT;
        releaseESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.NS_DOC__RELEASE, oldRelease,
                    RELEASE_EDEFAULT, oldReleaseESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRelease() {
        return releaseESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getRevision() {
        return revision;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRevision( String newRevision ) {
        String oldRevision = revision;
        revision = newRevision;
        boolean oldRevisionESet = revisionESet;
        revisionESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.NS_DOC__REVISION, oldRevision, revision,
                    !oldRevisionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRevision() {
        String oldRevision = revision;
        boolean oldRevisionESet = revisionESet;
        revision = REVISION_EDEFAULT;
        revisionESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.NS_DOC__REVISION, oldRevision,
                    REVISION_EDEFAULT, oldRevisionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRevision() {
        return revisionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public XMLGregorianCalendar getUmlDate() {
        return umlDate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUmlDate( XMLGregorianCalendar newUmlDate ) {
        XMLGregorianCalendar oldUmlDate = umlDate;
        umlDate = newUmlDate;
        boolean oldUmlDateESet = umlDateESet;
        umlDateESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.NS_DOC__UML_DATE, oldUmlDate, umlDate,
                    !oldUmlDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUmlDate() {
        XMLGregorianCalendar oldUmlDate = umlDate;
        boolean oldUmlDateESet = umlDateESet;
        umlDate = UML_DATE_EDEFAULT;
        umlDateESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.NS_DOC__UML_DATE, oldUmlDate,
                    UML_DATE_EDEFAULT, oldUmlDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUmlDate() {
        return umlDateESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getUmlVersion() {
        return umlVersion;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUmlVersion( String newUmlVersion ) {
        String oldUmlVersion = umlVersion;
        umlVersion = newUmlVersion;
        boolean oldUmlVersionESet = umlVersionESet;
        umlVersionESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.NS_DOC__UML_VERSION, oldUmlVersion,
                    umlVersion, !oldUmlVersionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUmlVersion() {
        String oldUmlVersion = umlVersion;
        boolean oldUmlVersionESet = umlVersionESet;
        umlVersion = UML_VERSION_EDEFAULT;
        umlVersionESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.NS_DOC__UML_VERSION, oldUmlVersion,
                    UML_VERSION_EDEFAULT, oldUmlVersionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUmlVersion() {
        return umlVersionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case NsdPackage.NS_DOC__DOC:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getDoc() ).basicAdd( otherEnd, msgs );
        }
        return super.eInverseAdd( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getVersion() {
        return version;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVersion( Integer newVersion ) {
        Integer oldVersion = version;
        version = newVersion;
        boolean oldVersionESet = versionESet;
        versionESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.NS_DOC__VERSION, oldVersion, version,
                    !oldVersionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVersion() {
        Integer oldVersion = version;
        boolean oldVersionESet = versionESet;
        version = VERSION_EDEFAULT;
        versionESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.NS_DOC__VERSION, oldVersion,
                    VERSION_EDEFAULT, oldVersionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVersion() {
        return versionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case NsdPackage.NS_DOC__DOC:
            return ( ( InternalEList< ? > ) getDoc() ).basicRemove( otherEnd, msgs );
        }
        return super.eInverseRemove( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case NsdPackage.NS_DOC__RELEASE:
            return getRelease();
        case NsdPackage.NS_DOC__VERSION:
            return getVersion();
        case NsdPackage.NS_DOC__ID:
            return getId();
        case NsdPackage.NS_DOC__REVISION:
            return getRevision();
        case NsdPackage.NS_DOC__PUBLICATION_STAGE:
            return getPublicationStage();
        case NsdPackage.NS_DOC__UML_DATE:
            return getUmlDate();
        case NsdPackage.NS_DOC__UML_VERSION:
            return getUmlVersion();
        case NsdPackage.NS_DOC__DOC:
            return getDoc();
        case NsdPackage.NS_DOC__LANG:
            return getLang();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case NsdPackage.NS_DOC__RELEASE:
            setRelease( ( Integer ) newValue );
            return;
        case NsdPackage.NS_DOC__VERSION:
            setVersion( ( Integer ) newValue );
            return;
        case NsdPackage.NS_DOC__ID:
            setId( ( String ) newValue );
            return;
        case NsdPackage.NS_DOC__REVISION:
            setRevision( ( String ) newValue );
            return;
        case NsdPackage.NS_DOC__PUBLICATION_STAGE:
            setPublicationStage( ( PubStage ) newValue );
            return;
        case NsdPackage.NS_DOC__UML_DATE:
            setUmlDate( ( XMLGregorianCalendar ) newValue );
            return;
        case NsdPackage.NS_DOC__UML_VERSION:
            setUmlVersion( ( String ) newValue );
            return;
        case NsdPackage.NS_DOC__DOC:
            getDoc().clear();
            getDoc().addAll( ( Collection< ? extends Doc > ) newValue );
            return;
        case NsdPackage.NS_DOC__LANG:
            setLang( ( String ) newValue );
            return;
        }
        super.eSet( featureID, newValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset( int featureID ) {
        switch( featureID ) {
        case NsdPackage.NS_DOC__RELEASE:
            unsetRelease();
            return;
        case NsdPackage.NS_DOC__VERSION:
            unsetVersion();
            return;
        case NsdPackage.NS_DOC__ID:
            unsetId();
            return;
        case NsdPackage.NS_DOC__REVISION:
            unsetRevision();
            return;
        case NsdPackage.NS_DOC__PUBLICATION_STAGE:
            unsetPublicationStage();
            return;
        case NsdPackage.NS_DOC__UML_DATE:
            unsetUmlDate();
            return;
        case NsdPackage.NS_DOC__UML_VERSION:
            unsetUmlVersion();
            return;
        case NsdPackage.NS_DOC__DOC:
            unsetDoc();
            return;
        case NsdPackage.NS_DOC__LANG:
            unsetLang();
            return;
        }
        super.eUnset( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet( int featureID ) {
        switch( featureID ) {
        case NsdPackage.NS_DOC__RELEASE:
            return isSetRelease();
        case NsdPackage.NS_DOC__VERSION:
            return isSetVersion();
        case NsdPackage.NS_DOC__ID:
            return isSetId();
        case NsdPackage.NS_DOC__REVISION:
            return isSetRevision();
        case NsdPackage.NS_DOC__PUBLICATION_STAGE:
            return isSetPublicationStage();
        case NsdPackage.NS_DOC__UML_DATE:
            return isSetUmlDate();
        case NsdPackage.NS_DOC__UML_VERSION:
            return isSetUmlVersion();
        case NsdPackage.NS_DOC__DOC:
            return isSetDoc();
        case NsdPackage.NS_DOC__LANG:
            return isSetLang();
        }
        return super.eIsSet( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID( int derivedFeatureID, Class< ? > baseClass ) {
        if( baseClass == AgNSIdentification.class ) {
            switch( derivedFeatureID ) {
            case NsdPackage.NS_DOC__RELEASE:
                return NsdPackage.AG_NS_IDENTIFICATION__RELEASE;
            case NsdPackage.NS_DOC__VERSION:
                return NsdPackage.AG_NS_IDENTIFICATION__VERSION;
            case NsdPackage.NS_DOC__ID:
                return NsdPackage.AG_NS_IDENTIFICATION__ID;
            case NsdPackage.NS_DOC__REVISION:
                return NsdPackage.AG_NS_IDENTIFICATION__REVISION;
            case NsdPackage.NS_DOC__PUBLICATION_STAGE:
                return NsdPackage.AG_NS_IDENTIFICATION__PUBLICATION_STAGE;
            default:
                return -1;
            }
        }
        if( baseClass == AgUML.class ) {
            switch( derivedFeatureID ) {
            case NsdPackage.NS_DOC__UML_DATE:
                return NsdPackage.AG_UML__UML_DATE;
            case NsdPackage.NS_DOC__UML_VERSION:
                return NsdPackage.AG_UML__UML_VERSION;
            default:
                return -1;
            }
        }
        return super.eBaseStructuralFeatureID( derivedFeatureID, baseClass );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID( int baseFeatureID, Class< ? > baseClass ) {
        if( baseClass == AgNSIdentification.class ) {
            switch( baseFeatureID ) {
            case NsdPackage.AG_NS_IDENTIFICATION__RELEASE:
                return NsdPackage.NS_DOC__RELEASE;
            case NsdPackage.AG_NS_IDENTIFICATION__VERSION:
                return NsdPackage.NS_DOC__VERSION;
            case NsdPackage.AG_NS_IDENTIFICATION__ID:
                return NsdPackage.NS_DOC__ID;
            case NsdPackage.AG_NS_IDENTIFICATION__REVISION:
                return NsdPackage.NS_DOC__REVISION;
            case NsdPackage.AG_NS_IDENTIFICATION__PUBLICATION_STAGE:
                return NsdPackage.NS_DOC__PUBLICATION_STAGE;
            default:
                return -1;
            }
        }
        if( baseClass == AgUML.class ) {
            switch( baseFeatureID ) {
            case NsdPackage.AG_UML__UML_DATE:
                return NsdPackage.NS_DOC__UML_DATE;
            case NsdPackage.AG_UML__UML_VERSION:
                return NsdPackage.NS_DOC__UML_VERSION;
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID( baseFeatureID, baseClass );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedOperationID( int baseOperationID, Class< ? > baseClass ) {
        if( baseClass == AgNSIdentification.class ) {
            switch( baseOperationID ) {
            case NsdPackage.AG_NS_IDENTIFICATION___ID_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP:
                return NsdPackage.NS_DOC___ID_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP;
            case NsdPackage.AG_NS_IDENTIFICATION___VERSION_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP:
                return NsdPackage.NS_DOC___VERSION_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP;
            default:
                return -1;
            }
        }
        if( baseClass == AgUML.class ) {
            switch( baseOperationID ) {
            default:
                return -1;
            }
        }
        return super.eDerivedOperationID( baseOperationID, baseClass );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    @SuppressWarnings( "unchecked" )
    public Object eInvoke( int operationID, EList< ? > arguments ) throws InvocationTargetException {
        switch( operationID ) {
        case NsdPackage.NS_DOC___LANG_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP:
            return langAttributeRequired( ( DiagnosticChain ) arguments.get( 0 ),
                    ( Map< Object, Object > ) arguments.get( 1 ) );
        case NsdPackage.NS_DOC___ID_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP:
            return idAttributeRequired( ( DiagnosticChain ) arguments.get( 0 ),
                    ( Map< Object, Object > ) arguments.get( 1 ) );
        case NsdPackage.NS_DOC___VERSION_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP:
            return versionAttributeRequired( ( DiagnosticChain ) arguments.get( 0 ),
                    ( Map< Object, Object > ) arguments.get( 1 ) );
        }
        return super.eInvoke( operationID, arguments );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if( eIsProxy() ) return super.toString();

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (release: " );
        if( releaseESet )
            result.append( release );
        else
            result.append( "<unset>" );
        result.append( ", version: " );
        if( versionESet )
            result.append( version );
        else
            result.append( "<unset>" );
        result.append( ", id: " );
        if( idESet )
            result.append( id );
        else
            result.append( "<unset>" );
        result.append( ", revision: " );
        if( revisionESet )
            result.append( revision );
        else
            result.append( "<unset>" );
        result.append( ", publicationStage: " );
        if( publicationStageESet )
            result.append( publicationStage );
        else
            result.append( "<unset>" );
        result.append( ", umlDate: " );
        if( umlDateESet )
            result.append( umlDate );
        else
            result.append( "<unset>" );
        result.append( ", umlVersion: " );
        if( umlVersionESet )
            result.append( umlVersion );
        else
            result.append( "<unset>" );
        result.append( ", lang: " );
        if( langESet )
            result.append( lang );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //NSDocImpl
