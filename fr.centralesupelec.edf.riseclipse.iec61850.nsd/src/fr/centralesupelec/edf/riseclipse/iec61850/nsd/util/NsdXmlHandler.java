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

import java.util.Map;
import java.util.Stack;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.SAXXMLHandler;

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdObject;
import fr.centralesupelec.edf.riseclipse.util.AbstractRiseClipseConsole;

public class NsdXmlHandler extends SAXXMLHandler {

    private static final String XML_HANDLER_CATEGORY = "NSD/XMLHandler";

    private Stack< Integer > lineNumbers;

    public NsdXmlHandler( XMLResource xmiResource, XMLHelper helper, Map< ?, ? > options ) {
        super( xmiResource, helper, options );
        lineNumbers = new Stack< Integer >();
    }

    @Override
    public void startElement( String uri, String localName, String name ) {
        lineNumbers.push( this.locator.getLineNumber() );
        super.startElement( uri, localName, name );
    }

    @Override
    protected void reportUnknownFeature( String prefix, String name, boolean isElement, EObject peekObject,
            String value ) {
        AbstractRiseClipseConsole.getConsole().warning(
            XML_HANDLER_CATEGORY, getLocation().substring( getLocation().lastIndexOf( '/' ) + 1 ), getLineNumber(),
            "The ", ( isElement ? "element " : "attribute " ), name, " is unknown and ignored" );
    }

    @Override
    protected void processObject( EObject object ) {
        if( lineNumbers.empty() ) {
            AbstractRiseClipseConsole.getConsole().warning(
                XML_HANDLER_CATEGORY, 0, "linenumber stack empty !" );
        }
        else {
            int lineNumber = lineNumbers.peek();
            if( object instanceof NsdObject ) {
                (( NsdObject ) object ).setLineNumber( lineNumber );
                (( NsdObject ) object ).setFilename( getLocation().substring( getLocation().lastIndexOf( '/' ) + 1 ));
            }
        }
        // TODO: error message
        super.processObject( object );
    }
    
    @Override
    public void endElement( String uri, String localName, String name ) {
        if( lineNumbers.empty() ) {
            AbstractRiseClipseConsole.getConsole().warning(
                XML_HANDLER_CATEGORY, 0, "linenumber stack empty !" );
        }
        else {
            lineNumbers.pop();
        }
        
        super.endElement( uri, localName, name );
    }

    @Override
    public void endDocument() {
        super.endDocument();
        
        if( ! lineNumbers.empty() ) {
            AbstractRiseClipseConsole.getConsole().warning(
                XML_HANDLER_CATEGORY, 0, "linenumber stack not empty !" );
            while( ! lineNumbers.empty() ) {
                AbstractRiseClipseConsole.getConsole().warning(
                    XML_HANDLER_CATEGORY, lineNumbers.pop(), "" );
            }
        }
    }

}
