/*
*************************************************************************
**  Copyright (c) 2021 CentraleSupélec & EDF.
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

import java.util.HashMap;

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSIdentification;

/*
 * A name in a namespace, used as a key in maps
 */
public class NsIdentificationName {
    final private NsIdentification nsIdentification;
    final private String name;
    
    private static HashMap< NsIdentification, HashMap< String, NsIdentificationName >> nsIdentificationNames = new HashMap<>();
    
    public static NsIdentificationName of( NsIdentification nsId, String name ) {
        if( ! nsIdentificationNames.containsKey( nsId )) {
            nsIdentificationNames.put( nsId, new HashMap<>() );
        }
        if( ! nsIdentificationNames.get( nsId ).containsKey( name )) {
            nsIdentificationNames.get( nsId ).put( name, new NsIdentificationName( nsId, name ));
        }
        return nsIdentificationNames.get( nsId ).get( name );
    }

    private NsIdentificationName( NsIdentification identification, String name ) {
        this.nsIdentification = identification;
        this.name = name;
    }

    public static NsIdentificationName of( String id, Integer version, String revision, Integer release, String name ) {
        return of( NsIdentification.of( id, version, revision, release ), name );
    }

    public static NsIdentificationName of( AgNSIdentification identification, String name ) {
        return of( NsIdentification.of( identification ), name );
    }

    public static NsIdentificationName of( String namespace, String name ) {
        return of( NsIdentification.of( namespace ), name );
    }

    @Override
    public String toString() {
        return nsIdentification.toString() + " - " + name;
    }

}
