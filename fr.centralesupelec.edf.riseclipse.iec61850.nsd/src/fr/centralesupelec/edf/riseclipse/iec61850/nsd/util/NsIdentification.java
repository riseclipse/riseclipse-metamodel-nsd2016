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
package fr.centralesupelec.edf.riseclipse.iec61850.nsd.util;

import java.util.Objects;

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSIdentification;

public class NsIdentification {
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
        int posColon = namespace.indexOf( ":" );
        if( posColon != -1 ) {
            this.id = namespace.substring( 0, posColon );
            this.version = Integer.valueOf( namespace.substring( posColon + 1, posColon + 5 ));
            this.revision = ( namespace.length() > ( posColon + 5 )) ? namespace.substring( posColon + 5 ) : "A";
        }
        else {
            this.id = namespace;
            this.version = null;
            this.revision = null;
        }
        this.release = 1;
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

    @Override
    public int hashCode() {
//        return Objects.hash( id, release, revision, version );
        return Objects.hash( id, revision, version );
    }

    @Override
    public boolean equals( Object obj ) {
        if( this == obj ) return true;
        if( obj == null ) return false;
        if( getClass() != obj.getClass() ) return false;
        NsIdentification other = ( NsIdentification ) obj;
//        return Objects.equals( id, other.id ) && Objects.equals( release, other.release )
//                && Objects.equals( revision, other.revision ) && Objects.equals( version, other.version );
        return Objects.equals( id, other.id )
            && Objects.equals( revision, other.revision )
            && Objects.equals( version, other.version );
    }

    @Override
    public String toString() {
        return "NsIdentification [id=" + id + ", version=" + version + ", revision=" + revision + ", release=" + release + "]";
    }

}

