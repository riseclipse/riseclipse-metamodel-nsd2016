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
package fr.centralesupelec.edf.riseclipse.iec61850.nsd.util;

import java.util.Objects;

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSIdentification;

public class NsIdentification {
    private String id;
    private Integer version;
    private String revision;
    private Integer release;

    public NsIdentification( String id, Integer version, String revision, Integer release ) {
        super();
        this.id = id;
        this.version = version;
        this.revision = revision;
        this.release = release;
    }
    
    public NsIdentification( AgNSIdentification identification ) {
        super();
        this.id = identification.getId();
        this.version = identification.getVersion();
        this.revision = identification.getRevision();
        this.release = identification.getRelease();
    }

    @Override
    public int hashCode() {
        // Only id and version are required, revision and release are optional
        return Objects.hash( id, version );
    }

    @Override
    public boolean equals( Object obj ) {
        if( this == obj ) return true;
        if( obj == null ) return false;
        if( getClass() != obj.getClass() ) return false;
        NsIdentification other = ( NsIdentification ) obj;
        return Objects.equals( id, other.id ) && Objects.equals( version, other.version );
    }

    @Override
    public String toString() {
        return "NsIdentification [" + ( id != null ? "id=" + id + ", " : "" )
                + ( version != null ? "version=" + version + ", " : "" )
                + ( revision != null ? "revision=" + revision + ", " : "" )
                + ( release != null ? "release=" + release : "" ) + "]";
    }

}

