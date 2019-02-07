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

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentRoot;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS;
import fr.centralesupelec.edf.riseclipse.util.AbstractRiseClipseConsole;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;


public class NsdResourceSetImpl extends ResourceSetImpl {
    
    private Map< String, NS > nsdResources;

    public NsdResourceSetImpl() {
        super();
        
        nsdResources = new HashMap< String, NS >();
    }

    @Override
    protected void demandLoad( Resource resource ) throws IOException {
        super.demandLoad( resource );
        
        if( ! ( resource instanceof NsdResourceImpl )) {
            AbstractRiseClipseConsole.getConsole().error( "The file " + resource.getURI() + " is not an NSD file" );
            this.getResources().remove( resource );
            return;
        }
        if( ! ( resource.getContents().get( 0 ) instanceof DocumentRoot )) {
            AbstractRiseClipseConsole.getConsole().error( "The file " + resource.getURI() + " is not an NSD file" );
            this.getResources().remove( resource );
            return;
        }
        DocumentRoot root = (DocumentRoot) resource.getContents().get( 0 );
        if( ! ( root.getNS() instanceof NS )) {
            AbstractRiseClipseConsole.getConsole().error( "The file " + resource.getURI() + " is not an NSD file" );
            this.getResources().remove( resource );
            return;
        }
        NS ns = ( NS ) root.getNS();
        if( nsdResources.get( ns.getId() ) != null ) {
            AbstractRiseClipseConsole.getConsole().error( "There is already an NSD file with is " + ns.getId() + ", " + resource.getURI() + "is ignored" );
            this.getResources().remove( resource );
            return;
        }
        nsdResources.put( ns.getId(), ns );
    }

