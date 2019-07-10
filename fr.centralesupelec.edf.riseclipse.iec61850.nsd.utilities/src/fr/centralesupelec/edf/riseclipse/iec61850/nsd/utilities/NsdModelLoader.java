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
package fr.centralesupelec.edf.riseclipse.iec61850.nsd.utilities;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.resource.Resource;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.util.NsdResourceFactoryImpl;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.util.NsdResourceSetImpl;
import fr.centralesupelec.edf.riseclipse.util.AbstractRiseClipseConsole;
import fr.centralesupelec.edf.riseclipse.util.AbstractRiseClipseModelLoader;

public class NsdModelLoader extends AbstractRiseClipseModelLoader {

    public NsdModelLoader() {
        reset();
    }

//    @Override
    public void reset() {
        super.reset( new NsdResourceSetImpl( false ));

        // Register the appropriate resource factory to handle all file
        // extensions.
        getResourceSet().getResourceFactoryRegistry().getExtensionToFactoryMap()
                .put( Resource.Factory.Registry.DEFAULT_EXTENSION, new NsdResourceFactoryImpl() );

        // Register the package to ensure it is available during loading.
        getResourceSet().getPackageRegistry().put( NsdPackage.eNS_URI, NsdPackage.eINSTANCE );
    }

    @Override
    public NsdResourceSetImpl getResourceSet() {
        return ( NsdResourceSetImpl ) super.getResourceSet();
    }

    public Resource loadWithoutValidation( String name ) {
        Object eValidator = EValidator.Registry.INSTANCE.remove( NsdPackage.eINSTANCE );

        Resource resource = load( name, AbstractRiseClipseConsole.getConsole() );

        if( eValidator != null ) {
            EValidator.Registry.INSTANCE.put( NsdPackage.eINSTANCE, eValidator );
        }
        return resource;
    }

}
