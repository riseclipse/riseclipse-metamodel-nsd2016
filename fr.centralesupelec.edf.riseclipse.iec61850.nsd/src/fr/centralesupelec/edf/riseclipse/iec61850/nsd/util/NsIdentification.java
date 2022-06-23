/*
*************************************************************************
**  Copyright (c) 2016-2022 CentraleSupélec & EDF.
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
package fr.centralesupelec.edf.riseclipse.iec61850.nsd.util;

import java.util.HashMap;

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSIdentification;

public class NsIdentification {
    
    public final static String  DEFAULT_REVISION = "A";
    public final static Integer DEFAULT_RELEASE  = 1;
    
    private final String id;
    private final Integer version;
    private final String revision;
    private final Integer release;
    
    private NsIdentification dependsOn;
    
    private static HashMap< String, HashMap< Integer, HashMap< String, NsIdentification >>> nsIdentifications = new HashMap<>();
    
    public static NsIdentification of( String id, Integer version, String revision, Integer release ) {
        if( ! nsIdentifications.containsKey( id )) {
            nsIdentifications.put( id, new HashMap<>() );
        }
        if( ! nsIdentifications.get( id ).containsKey( version )) {
            nsIdentifications.get( id ).put( version, new HashMap<>() );
        }
        if( ! nsIdentifications.get( id ).get( version ).containsKey( revision )) {
            nsIdentifications.get( id ).get( version ).put( revision, new NsIdentification( id, version, revision, release ));
        }
        return nsIdentifications.get( id ).get( version ).get( revision );
    }
    
    private NsIdentification( String id, Integer version, String revision, Integer release ) {
        this.id = id;
        this.version = version;
        this.revision = revision;
        this.release = release;
    }
    
    public static NsIdentification of( String namespace ) {
        String id = namespace;
        Integer version = 0;
        String revision = DEFAULT_REVISION;
        Integer release = DEFAULT_RELEASE;
        int posColon = namespace.lastIndexOf( ":" );
        if( posColon != -1 ) {
            id = namespace.substring( 0, posColon );
            try {
                version = Integer.valueOf( namespace.substring( posColon + 1, posColon + 5 ));
            }
            catch( NumberFormatException ex ) {}
            revision = ( namespace.length() > ( posColon + 5 )) ? namespace.substring( posColon + 5, posColon + 6 ) : DEFAULT_REVISION;
            try {
                release = ( namespace.length() > ( posColon + 6 )) ? Integer.valueOf( namespace.substring( posColon + 6 )) : DEFAULT_RELEASE;
            }
            catch( NumberFormatException ex ) {}
        }
        return of( id, version, revision, release );
    }
    
    public static NsIdentification of( AgNSIdentification identification ) {
        return of( identification.getId(), identification.getVersion(), identification.getRevision(), identification.getRelease() );
    }

    public String getId() {
        return id;
    }

    public Integer getVersion() {
        return version;
    }

    public String getRevision() {
        return revision;
    }

    public Integer getRelease() {
        return release;
    }
    
    public NsIdentification getDependsOn() {
        return dependsOn;
    }

    public void setDependsOn( NsIdentification dependsOn ) {
        this.dependsOn = dependsOn;
    }

    @Override
    public String toString() {
        return id + ":" + version + revision;
    }

}

