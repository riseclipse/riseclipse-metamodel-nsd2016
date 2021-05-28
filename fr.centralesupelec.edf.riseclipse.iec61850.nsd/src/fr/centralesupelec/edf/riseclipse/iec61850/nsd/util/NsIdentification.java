/*
*************************************************************************
**  Copyright (c) 2019-2021 CentraleSupélec & EDF.
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

import java.util.Objects;

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSIdentification;

public class NsIdentification {
    
    public final static String IEC_61950_7_2_CORE_NAMESPACE_ID = "IEC 61850-7-2";
    public final static String IEC_61950_7_3_CORE_NAMESPACE_ID = "IEC 61850-7-3";
    public final static String IEC_61950_7_4_CORE_NAMESPACE_ID = "IEC 61850-7-4";
    
    final private String id;
    final private Integer version;
    final private String revision;
    final private Integer release;

    public NsIdentification( String id, Integer version, String revision, Integer release ) {
        this.id = id;
        this.version = version;
        this.revision = revision;
        this.release = release;
    }
    
    public NsIdentification( String namespace ) {
        int posColon = namespace.lastIndexOf( ":" );
        if( posColon != -1 ) {
            this.id = namespace.substring( 0, posColon );
            Integer tmpVersion = null;
            try {
                tmpVersion = Integer.valueOf( namespace.substring( posColon + 1, posColon + 5 ));
            }
            catch( NumberFormatException ex ) {}
            this.version = tmpVersion;
            this.revision = ( namespace.length() > ( posColon + 5 )) ? namespace.substring( posColon + 5, posColon + 6 ) : "A";
            Integer tmpRelease = 1;
            try {
                tmpRelease = ( namespace.length() > ( posColon + 6 )) ? Integer.valueOf( namespace.substring( posColon + 6 )) : 1;
            }
            catch( NumberFormatException ex ) {}
            this.release = tmpRelease;
        }
        else {
            // TODO: is it an error that must be displayed ?
            this.id = namespace;
            this.version = 0;
            this.revision = "A";
            this.release = 1;
        }
    }
    
    public NsIdentification( AgNSIdentification identification ) {
        this.id = identification.getId();
        this.version = identification.getVersion();
        this.revision = identification.getRevision();
        this.release = identification.getRelease();
    }

    public NsIdentification( NsIdentification identification ) {
        this.id = identification.id;
        this.version = identification.version;
        this.revision = identification.revision;
        this.release = identification.release;
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
    
    public boolean isCoreNamespace() {
        return IEC_61950_7_2_CORE_NAMESPACE_ID.equals( id )
            || IEC_61950_7_3_CORE_NAMESPACE_ID.equals( id )
            || IEC_61950_7_4_CORE_NAMESPACE_ID.equals( id );
    }

    @Override
    public int hashCode() {
        return Objects.hash( id, release, revision, version );
    }

    @Override
    public boolean equals( Object obj ) {
        if( this == obj ) return true;
        if( obj == null ) return false;
        if( getClass() != obj.getClass() ) return false;
        NsIdentification other = ( NsIdentification ) obj;
        return Objects.equals( id, other.id ) && Objects.equals( release, other.release )
                && Objects.equals( revision, other.revision ) && Objects.equals( version, other.version );
    }

    @Override
    public String toString() {
        return id + ":" + version + revision + ( release == 1 ? "" : release );
    }

}

