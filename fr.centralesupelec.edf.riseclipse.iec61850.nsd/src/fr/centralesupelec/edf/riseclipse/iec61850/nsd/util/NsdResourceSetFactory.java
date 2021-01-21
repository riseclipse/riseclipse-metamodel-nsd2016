/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
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
**      http://wdi.supelec.fr/software/RiseClipse/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.iec61850.nsd.util;

import fr.centralesupelec.edf.riseclipse.util.IRiseClipseResourceSet;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseResourceSetFactory;

public class NsdResourceSetFactory implements IRiseClipseResourceSetFactory {

    /* (non-Javadoc)
     * @see fr.centralesupelec.edf.riseclipse.util.IRiseClipseResourceSetFactory#createResourceSet()
     */
    @Override
    public IRiseClipseResourceSet createResourceSet( boolean strictContent ) {
        return new NsdResourceSetImpl( strictContent );
    }

}