    /*
     * Constraints
     *   NSDoc:
     *     Name: uniqueDocID                           Selector: nsd:Doc                           Field: @id
     *     Within an NSDoc element, there shall not be two Doc sub-elements with same id.
     *   CDCs/CDC:
     *     Name: uniqueCDCChild                        Selector: *                                 Field: @name
     *     For a CDC, there shall not be two sub-elements (SubDataObject or DataAttribute) with same name.
     *   ConstructedAttributes/ConstructedAttribute:
     *     Name: uniqueSubDataAttribute                Selector: nsd:SubDataAttribute              Field: @name
     *     For a ConstructedAttribute, there shall not be two SubDataAttribute sub-elements with same name.
     *   Enumerations/Enumeration:
     *     Name: uniqueLiteralName                     Selector: nsd:Literal                       Field: @name
     *     For an Enumeration, there shall not be two Literal sub-elements with same name.
     *   Enumerations/Enumeration:
     *     Name: uniqueLiteralVal                      Selector: nsd:Literal                       Field: @literalVal
     *     For an Enumeration, there shall not be two Literal sub-elements with same liiteralVal.
     *   FunctionalConstraint/ApplicableServices:
     *     Name: uniqueDataSetMemberOf                 Selector: nsd:DataSetMemberOf               Field: @cb
     *   FunctionalConstraint/ApplicableServices:
     *     Name: uniqueService                         Selector: nsd:Service                       Field: @name
     *   LNClasses/AbstractLNClass:
     *     Name: uniqueDataObjectAbstractLNClass       Selector: nsd:DataObject                    Field: @name
     *     For a AbstractLNClass, there shall not be two DataObject sub-elements with same name.
     *   LNClasses/LNClass:
     *     Name: uniqueDataObject                      Selector: nsd:DataObject                    Field: @name
     *     For a LNClass, there shall not be two DataObject sub-elements with same name.
     *   NS/FunctionalConstraints:
     *     Name: uniqueFunctionalConstraint            Selector: nsd:FunctionalConstraint          Field: @abbreviation
     *     There shall not be two FunctionalConstraint elements with same abbreviation.
     *   NS/PresenceConditions:
     *     Name: uniquePresenceCondition               Selector: nsd:PresenceCondition             Field: @name
     *     There shall not be two PresenceCondition elements with same name.
     *   NS/Abbreviations:
     *     Name: uniqueAbbreviation                    Selector: nsd:Abbreviation                  Field: @name
     *     There shall not be two Abbreviations elements with same name.
     *   NS/Enumerations:
     *     Name: uniqueEnumeration                     Selector: nsd:Enumeration                   Field: @name
     *     Within an NS, there shall not be two Enumeration sub-elements with same name.
     *   NS/ConstructedAttributes
     *     Name: uniqueConstructedAttribute            Selector: nsd:ConstructedAttribute          Field: @name
     *     Within an NS, there shall not be two ConstructedAttribute sub-elements with same name.
     *   NS/CDCs:
     *     Name: uniqueCDC                             Selector: nsd:CDC                           Field: @name @variant
     *     Within an NS, there shall not be two CDC sub-elements with same name and (if defined) variant.
     *   NS/LNClasses:
     *     Name: uniqueAbstractLNClass                 Selector: nsd:AbstractLNClass               Field: @name
     *     Within an NS, there shall not be two AbstractLNClass sub-elements with same name.
     *     Name: uniqueLNClass              Selector: nsd:LNClass        Field: @name
     *     Within an NS, there shall not be two LNClass sub-elements with same name.
     *   ServiceCDCs/ServiceCDC:
     *     Name: uniqueServiceCDCChild                 Selector: nsd:ServiceDataAttribute          Field: @name
     *     For a CDC, there shall not be two ServiceDataAttribute sub-elements with same name.
     *   ServiceConstructedAttributes/ServiceConstructedAttribute:
     *     Name: uniqueSubDataAttribute_Service     Selector: nsd:SubDataAttribute                 Field: @name
     *     For a ConstructedAttribute, there shall not be two SubDataAttribute sub-elements with same name.
     *   ServiceNS/FunctionalConstraints:
     *     Name: uniqueFunctionalConstraint_Service    Selector: nsd:FunctionalConstraint          Field: @abbreviation
     *     There shall not be two FunctionalConstraint elements with same abbreviation.
     *   ServiceNS/PresenceConditions:
     *     Name: uniquePresenceCondition_Service       Selector: nsd:PresenceCondition             Field: @name
     *     There shall not be two PresenceCondition elements with same name.
     *   ServiceNS/Abbreviations:
     *     Name: uniqueAbbreviation_Service            Selector: nsd:Abbreviation                  Field: @name
     *     There shall not be two Abbreviations elements with same name.
     *   ServiceNS/ServiceConstructedAttributes:
     *     Name: uniqueServiceConstructedAttribute     Selector: nsd:ServiceConstructedAttribute   Field: @name
     *     Within an ServiceNS, there shall not be two ServiceConstructedAttribute sub-elements with same name.
     *   ServiceNS/ServiceCDCs:
     *     Name: uniqueServiceCDC                      Selector: nsd:ServiceCDC                    Field: @cdc @variant
     *     Within an ServiceNS, there shall not be two ServiceCDC sub-elements with same name and (if defined) variant.
     *   
     *   
     * The following links are implicit:
     *   DependsOn.id                       -> NS.id                                DONE
     *   AnyLNClass.base                    -> AbstractLNClass                      DONE
     *   DataObject.type                    -> CDC.name
     *   DataObject.presCond                -> PresenceCondition.name
     *   DataObject.dsPresCond              -> PresenceCondition.name
     *   SubDataObject.type                 -> CDC.name
     *   SubDataObject.presCond             -> PresenceCondition.name
     *   SubDataObject.sizeAttribute        -> DataAttribute.name
     *   SubDataObject.maxIndexAttribute    -> DataAttribute.name
     *   DataAttribute.fc                   -> FunctionalConstraint.abbreviation
     *   DataAttribute.presCond             -> PresenceCondition.name
     *   DataAttribute.sizeAttribute        -> DataAttribute.name
     *   DataAttribute.maxIndexAttribute    -> DataAttribute.name
     *   ServiceParameter.name              -> DataAttribute.name                   ?
     *   SubDataAttribute.presCond          -> PresenceCondition.name
     *   SubDataAttribute.sizeAttribute     -> DataAttribute.name
     *   SubDataAttribute.maxIndexAttribute -> DataAttribute.name
     *   Enumeration.inheritedFrom          -> Enumeration.name
     *   ServiceCDC.cdc                     -> CDC.name                             ?
     *   ServiceDataAttribute.fc            -> FunctionalConstraint.abbreviation
     *   ServiceDataAttribute.presCond      -> PresenceCondition.name
     *   AppliesTo.id                       -> NS.id
     *   ServiceTypeRealization.fc          -> FunctionalConstraint.abbreviation    ? ServiceTypeRealization is not a name of a type but a name of a refence
     *   ServiceTypeRealization.presCond    -> PresenceCondition.name               ? idem
     */
    public void buildExplicitLinks( IRiseClipseConsole console ) {
        for( Resource resource : getResources() ) {
            DocumentRoot root = (DocumentRoot) resource.getContents().get( 0 );
            NS ns = ( NS ) root.getNS();
            ns.buildExplicitLinks( console );
        }
        
    }

    public NS getNS( String id ) {
        return nsdResources.get( id );
    }

}
