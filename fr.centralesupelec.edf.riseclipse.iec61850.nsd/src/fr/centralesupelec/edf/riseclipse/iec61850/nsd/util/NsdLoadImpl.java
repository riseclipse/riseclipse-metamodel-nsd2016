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

import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.xml.sax.helpers.DefaultHandler;

import fr.centralesupelec.edf.riseclipse.util.AbstractRiseClipseXMLLoadImpl;

public class NsdLoadImpl extends AbstractRiseClipseXMLLoadImpl {

    public NsdLoadImpl( XMLHelper helper ) {
        super( helper );
    }

    public DefaultHandler makeDefaultHandler() {
        return new NsdXmlHandler( resource, helper, options );
    }

}
