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

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSIdentification;

/*
 * A name in a namespace, used as a key in maps
 */
public class NsIdentificationName extends NsIdentification {
    
    final private String name;

    public NsIdentificationName( String name, String id, Integer version, String revision, Integer release ) {
        super( id, version, revision, release );
        this.name = name;
    }
    
    public NsIdentificationName( String name, AgNSIdentification identification ) {
        super( identification );
        this.name = name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ( ( name == null ) ? 0 : name.hashCode() );
        return result;
    }

    @Override
    public boolean equals( Object obj ) {
        if( this == obj ) return true;
        if( !super.equals( obj ) ) return false;
        if( getClass() != obj.getClass() ) return false;
        NsIdentificationName other = ( NsIdentificationName ) obj;
        if( name == null ) {
            if( other.name != null ) return false;
        }
        else if( !name.equals( other.name ) ) return false;
        return true;
    }

    
}
