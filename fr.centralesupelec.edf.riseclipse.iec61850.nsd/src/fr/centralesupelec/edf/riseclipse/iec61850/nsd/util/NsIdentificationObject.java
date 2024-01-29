package fr.centralesupelec.edf.riseclipse.iec61850.nsd.util;

import java.util.IdentityHashMap;

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSIdentification;

/*
 * A object in a namespace, used as a key in maps
 * 
 * The uniqueness of its instances is ensured so that they can be used as keys in an IdentityHashMap
 */

public class NsIdentificationObject {
    final private NsIdentification nsIdentification;
    final private Object object;
    
    private static IdentityHashMap< NsIdentification, IdentityHashMap< Object, NsIdentificationObject >> nsIdentificationObjects;
    
    public static void reset() {
        nsIdentificationObjects = new IdentityHashMap<>();
    }
    
    public static NsIdentificationObject of( NsIdentification nsId, Object object ) {
        if( ! nsIdentificationObjects.containsKey( nsId )) {
            nsIdentificationObjects.put( nsId, new IdentityHashMap<>() );
        }
        if( ! nsIdentificationObjects.get( nsId ).containsKey( object )) {
            nsIdentificationObjects.get( nsId ).put( object, new NsIdentificationObject( nsId, object ));
        }
        return nsIdentificationObjects.get( nsId ).get( object );
    }

    private NsIdentificationObject( NsIdentification identification, Object object ) {
        this.nsIdentification = identification;
        this.object = object;
    }

    public static NsIdentificationObject of( String id, Integer version, String revision, Integer release, Object object ) {
        return of( NsIdentification.of( id, version, revision, release ), object );
    }

    public static NsIdentificationObject of( AgNSIdentification identification, Object object ) {
        return of( NsIdentification.of( identification ), object );
    }

    public static NsIdentificationObject of( String namespace, Object object ) {
        return of( NsIdentification.of( namespace ), object );
    }

    @Override
    public String toString() {
        return nsIdentification.toString() + " - " + object;
    }

}
