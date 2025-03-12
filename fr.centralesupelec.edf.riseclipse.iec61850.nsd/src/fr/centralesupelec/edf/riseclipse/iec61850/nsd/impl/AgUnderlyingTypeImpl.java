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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgUnderlyingType;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicType;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttribute;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.DefinedAttributeTypeKind;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ag Underlying Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AgUnderlyingTypeImpl#getUnderlyingType <em>Underlying Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AgUnderlyingTypeImpl#getUnderlyingTypeKind <em>Underlying Type Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AgUnderlyingTypeImpl#getRefersToUnderlyingBasicType <em>Refers To Underlying Basic Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AgUnderlyingTypeImpl#getRefersToUnderlyingConstructedAttribute <em>Refers To Underlying Constructed Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AgUnderlyingTypeImpl#getRefersToUnderlyingEnumeration <em>Refers To Underlying Enumeration</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AgUnderlyingTypeImpl#getUnderlyingControlType <em>Underlying Control Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AgUnderlyingTypeImpl extends MinimalEObjectImpl.Container implements AgUnderlyingType {
    /**
     * The default value of the '{@link #getUnderlyingType() <em>Underlying Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUnderlyingType()
     * @generated
     * @ordered
     */
    protected static final String UNDERLYING_TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUnderlyingType() <em>Underlying Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUnderlyingType()
     * @generated
     * @ordered
     */
    protected String underlyingType = UNDERLYING_TYPE_EDEFAULT;

    /**
     * This is true if the Underlying Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean underlyingTypeESet;

    /**
     * The default value of the '{@link #getUnderlyingTypeKind() <em>Underlying Type Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUnderlyingTypeKind()
     * @generated
     * @ordered
     */
    protected static final DefinedAttributeTypeKind UNDERLYING_TYPE_KIND_EDEFAULT = DefinedAttributeTypeKind.BASIC;

    /**
     * The cached value of the '{@link #getUnderlyingTypeKind() <em>Underlying Type Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUnderlyingTypeKind()
     * @generated
     * @ordered
     */
    protected DefinedAttributeTypeKind underlyingTypeKind = UNDERLYING_TYPE_KIND_EDEFAULT;

    /**
     * This is true if the Underlying Type Kind attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean underlyingTypeKindESet;

    /**
     * The cached value of the '{@link #getRefersToUnderlyingBasicType() <em>Refers To Underlying Basic Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToUnderlyingBasicType()
     * @generated
     * @ordered
     */
    protected BasicType refersToUnderlyingBasicType;

    /**
     * This is true if the Refers To Underlying Basic Type reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToUnderlyingBasicTypeESet;

    /**
     * The cached value of the '{@link #getRefersToUnderlyingConstructedAttribute() <em>Refers To Underlying Constructed Attribute</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToUnderlyingConstructedAttribute()
     * @generated
     * @ordered
     */
    protected ConstructedAttribute refersToUnderlyingConstructedAttribute;

    /**
     * This is true if the Refers To Underlying Constructed Attribute reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToUnderlyingConstructedAttributeESet;

    /**
     * The cached value of the '{@link #getRefersToUnderlyingEnumeration() <em>Refers To Underlying Enumeration</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToUnderlyingEnumeration()
     * @generated
     * @ordered
     */
    protected Enumeration refersToUnderlyingEnumeration;

    /**
     * This is true if the Refers To Underlying Enumeration reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToUnderlyingEnumerationESet;

    /**
     * The default value of the '{@link #getUnderlyingControlType() <em>Underlying Control Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUnderlyingControlType()
     * @generated
     * @ordered
     */
    protected static final String UNDERLYING_CONTROL_TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUnderlyingControlType() <em>Underlying Control Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUnderlyingControlType()
     * @generated
     * @ordered
     */
    protected String underlyingControlType = UNDERLYING_CONTROL_TYPE_EDEFAULT;

    /**
     * This is true if the Underlying Control Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean underlyingControlTypeESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AgUnderlyingTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.AG_UNDERLYING_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getUnderlyingType() {
        return underlyingType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUnderlyingType( String newUnderlyingType ) {
        String oldUnderlyingType = underlyingType;
        underlyingType = newUnderlyingType;
        boolean oldUnderlyingTypeESet = underlyingTypeESet;
        underlyingTypeESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.AG_UNDERLYING_TYPE__UNDERLYING_TYPE,
                    oldUnderlyingType, underlyingType, !oldUnderlyingTypeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUnderlyingType() {
        String oldUnderlyingType = underlyingType;
        boolean oldUnderlyingTypeESet = underlyingTypeESet;
        underlyingType = UNDERLYING_TYPE_EDEFAULT;
        underlyingTypeESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.AG_UNDERLYING_TYPE__UNDERLYING_TYPE,
                    oldUnderlyingType, UNDERLYING_TYPE_EDEFAULT, oldUnderlyingTypeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUnderlyingType() {
        return underlyingTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DefinedAttributeTypeKind getUnderlyingTypeKind() {
        return underlyingTypeKind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUnderlyingTypeKind( DefinedAttributeTypeKind newUnderlyingTypeKind ) {
        DefinedAttributeTypeKind oldUnderlyingTypeKind = underlyingTypeKind;
        underlyingTypeKind = newUnderlyingTypeKind == null ? UNDERLYING_TYPE_KIND_EDEFAULT : newUnderlyingTypeKind;
        boolean oldUnderlyingTypeKindESet = underlyingTypeKindESet;
        underlyingTypeKindESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.AG_UNDERLYING_TYPE__UNDERLYING_TYPE_KIND,
                    oldUnderlyingTypeKind, underlyingTypeKind, !oldUnderlyingTypeKindESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUnderlyingTypeKind() {
        DefinedAttributeTypeKind oldUnderlyingTypeKind = underlyingTypeKind;
        boolean oldUnderlyingTypeKindESet = underlyingTypeKindESet;
        underlyingTypeKind = UNDERLYING_TYPE_KIND_EDEFAULT;
        underlyingTypeKindESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    NsdPackage.AG_UNDERLYING_TYPE__UNDERLYING_TYPE_KIND, oldUnderlyingTypeKind,
                    UNDERLYING_TYPE_KIND_EDEFAULT, oldUnderlyingTypeKindESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUnderlyingTypeKind() {
        return underlyingTypeKindESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BasicType getRefersToUnderlyingBasicType() {
        return refersToUnderlyingBasicType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToUnderlyingBasicType( BasicType newRefersToUnderlyingBasicType,
            NotificationChain msgs ) {
        BasicType oldRefersToUnderlyingBasicType = refersToUnderlyingBasicType;
        refersToUnderlyingBasicType = newRefersToUnderlyingBasicType;
        boolean oldRefersToUnderlyingBasicTypeESet = refersToUnderlyingBasicTypeESet;
        refersToUnderlyingBasicTypeESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    NsdPackage.AG_UNDERLYING_TYPE__REFERS_TO_UNDERLYING_BASIC_TYPE, oldRefersToUnderlyingBasicType,
                    newRefersToUnderlyingBasicType, !oldRefersToUnderlyingBasicTypeESet );
            if( msgs == null ) {
                msgs = notification;
            }
            else {
                msgs.add( notification );
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRefersToUnderlyingBasicType( BasicType newRefersToUnderlyingBasicType ) {
        if( newRefersToUnderlyingBasicType != refersToUnderlyingBasicType ) {
            NotificationChain msgs = null;
            if( refersToUnderlyingBasicType != null ) {
                msgs = ( ( InternalEObject ) refersToUnderlyingBasicType ).eInverseRemove( this,
                        NsdPackage.BASIC_TYPE__REFERRED_BY_UNDERLYING_TYPE, BasicType.class, msgs );
            }
            if( newRefersToUnderlyingBasicType != null ) {
                msgs = ( ( InternalEObject ) newRefersToUnderlyingBasicType ).eInverseAdd( this,
                        NsdPackage.BASIC_TYPE__REFERRED_BY_UNDERLYING_TYPE, BasicType.class, msgs );
            }
            msgs = basicSetRefersToUnderlyingBasicType( newRefersToUnderlyingBasicType, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToUnderlyingBasicTypeESet = refersToUnderlyingBasicTypeESet;
            refersToUnderlyingBasicTypeESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET,
                        NsdPackage.AG_UNDERLYING_TYPE__REFERS_TO_UNDERLYING_BASIC_TYPE, newRefersToUnderlyingBasicType,
                        newRefersToUnderlyingBasicType, !oldRefersToUnderlyingBasicTypeESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToUnderlyingBasicType( NotificationChain msgs ) {
        BasicType oldRefersToUnderlyingBasicType = refersToUnderlyingBasicType;
        refersToUnderlyingBasicType = null;
        boolean oldRefersToUnderlyingBasicTypeESet = refersToUnderlyingBasicTypeESet;
        refersToUnderlyingBasicTypeESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    NsdPackage.AG_UNDERLYING_TYPE__REFERS_TO_UNDERLYING_BASIC_TYPE, oldRefersToUnderlyingBasicType,
                    null, oldRefersToUnderlyingBasicTypeESet );
            if( msgs == null ) {
                msgs = notification;
            }
            else {
                msgs.add( notification );
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRefersToUnderlyingBasicType() {
        if( refersToUnderlyingBasicType != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToUnderlyingBasicType ).eInverseRemove( this,
                    NsdPackage.BASIC_TYPE__REFERRED_BY_UNDERLYING_TYPE, BasicType.class, msgs );
            msgs = basicUnsetRefersToUnderlyingBasicType( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToUnderlyingBasicTypeESet = refersToUnderlyingBasicTypeESet;
            refersToUnderlyingBasicTypeESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        NsdPackage.AG_UNDERLYING_TYPE__REFERS_TO_UNDERLYING_BASIC_TYPE, null, null,
                        oldRefersToUnderlyingBasicTypeESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToUnderlyingBasicType() {
        return refersToUnderlyingBasicTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ConstructedAttribute getRefersToUnderlyingConstructedAttribute() {
        return refersToUnderlyingConstructedAttribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToUnderlyingConstructedAttribute(
            ConstructedAttribute newRefersToUnderlyingConstructedAttribute, NotificationChain msgs ) {
        ConstructedAttribute oldRefersToUnderlyingConstructedAttribute = refersToUnderlyingConstructedAttribute;
        refersToUnderlyingConstructedAttribute = newRefersToUnderlyingConstructedAttribute;
        boolean oldRefersToUnderlyingConstructedAttributeESet = refersToUnderlyingConstructedAttributeESet;
        refersToUnderlyingConstructedAttributeESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    NsdPackage.AG_UNDERLYING_TYPE__REFERS_TO_UNDERLYING_CONSTRUCTED_ATTRIBUTE,
                    oldRefersToUnderlyingConstructedAttribute, newRefersToUnderlyingConstructedAttribute,
                    !oldRefersToUnderlyingConstructedAttributeESet );
            if( msgs == null ) {
                msgs = notification;
            }
            else {
                msgs.add( notification );
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRefersToUnderlyingConstructedAttribute(
            ConstructedAttribute newRefersToUnderlyingConstructedAttribute ) {
        if( newRefersToUnderlyingConstructedAttribute != refersToUnderlyingConstructedAttribute ) {
            NotificationChain msgs = null;
            if( refersToUnderlyingConstructedAttribute != null ) {
                msgs = ( ( InternalEObject ) refersToUnderlyingConstructedAttribute ).eInverseRemove( this,
                        NsdPackage.CONSTRUCTED_ATTRIBUTE__REFERRED_BY_UNDERLYING_TYPE, ConstructedAttribute.class,
                        msgs );
            }
            if( newRefersToUnderlyingConstructedAttribute != null ) {
                msgs = ( ( InternalEObject ) newRefersToUnderlyingConstructedAttribute ).eInverseAdd( this,
                        NsdPackage.CONSTRUCTED_ATTRIBUTE__REFERRED_BY_UNDERLYING_TYPE, ConstructedAttribute.class,
                        msgs );
            }
            msgs = basicSetRefersToUnderlyingConstructedAttribute( newRefersToUnderlyingConstructedAttribute, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToUnderlyingConstructedAttributeESet = refersToUnderlyingConstructedAttributeESet;
            refersToUnderlyingConstructedAttributeESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET,
                        NsdPackage.AG_UNDERLYING_TYPE__REFERS_TO_UNDERLYING_CONSTRUCTED_ATTRIBUTE,
                        newRefersToUnderlyingConstructedAttribute, newRefersToUnderlyingConstructedAttribute,
                        !oldRefersToUnderlyingConstructedAttributeESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToUnderlyingConstructedAttribute( NotificationChain msgs ) {
        ConstructedAttribute oldRefersToUnderlyingConstructedAttribute = refersToUnderlyingConstructedAttribute;
        refersToUnderlyingConstructedAttribute = null;
        boolean oldRefersToUnderlyingConstructedAttributeESet = refersToUnderlyingConstructedAttributeESet;
        refersToUnderlyingConstructedAttributeESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    NsdPackage.AG_UNDERLYING_TYPE__REFERS_TO_UNDERLYING_CONSTRUCTED_ATTRIBUTE,
                    oldRefersToUnderlyingConstructedAttribute, null, oldRefersToUnderlyingConstructedAttributeESet );
            if( msgs == null ) {
                msgs = notification;
            }
            else {
                msgs.add( notification );
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRefersToUnderlyingConstructedAttribute() {
        if( refersToUnderlyingConstructedAttribute != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToUnderlyingConstructedAttribute ).eInverseRemove( this,
                    NsdPackage.CONSTRUCTED_ATTRIBUTE__REFERRED_BY_UNDERLYING_TYPE, ConstructedAttribute.class, msgs );
            msgs = basicUnsetRefersToUnderlyingConstructedAttribute( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToUnderlyingConstructedAttributeESet = refersToUnderlyingConstructedAttributeESet;
            refersToUnderlyingConstructedAttributeESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        NsdPackage.AG_UNDERLYING_TYPE__REFERS_TO_UNDERLYING_CONSTRUCTED_ATTRIBUTE, null, null,
                        oldRefersToUnderlyingConstructedAttributeESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToUnderlyingConstructedAttribute() {
        return refersToUnderlyingConstructedAttributeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Enumeration getRefersToUnderlyingEnumeration() {
        return refersToUnderlyingEnumeration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToUnderlyingEnumeration( Enumeration newRefersToUnderlyingEnumeration,
            NotificationChain msgs ) {
        Enumeration oldRefersToUnderlyingEnumeration = refersToUnderlyingEnumeration;
        refersToUnderlyingEnumeration = newRefersToUnderlyingEnumeration;
        boolean oldRefersToUnderlyingEnumerationESet = refersToUnderlyingEnumerationESet;
        refersToUnderlyingEnumerationESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    NsdPackage.AG_UNDERLYING_TYPE__REFERS_TO_UNDERLYING_ENUMERATION, oldRefersToUnderlyingEnumeration,
                    newRefersToUnderlyingEnumeration, !oldRefersToUnderlyingEnumerationESet );
            if( msgs == null ) {
                msgs = notification;
            }
            else {
                msgs.add( notification );
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRefersToUnderlyingEnumeration( Enumeration newRefersToUnderlyingEnumeration ) {
        if( newRefersToUnderlyingEnumeration != refersToUnderlyingEnumeration ) {
            NotificationChain msgs = null;
            if( refersToUnderlyingEnumeration != null ) {
                msgs = ( ( InternalEObject ) refersToUnderlyingEnumeration ).eInverseRemove( this,
                        NsdPackage.ENUMERATION__REFERRED_BY_UNDERLYING_TYPE, Enumeration.class, msgs );
            }
            if( newRefersToUnderlyingEnumeration != null ) {
                msgs = ( ( InternalEObject ) newRefersToUnderlyingEnumeration ).eInverseAdd( this,
                        NsdPackage.ENUMERATION__REFERRED_BY_UNDERLYING_TYPE, Enumeration.class, msgs );
            }
            msgs = basicSetRefersToUnderlyingEnumeration( newRefersToUnderlyingEnumeration, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToUnderlyingEnumerationESet = refersToUnderlyingEnumerationESet;
            refersToUnderlyingEnumerationESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET,
                        NsdPackage.AG_UNDERLYING_TYPE__REFERS_TO_UNDERLYING_ENUMERATION,
                        newRefersToUnderlyingEnumeration, newRefersToUnderlyingEnumeration,
                        !oldRefersToUnderlyingEnumerationESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToUnderlyingEnumeration( NotificationChain msgs ) {
        Enumeration oldRefersToUnderlyingEnumeration = refersToUnderlyingEnumeration;
        refersToUnderlyingEnumeration = null;
        boolean oldRefersToUnderlyingEnumerationESet = refersToUnderlyingEnumerationESet;
        refersToUnderlyingEnumerationESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    NsdPackage.AG_UNDERLYING_TYPE__REFERS_TO_UNDERLYING_ENUMERATION, oldRefersToUnderlyingEnumeration,
                    null, oldRefersToUnderlyingEnumerationESet );
            if( msgs == null ) {
                msgs = notification;
            }
            else {
                msgs.add( notification );
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRefersToUnderlyingEnumeration() {
        if( refersToUnderlyingEnumeration != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToUnderlyingEnumeration ).eInverseRemove( this,
                    NsdPackage.ENUMERATION__REFERRED_BY_UNDERLYING_TYPE, Enumeration.class, msgs );
            msgs = basicUnsetRefersToUnderlyingEnumeration( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToUnderlyingEnumerationESet = refersToUnderlyingEnumerationESet;
            refersToUnderlyingEnumerationESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        NsdPackage.AG_UNDERLYING_TYPE__REFERS_TO_UNDERLYING_ENUMERATION, null, null,
                        oldRefersToUnderlyingEnumerationESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToUnderlyingEnumeration() {
        return refersToUnderlyingEnumerationESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getUnderlyingControlType() {
        return underlyingControlType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUnderlyingControlType( String newUnderlyingControlType ) {
        String oldUnderlyingControlType = underlyingControlType;
        underlyingControlType = newUnderlyingControlType;
        boolean oldUnderlyingControlTypeESet = underlyingControlTypeESet;
        underlyingControlTypeESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    NsdPackage.AG_UNDERLYING_TYPE__UNDERLYING_CONTROL_TYPE, oldUnderlyingControlType,
                    underlyingControlType, !oldUnderlyingControlTypeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUnderlyingControlType() {
        String oldUnderlyingControlType = underlyingControlType;
        boolean oldUnderlyingControlTypeESet = underlyingControlTypeESet;
        underlyingControlType = UNDERLYING_CONTROL_TYPE_EDEFAULT;
        underlyingControlTypeESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    NsdPackage.AG_UNDERLYING_TYPE__UNDERLYING_CONTROL_TYPE, oldUnderlyingControlType,
                    UNDERLYING_CONTROL_TYPE_EDEFAULT, oldUnderlyingControlTypeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUnderlyingControlType() {
        return underlyingControlTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case NsdPackage.AG_UNDERLYING_TYPE__REFERS_TO_UNDERLYING_BASIC_TYPE:
            if( refersToUnderlyingBasicType != null ) {
                msgs = ( ( InternalEObject ) refersToUnderlyingBasicType ).eInverseRemove( this,
                        NsdPackage.BASIC_TYPE__REFERRED_BY_UNDERLYING_TYPE, BasicType.class, msgs );
            }
            return basicSetRefersToUnderlyingBasicType( ( BasicType ) otherEnd, msgs );
        case NsdPackage.AG_UNDERLYING_TYPE__REFERS_TO_UNDERLYING_CONSTRUCTED_ATTRIBUTE:
            if( refersToUnderlyingConstructedAttribute != null ) {
                msgs = ( ( InternalEObject ) refersToUnderlyingConstructedAttribute ).eInverseRemove( this,
                        NsdPackage.CONSTRUCTED_ATTRIBUTE__REFERRED_BY_UNDERLYING_TYPE, ConstructedAttribute.class,
                        msgs );
            }
            return basicSetRefersToUnderlyingConstructedAttribute( ( ConstructedAttribute ) otherEnd, msgs );
        case NsdPackage.AG_UNDERLYING_TYPE__REFERS_TO_UNDERLYING_ENUMERATION:
            if( refersToUnderlyingEnumeration != null ) {
                msgs = ( ( InternalEObject ) refersToUnderlyingEnumeration ).eInverseRemove( this,
                        NsdPackage.ENUMERATION__REFERRED_BY_UNDERLYING_TYPE, Enumeration.class, msgs );
            }
            return basicSetRefersToUnderlyingEnumeration( ( Enumeration ) otherEnd, msgs );
        }
        return super.eInverseAdd( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case NsdPackage.AG_UNDERLYING_TYPE__REFERS_TO_UNDERLYING_BASIC_TYPE:
            return basicUnsetRefersToUnderlyingBasicType( msgs );
        case NsdPackage.AG_UNDERLYING_TYPE__REFERS_TO_UNDERLYING_CONSTRUCTED_ATTRIBUTE:
            return basicUnsetRefersToUnderlyingConstructedAttribute( msgs );
        case NsdPackage.AG_UNDERLYING_TYPE__REFERS_TO_UNDERLYING_ENUMERATION:
            return basicUnsetRefersToUnderlyingEnumeration( msgs );
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
        case NsdPackage.AG_UNDERLYING_TYPE__UNDERLYING_TYPE:
            return getUnderlyingType();
        case NsdPackage.AG_UNDERLYING_TYPE__UNDERLYING_TYPE_KIND:
            return getUnderlyingTypeKind();
        case NsdPackage.AG_UNDERLYING_TYPE__REFERS_TO_UNDERLYING_BASIC_TYPE:
            return getRefersToUnderlyingBasicType();
        case NsdPackage.AG_UNDERLYING_TYPE__REFERS_TO_UNDERLYING_CONSTRUCTED_ATTRIBUTE:
            return getRefersToUnderlyingConstructedAttribute();
        case NsdPackage.AG_UNDERLYING_TYPE__REFERS_TO_UNDERLYING_ENUMERATION:
            return getRefersToUnderlyingEnumeration();
        case NsdPackage.AG_UNDERLYING_TYPE__UNDERLYING_CONTROL_TYPE:
            return getUnderlyingControlType();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case NsdPackage.AG_UNDERLYING_TYPE__UNDERLYING_TYPE:
            setUnderlyingType( ( String ) newValue );
            return;
        case NsdPackage.AG_UNDERLYING_TYPE__UNDERLYING_TYPE_KIND:
            setUnderlyingTypeKind( ( DefinedAttributeTypeKind ) newValue );
            return;
        case NsdPackage.AG_UNDERLYING_TYPE__REFERS_TO_UNDERLYING_BASIC_TYPE:
            setRefersToUnderlyingBasicType( ( BasicType ) newValue );
            return;
        case NsdPackage.AG_UNDERLYING_TYPE__REFERS_TO_UNDERLYING_CONSTRUCTED_ATTRIBUTE:
            setRefersToUnderlyingConstructedAttribute( ( ConstructedAttribute ) newValue );
            return;
        case NsdPackage.AG_UNDERLYING_TYPE__REFERS_TO_UNDERLYING_ENUMERATION:
            setRefersToUnderlyingEnumeration( ( Enumeration ) newValue );
            return;
        case NsdPackage.AG_UNDERLYING_TYPE__UNDERLYING_CONTROL_TYPE:
            setUnderlyingControlType( ( String ) newValue );
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
        case NsdPackage.AG_UNDERLYING_TYPE__UNDERLYING_TYPE:
            unsetUnderlyingType();
            return;
        case NsdPackage.AG_UNDERLYING_TYPE__UNDERLYING_TYPE_KIND:
            unsetUnderlyingTypeKind();
            return;
        case NsdPackage.AG_UNDERLYING_TYPE__REFERS_TO_UNDERLYING_BASIC_TYPE:
            unsetRefersToUnderlyingBasicType();
            return;
        case NsdPackage.AG_UNDERLYING_TYPE__REFERS_TO_UNDERLYING_CONSTRUCTED_ATTRIBUTE:
            unsetRefersToUnderlyingConstructedAttribute();
            return;
        case NsdPackage.AG_UNDERLYING_TYPE__REFERS_TO_UNDERLYING_ENUMERATION:
            unsetRefersToUnderlyingEnumeration();
            return;
        case NsdPackage.AG_UNDERLYING_TYPE__UNDERLYING_CONTROL_TYPE:
            unsetUnderlyingControlType();
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
        case NsdPackage.AG_UNDERLYING_TYPE__UNDERLYING_TYPE:
            return isSetUnderlyingType();
        case NsdPackage.AG_UNDERLYING_TYPE__UNDERLYING_TYPE_KIND:
            return isSetUnderlyingTypeKind();
        case NsdPackage.AG_UNDERLYING_TYPE__REFERS_TO_UNDERLYING_BASIC_TYPE:
            return isSetRefersToUnderlyingBasicType();
        case NsdPackage.AG_UNDERLYING_TYPE__REFERS_TO_UNDERLYING_CONSTRUCTED_ATTRIBUTE:
            return isSetRefersToUnderlyingConstructedAttribute();
        case NsdPackage.AG_UNDERLYING_TYPE__REFERS_TO_UNDERLYING_ENUMERATION:
            return isSetRefersToUnderlyingEnumeration();
        case NsdPackage.AG_UNDERLYING_TYPE__UNDERLYING_CONTROL_TYPE:
            return isSetUnderlyingControlType();
        }
        return super.eIsSet( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if( eIsProxy() ) {
            return super.toString();
        }

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (underlyingType: " );
        if( underlyingTypeESet ) {
            result.append( underlyingType );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", underlyingTypeKind: " );
        if( underlyingTypeKindESet ) {
            result.append( underlyingTypeKind );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", underlyingControlType: " );
        if( underlyingControlTypeESet ) {
            result.append( underlyingControlType );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ')' );
        return result.toString();
    }

} //AgUnderlyingTypeImpl
