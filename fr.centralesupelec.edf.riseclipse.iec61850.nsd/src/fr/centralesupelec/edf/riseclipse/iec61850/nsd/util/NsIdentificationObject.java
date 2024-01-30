/*
*************************************************************************
**  Copyright (c) 2021-2024 CentraleSupélec & EDF.
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
**      https://riseclipse.github.io
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.iec61850.nsd.util;

import java.util.IdentityHashMap;
import java.util.Map;

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSIdentification;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdObject;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdObjectImpl;

/*
 * A object in a namespace, used as a key in maps
 * 
 * The uniqueness of its instances is ensured so that they can be used as keys in an IdentityHashMap
 */

public class NsIdentificationObject {
    final private NsIdentification nsIdentification;
    final private NsdObject object;
    
    public static NsIdentificationObject of( NsIdentification nsId, NsdObject object ) {
        Map< NsIdentification, IdentityHashMap< NsdObject, NsIdentificationObject >> nsIdentificationObjects =
                (( NsdObjectImpl ) object ).getResourceSet().getNsIdentificationObjects();
        if( ! nsIdentificationObjects.containsKey( nsId )) {
            nsIdentificationObjects.put( nsId, new IdentityHashMap<>() );
        }
        if( ! nsIdentificationObjects.get( nsId ).containsKey( object )) {
            nsIdentificationObjects.get( nsId ).put( object, new NsIdentificationObject( nsId, object ));
        }
        return nsIdentificationObjects.get( nsId ).get( object );
    }

    private NsIdentificationObject( NsIdentification identification, NsdObject object ) {
        this.nsIdentification = identification;
        this.object = object;
    }

    public static NsIdentificationObject of( String id, Integer version, String revision, Integer release, NsdObject object ) {
        return of( NsIdentification.of( id, version, revision, release ), object );
    }

    public static NsIdentificationObject of( AgNSIdentification identification, NsdObject object ) {
        return of( NsIdentification.of( identification ), object );
    }

    public static NsIdentificationObject of( String namespace, NsdObject object ) {
        return of( NsIdentification.of( namespace ), object );
    }

    @Override
    public String toString() {
        return nsIdentification.toString() + " - " + object;
    }

}
