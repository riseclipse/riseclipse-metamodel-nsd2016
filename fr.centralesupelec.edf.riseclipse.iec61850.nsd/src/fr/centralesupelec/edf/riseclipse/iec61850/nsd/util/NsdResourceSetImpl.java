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

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviation;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviations;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgAttributeType;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServiceNS;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AppliesToType;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicType;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicTypes;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDCs;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttribute;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttributes;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentRoot;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumerations;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraints;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClass;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClasses;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceConditions;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDC;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNsUsage;
import fr.centralesupelec.edf.riseclipse.util.AbstractRiseClipseConsole;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;
import fr.centralesupelec.edf.riseclipse.util.RiseClipseMetamodel;
import fr.centralesupelec.edf.riseclipse.util.AbstractRiseClipseResourceSet;


public class NsdResourceSetImpl extends AbstractRiseClipseResourceSet {
    
    private Map< NsIdentification, NS > nsdResources = new HashMap<>();
    private Map< NsIdentification, ServiceNS > serviceNSResources = new HashMap<>();
    private Map< NsIdentification, NSDoc > nsdocResources = new HashMap<>();
    private NsdResourceFactoryImpl resourceFactory = new NsdResourceFactoryImpl();
    private ApplicableServiceNS appNS =  null;
    private Map< NsIdentification, List< ServiceNS > > nsdAdditions = new HashMap<>();
    private Map< NsIdentification, NsIdentification > equivalentNamespaces = new HashMap<>();

    public NsdResourceSetImpl( boolean strictContent ) {
        super( strictContent );
        
        setEquivalentNamespace(
                new NsIdentification( "IEC 61850-7-2", 2007, "B", 1 ), 
                new NsIdentification( "IEC 61850-7-3", 2007, "B", 1 )
        );
        setEquivalentNamespace(
                new NsIdentification( "IEC 61850-7-3", 2007, "B", 1 ), 
                new NsIdentification( "IEC 61850-7-4", 2007, "B", 1 )
        );
    }

    @Override
    protected NsdResourceImpl createRiseClipseResource( URI uri, String contentType ) {
        Optional< String > metamodel = RiseClipseMetamodel.findMetamodelFor( uri );
        if( metamodel.isPresent() && NsdPackage.eNS_URI.equals( metamodel.get() )) {
            return resourceFactory.createResource( uri );
        }
        return null;
    }

    @Override
    protected void demandLoad( Resource resource ) throws IOException {
        super.demandLoad( resource );
        
        if( ! ( resource instanceof NsdResourceImpl )) {
            // if strictContent is false, another king of resource is allowed.
            // We just ignore it.
            return;
        }
        if( ! ( resource.getContents().get( 0 ) instanceof DocumentRoot )) {
            AbstractRiseClipseConsole.getConsole().error( "The file " + resource.getURI() + " is not an NSD file" );
            this.getResources().remove( resource );
            return;
        }
        DocumentRoot root = (DocumentRoot) resource.getContents().get( 0 );
        
        if( root.getNS() != null ) {
            NsIdentification id = new NsIdentification( root.getNS() );
            if( nsdResources.get( id ) != null ) {
                AbstractRiseClipseConsole.getConsole().error( "There is already an NSD file with NsIdentification " + id + ", " + resource.getURI() + " is ignored" );
                this.getResources().remove( resource );
                return;
            }
            nsdResources.put( id, root.getNS() );
            return;
        }
        
        if( root.getServiceNS() != null ) {
            NsIdentification id = new NsIdentification( root.getServiceNS() );
            if( serviceNSResources.get( id ) != null ) {
                AbstractRiseClipseConsole.getConsole().error( "There is already an NSD file with NsIdentification " + id + ", " + resource.getURI() + " is ignored" );
                this.getResources().remove( resource );
                return;
            }
            serviceNSResources.put( id, root.getServiceNS() );
            return;
        }
        
        if( root.getApplicableServiceNS() != null ) {
            if( appNS != null ) {
                AbstractRiseClipseConsole.getConsole().error( "There is already an ApplicableServiceNS file, " + resource.getURI() + " is ignored" );
                this.getResources().remove( resource );
                return;
            }
            appNS = root.getApplicableServiceNS();
            return;
        }
        
        if( root.getNSDoc() != null ) {
            NSDoc nsdoc = ( NSDoc ) root.getNSDoc();
            NsIdentification id = new NsIdentification( nsdoc );
            if( nsdocResources.get( id ) != null ) {
                AbstractRiseClipseConsole.getConsole().error( "There is already an NSDoc file with NsIdentification " + id + ", " + resource.getURI() + " is ignored" );
                this.getResources().remove( resource );
                return;
            }
            nsdocResources.put( id, nsdoc );
            return;
        }
        
        AbstractRiseClipseConsole.getConsole().error( "The file " + resource.getURI() + " is not an NSD file" );
        this.getResources().remove( resource );
        return;
    }
    
    /* (non-Javadoc)
     * @see fr.centralesupelec.edf.riseclipse.util.AbstractRiseClipseResourceSet#finalizeLoad(fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole)
     */
    @Override
    public void finalizeLoad( IRiseClipseConsole console ) {
        if( appNS != null ) {
            for( ServiceNsUsage serviceNsUsage : appNS.getServiceNsUsage() ) {
                NsIdentification serviceNsId = new NsIdentification( serviceNsUsage );
                if( serviceNSResources.get( serviceNsId ) != null ) {
                    for( AppliesToType applyTo : serviceNsUsage.getAppliesTo() ) {
                        NsIdentification nsId = new NsIdentification( applyTo );
                        nsId = getRootNsIdentification( nsId );
                        if( nsdResources.get( nsId ) != null ) {
                            if( nsdAdditions.get( nsId ) == null ) {
                                nsdAdditions.put( nsId, new ArrayList<>() );
                            }
                            nsdAdditions.get( nsId ).add( serviceNSResources.get( serviceNsId ));
                            applyServiceNs( serviceNSResources.get( serviceNsId ), nsdResources.get( nsId ), nsId, console );
                        }
                    }
                }
            }
        }
        
        buildExplicitLinks( console );
        
    }

    private void applyServiceNs( ServiceNS serviceNS, NS ns, NsIdentification nsIdentification, IRiseClipseConsole console ) {
        // A ServiceTypeRealization gives a new definition to an existing (only basic ? never constructed ?) type
        for( ConstructedAttribute typeRealization : serviceNS.getServiceTypeRealizations().getServiceTypeRealization() ) {
            BasicType basic = findBasicType( typeRealization.getName(), nsIdentification, console );
            if( basic != null ) {
                // Avoid ConcurrentModificationException
                List< AgAttributeType > atts = basic
                        .getReferredByAttributeType()
                        .stream()
                        .collect( Collectors.toList() );
               for( AgAttributeType att : atts ) {
                    att.unsetRefersToBasicType();
                    console.info( "Service NS: using TypeRealization " + basic.getName() + " to attribute " + att.getType() );
                    att.setRefersToConstructedAttribute( typeRealization );
                }
                continue;
            }
            // TODO: warning
        }
        
        // A ServiceConstructedAttribute defines new ConstructedAttribute:
        // they are taken into account in getConstructedAttributeStream()
        
        // A ServiceCDC add new attribute to an existing CDC
        for( ServiceCDC serviceCDC : serviceNS.getServiceCDCs().getServiceCDC() ) {
            CDC cdc = findCDC( serviceCDC.getCdc(), nsIdentification, console );
            if( cdc != null ) {
                serviceCDC
                .getServiceDataAttribute()
                .stream()
                .forEach( att -> {
                    DataAttribute da = att.toDataAttribute();
                    console.info( "Service NS: Adding DataAttribute " + da.getName() + " to CDC " + cdc.getName() );
                    da.setParentCDC( cdc );
                });
            }
                    
        }
        
    }

    /*
     * The following links are implicit:
     * 
     *   DependsOn.id                       -> NS.id                                DONE
     *   AnyLNClass.base                    -> AbstractLNClass                      DONE
     *   DataObject.type                    -> CDC.name                             DONE
     *   DataObject.presCond                -> PresenceCondition.name               DONE
     *   DataObject.dsPresCond              -> PresenceCondition.name               DONE
     *   SubDataObject.type                 -> CDC.name                             DONE
     *   SubDataObject.presCond             -> PresenceCondition.name               DONE
     *   SubDataObject.sizeAttribute        -> DataAttribute.name                   DONE
     *   SubDataObject.maxIndexAttribute    -> DataAttribute.name                   DONE
     *   DataAttribute.fc                   -> FunctionalConstraint.abbreviation    DONE
     *   DataAttribute.presCond             -> PresenceCondition.name               DONE
     *   DataAttribute.sizeAttribute        -> DataAttribute.name                   DONE
     *   DataAttribute.maxIndexAttribute    -> DataAttribute.name                   DONE
     *   ServiceParameter.name              -> DataAttribute.name                   ? Name of the data attribute but may be not name of a DataAttribute ?
     *   SubDataAttribute.presCond          -> PresenceCondition.name               DONE
     *   SubDataAttribute.sizeAttribute     -> DataAttribute.name                   ? Which DataAttribute ?
     *   SubDataAttribute.maxIndexAttribute -> DataAttribute.name                   ? Which DataAttribute ?
     *   Enumeration.inheritedFrom          -> Enumeration.name                     DONE
     *   ServiceCDC.cdc                     -> CDC.name                             ? not sure and in ServiceNS file
     *   ServiceCDC.ServiceDataAttribute    -> DataAttribute.name                   ? not sure and in ServiceNS file
     *   ServiceDataAttribute.fc            -> FunctionalConstraint.abbreviation    ? in ServiceNS file
     *   ServiceDataAttribute.presCond      -> PresenceCondition.name               ? in ServiceNS file
     *   AppliesTo.id                       -> NS.id                                ? in ServiceNS file
     *   ServiceTypeRealization.fc          -> FunctionalConstraint.abbreviation    ? ServiceTypeRealization is not a name of a type but a name of a reference
     *   ServiceTypeRealization.presCond    -> PresenceCondition.name               ? ServiceTypeRealization is not a name of a type but a name of a reference
     *   
     */
    private void buildExplicitLinks( IRiseClipseConsole console ) {
        for( Resource resource : getResources() ) {
            if(( resource instanceof NsdResourceImpl ) && ( ! resource.getContents().isEmpty() )) {
                DocumentRoot root = (DocumentRoot) resource.getContents().get( 0 );
                if( root.getNS() != null ) {
                    root.getNS().buildExplicitLinks( console, true );
                }
                if( root.getServiceNS() != null ) {
                    root.getServiceNS().buildExplicitLinks( console, true );
                }
            }
        }
        
    }
    
    public void setEquivalentNamespace( NsIdentification source, NsIdentification destination ) {
        equivalentNamespaces.put( source, destination );
    }
    
    public NsIdentification getRootNsIdentification( NsIdentification id ) {
        // TODO: check conformance with DependsOn
        while( equivalentNamespaces.containsKey( id )) {
            id = equivalentNamespaces.get( id );
        }
        return id;
    }

    public NS getNS( NsIdentification id ) {
        return nsdResources.get( id );
   }

    /*
     * Constraints : when DONE, as OCLinEcore in nsd.ecore
     * 
     *   NSDoc:
     *     Name: uniqueDocID                           Selector: nsd:Doc                           Field: @id
     *     Within an NSDoc element, there shall not be two Doc sub-elements with same id.
     *     
     *   CDCs/CDC:
     *     Name: uniqueCDCChild                        Selector: *                                 Field: @name
     *     For a CDC, there shall not be two sub-elements (SubDataObject or DataAttribute) with same name.
     *   DONE
     *     
     *   ConstructedAttributes/ConstructedAttribute:
     *     Name: uniqueSubDataAttribute                Selector: nsd:SubDataAttribute              Field: @name
     *     For a ConstructedAttribute, there shall not be two SubDataAttribute sub-elements with same name.
     *   DONE
     *     
     *   Enumerations/Enumeration:
     *     Name: uniqueLiteralName                     Selector: nsd:Literal                       Field: @name
     *     For an Enumeration, there shall not be two Literal sub-elements with same name.
     *   DONE
     *     
     *   Enumerations/Enumeration:
     *     Name: uniqueLiteralVal                      Selector: nsd:Literal                       Field: @literalVal
     *     For an Enumeration, there shall not be two Literal sub-elements with same literalVal.
     *   DONE
     *     
     *   FunctionalConstraint/ApplicableServices:
     *     Name: uniqueDataSetMemberOf                 Selector: nsd:DataSetMemberOf               Field: @cb
     *   DONE
     *     
     *   FunctionalConstraint/ApplicableServices:
     *     Name: uniqueService                         Selector: nsd:Service                       Field: @name
     *   DONE
     *     
     *   LNClasses/AbstractLNClass:
     *     Name: uniqueDataObjectAbstractLNClass       Selector: nsd:DataObject                    Field: @name
     *     For a AbstractLNClass, there shall not be two DataObject sub-elements with same name.
     *   DONE
     *     
     *   LNClasses/LNClass:
     *     Name: uniqueDataObject                      Selector: nsd:DataObject                    Field: @name
     *     For a LNClass, there shall not be two DataObject sub-elements with same name.
     *   DONE
     *     
     *   NS/FunctionalConstraints:
     *     Name: uniqueFunctionalConstraint            Selector: nsd:FunctionalConstraint          Field: @abbreviation
     *     There shall not be two FunctionalConstraint elements with same abbreviation.
     *   DONE
     *     
     *   NS/PresenceConditions:
     *     Name: uniquePresenceCondition               Selector: nsd:PresenceCondition             Field: @name
     *     There shall not be two PresenceCondition elements with same name.
     *   DONE
     *     
     *   NS/Abbreviations:
     *     Name: uniqueAbbreviation                    Selector: nsd:Abbreviation                  Field: @name
     *     There shall not be two Abbreviations elements with same name.
     *   DONE
     *     
     *   NS/Enumerations:
     *     Name: uniqueEnumeration                     Selector: nsd:Enumeration                   Field: @name
     *     Within an NS, there shall not be two Enumeration sub-elements with same name.
     *   DONE
     *     
     *   NS/ConstructedAttributes
     *     Name: uniqueConstructedAttribute            Selector: nsd:ConstructedAttribute          Field: @name
     *     Within an NS, there shall not be two ConstructedAttribute sub-elements with same name.
     *   DONE
     *     
     *   NS/CDCs:
     *     Name: uniqueCDC                             Selector: nsd:CDC                           Field: @name @variant
     *     Within an NS, there shall not be two CDC sub-elements with same name and (if defined) variant.
     *   DONE
     *     
     *   NS/LNClasses:
     *     Name: uniqueAbstractLNClass                 Selector: nsd:AbstractLNClass               Field: @name
     *     Within an NS, there shall not be two AbstractLNClass sub-elements with same name.
     *     Name: uniqueLNClass              Selector: nsd:LNClass        Field: @name
     *     Within an NS, there shall not be two LNClass sub-elements with same name.
     *   DONE
     *     
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
     */
    
    public Stream< LNClass > getAllLNClassStream() {
        Stream< LNClass > lnClassStream = Stream.empty();
        Iterator< NS > it = nsdResources.values().iterator();
        while( it.hasNext() ) {
            LNClasses lnClasses = it.next().getLNClasses();
            if( lnClasses != null ) {
                // Warning: Resource leak: 'lnClassStream' is not closed at this location ??
                //lnClassStream = Stream.concat( lnClassStream, lnClasses.getLNClass().stream() );
                Stream< LNClass > tmp = Stream.concat( lnClassStream, lnClasses.getLNClass().stream() );
                lnClassStream = tmp;
            }
        }
        return lnClassStream;
    }

    public Stream< LNClass > getLNClassStream( NsIdentification identification ) {
        Stream< LNClass > lnClassStream = Stream.empty();
        NS ns = getNS( identification );
        if( ns != null ) {
            LNClasses lnClasses = ns.getLNClasses();
            if( lnClasses != null ) {
                Stream< LNClass > tmp = Stream.concat( lnClassStream, lnClasses.getLNClass().stream() );
                lnClassStream = tmp;
            }
            if( ns.getDependsOn() != null ) {
                Stream< LNClass > tmp = Stream.concat( lnClassStream, getLNClassStream( new NsIdentification( ns.getDependsOn() )));
                lnClassStream = tmp;
            }
        }
        return lnClassStream;
    }

    public LNClass findLNClass( String lnClass, NsIdentification nsIdentification, IRiseClipseConsole console ) {
        return getLNClassStream( getRootNsIdentification( nsIdentification ))
                .filter( c -> c.getName().equals( lnClass ) )
                .findAny()
                .orElse( null );
    }
    
    public Stream< Abbreviation > getAllAbbreviationStream() {
        Stream< Abbreviation > abbreviationStream = Stream.empty();
        Iterator< NS > it = nsdResources.values().iterator();
        while( it.hasNext() ) {
            Abbreviations abbreviations = it.next().getAbbreviations();
            if( abbreviations != null ) {
                Stream< Abbreviation > tmp = Stream.concat( abbreviationStream, abbreviations.getAbbreviation().stream() );
                abbreviationStream = tmp;
            }
        }
        return abbreviationStream;
    }

    public Stream< Abbreviation > getAbbreviationStream( NsIdentification identification ) {
        Stream< Abbreviation > abbreviationStream = Stream.empty();
        NS ns = getNS( identification );
        if( ns != null ) {
            Abbreviations abbreviations = ns.getAbbreviations();
            if( abbreviations != null ) {
                Stream< Abbreviation > tmp = Stream.concat( abbreviationStream, abbreviations.getAbbreviation().stream() );
                abbreviationStream = tmp;
            }
            if( ns.getDependsOn() != null ) {
                Stream< Abbreviation > tmp = Stream.concat( abbreviationStream, getAbbreviationStream( new NsIdentification( ns.getDependsOn() )));
                abbreviationStream = tmp;
            }
        }
        return abbreviationStream;
    }

    public Abbreviation findAbbreviation( String abb, NsIdentification nsIdentification, IRiseClipseConsole console ) {
        return getAbbreviationStream( getRootNsIdentification( nsIdentification ))
                .filter( a -> a.getName().equals( abb ) )
                .findAny()
                .orElse( null );
    }
    
    public Stream< Enumeration > getAllEnumerationStream() {
        Stream< Enumeration > enumerationStream = Stream.empty();
        Iterator< NS > it = nsdResources.values().iterator();
        while( it.hasNext() ) {
            Enumerations enumerations = it.next().getEnumerations();
            if( enumerations != null ) {
                Stream< Enumeration > tmp = Stream.concat( enumerationStream, enumerations.getEnumeration().stream() );
                enumerationStream = tmp;
            }
        }
        return enumerationStream;
    }

    public Stream< Enumeration > getEnumerationStream( NsIdentification identification ) {
        Stream< Enumeration > enumerationStream = Stream.empty();
        NS ns = getNS( identification );
        if( ns != null ) {
            Enumerations enumerations = ns.getEnumerations();
            if( enumerations != null ) {
                Stream< Enumeration > tmp = Stream.concat( enumerationStream, enumerations.getEnumeration().stream() );
                enumerationStream = tmp;
            }
            if( ns.getDependsOn() != null ) {
                Stream< Enumeration > tmp = Stream.concat( enumerationStream, getEnumerationStream( new NsIdentification( ns.getDependsOn() )));
                enumerationStream = tmp;
            }
        }
        return enumerationStream;
    }

    public Enumeration findEnumeration( String en, NsIdentification nsIdentification, IRiseClipseConsole console ) {
        return getEnumerationStream( getRootNsIdentification( nsIdentification ))
                .filter( e -> e.getName().equals( en ) )
                .findAny()
                .orElse( null );
    }
    
    public Stream< CDC > getAllCDCStream() {
        Stream< CDC > cdcStream = Stream.empty();
        Iterator< NS > it = nsdResources.values().iterator();
        while( it.hasNext() ) {
            CDCs cdcs = it.next().getCDCs();
            if( cdcs != null ) {
                Stream< CDC > tmp = Stream.concat( cdcStream, cdcs.getCDC().stream() );
                cdcStream = tmp;
            }
        }
        return cdcStream;
    }

    public Stream< CDC > getCDCStream( NsIdentification identification ) {
        Stream< CDC > cdcStream = Stream.empty();
        NS ns = getNS( identification );
        if( ns != null ) {
            CDCs cdcs = ns.getCDCs();
            if( cdcs != null ) {
                Stream< CDC > tmp = Stream.concat( cdcStream, cdcs.getCDC().stream() );
                cdcStream = tmp;
            }
            if( ns.getDependsOn() != null ) {
                Stream< CDC > tmp = Stream.concat( cdcStream, getCDCStream( new NsIdentification( ns.getDependsOn() )));
                cdcStream = tmp;
            }
        }
        return cdcStream;
    }

    public CDC findCDC( String cdc, NsIdentification nsIdentification, IRiseClipseConsole console ) {
        return getCDCStream( getRootNsIdentification( nsIdentification ))
                .filter( c -> c.getName().equals( cdc ) )
                .findAny()
                .orElse( null );
    }
    
    public Stream< ConstructedAttribute > getAllConstructedAttributeStream() {
        Stream< ConstructedAttribute > constructedAttributeStream = Stream.empty();
        Iterator< NS > it = nsdResources.values().iterator();
        while( it.hasNext() ) {
            ConstructedAttributes constructedAttributes = it.next().getConstructedAttributes();
            if( constructedAttributes != null ) {
                Stream< ConstructedAttribute > tmp = Stream.concat( constructedAttributeStream, constructedAttributes.getConstructedAttribute().stream() );
                constructedAttributeStream = tmp;
            }
        }
        return constructedAttributeStream;
    }

    public Stream< ConstructedAttribute > getConstructedAttributeStream( NsIdentification identification ) {
        Stream< ConstructedAttribute > constructedAttributeStream = Stream.empty();
        NS ns = getNS( identification );
        if( ns != null ) {
            ConstructedAttributes constructedAttributes = ns.getConstructedAttributes();
            if( constructedAttributes != null ) {
                Stream< ConstructedAttribute > tmp = Stream.concat( constructedAttributeStream, constructedAttributes.getConstructedAttribute().stream() );
                constructedAttributeStream = tmp;
            }
            if( ns.getDependsOn() != null ) {
                Stream< ConstructedAttribute > tmp = Stream.concat( constructedAttributeStream, getConstructedAttributeStream( new NsIdentification( ns.getDependsOn() )));
                constructedAttributeStream = tmp;
            }
        }
        if( nsdAdditions.get( identification ) != null ) {
            // We add ServiceTypeRealizations instead of replacing existing (basic ?) type, but
            // the latter will be replaced in the map because of the identical name
            // This is OK in TypeValidator but may not work in other usages
            for( ServiceNS add : nsdAdditions.get( identification )) {
                Stream< ConstructedAttribute > tmp = Stream.concat( constructedAttributeStream, add.getServiceTypeRealizations().getServiceTypeRealization().stream() );
                constructedAttributeStream = tmp;
            }
            for( ServiceNS add : nsdAdditions.get( identification )) {
                Stream< ConstructedAttribute > tmp = Stream.concat( constructedAttributeStream, add.getServiceConstructedAttributes().getServiceConstructedAttribute().stream() );
                constructedAttributeStream = tmp;
            }
        }
        return constructedAttributeStream;
    }

    public ConstructedAttribute findConstructedAttribute( String att, NsIdentification nsIdentification, IRiseClipseConsole console ) {
        return getConstructedAttributeStream( getRootNsIdentification( nsIdentification ))
                .filter( c -> c.getName().equals( att ) )
                .findAny()
                .orElse( null );
    }
    
    public Stream< BasicType > getAllBasicTypeStream() {
        Stream< BasicType > basicTypeStream = Stream.empty();
        Iterator< NS > it = nsdResources.values().iterator();
        while( it.hasNext() ) {
            BasicTypes basicTypes = it.next().getBasicTypes();
            if( basicTypes != null ) {
                Stream< BasicType > tmp = Stream.concat( basicTypeStream, basicTypes.getBasicType().stream() );
                basicTypeStream = tmp;
            }
        }
        return basicTypeStream;
    }

    public Stream< BasicType > getBasicTypeStream( NsIdentification identification ) {
        Stream< BasicType > basicTypeStream = Stream.empty();
        NS ns = getNS( identification );
        if( ns != null ) {
            BasicTypes basicTypes = ns.getBasicTypes();
            if( basicTypes != null ) {
                Stream< BasicType > tmp = Stream.concat( basicTypeStream, basicTypes.getBasicType().stream() );
                basicTypeStream = tmp;
            }
            if( ns.getDependsOn() != null ) {
                Stream< BasicType > tmp = Stream.concat( basicTypeStream, getBasicTypeStream( new NsIdentification( ns.getDependsOn() )));
                basicTypeStream = tmp;
            }
        }
        return basicTypeStream;
    }

    public BasicType findBasicType( String basic, NsIdentification nsIdentification, IRiseClipseConsole console ) {
        return getBasicTypeStream( getRootNsIdentification( nsIdentification ))
                .filter( b -> b.getName().equals( basic ) )
                .findAny()
                .orElse( null );
    }
    
    public Stream< FunctionalConstraint > getAllFunctionalConstraintStream() {
        Stream< FunctionalConstraint > functionalConstraintStream = Stream.empty();
        Iterator< NS > it = nsdResources.values().iterator();
        while( it.hasNext() ) {
            FunctionalConstraints functionalConstraints = it.next().getFunctionalConstraints();
            if( functionalConstraints != null ) {
                Stream< FunctionalConstraint > tmp = Stream.concat( functionalConstraintStream, functionalConstraints.getFunctionalConstraint().stream() );
                functionalConstraintStream = tmp;
            }
        }
        return functionalConstraintStream;
    }

    public Stream< FunctionalConstraint > getFunctionalConstraintStream( NsIdentification identification ) {
        Stream< FunctionalConstraint > functionalConstraintStream = Stream.empty();
        NS ns = getNS( identification );
        if( ns != null ) {
            FunctionalConstraints functionalConstraints = ns.getFunctionalConstraints();
            if( functionalConstraints != null ) {
                Stream< FunctionalConstraint > tmp = Stream.concat( functionalConstraintStream, functionalConstraints.getFunctionalConstraint().stream() );
                functionalConstraintStream = tmp;
            }
            if( ns.getDependsOn() != null ) {
                Stream< FunctionalConstraint > tmp = Stream.concat( functionalConstraintStream, getFunctionalConstraintStream( new NsIdentification( ns.getDependsOn() )));
                functionalConstraintStream = tmp;
            }
        }
        if( nsdAdditions.get( identification ) != null ) {
            for( ServiceNS add : nsdAdditions.get( identification )) {
                Stream< FunctionalConstraint > tmp = Stream.concat( functionalConstraintStream, add.getFunctionalConstraints().getFunctionalConstraint().stream() );
                functionalConstraintStream = tmp;
            }
        }
        return functionalConstraintStream;
    }

    public FunctionalConstraint findFunctionalConstraint( String fc, NsIdentification nsIdentification, IRiseClipseConsole console ) {
        FunctionalConstraint res = getFunctionalConstraintStream( getRootNsIdentification( nsIdentification ))
                .filter( f -> f.getAbbreviation().equals( fc ))
                .findAny()
                .orElse( null );
        return res;
    }
    
    public Stream< PresenceCondition > getAllPresenceConditionStream() {
        Stream< PresenceCondition > presenceConditionStream = Stream.empty();
        Iterator< NS > it = nsdResources.values().iterator();
        while( it.hasNext() ) {
            PresenceConditions presenceConditions = it.next().getPresenceConditions();
            if( presenceConditions != null ) {
                Stream< PresenceCondition > tmp = Stream.concat( presenceConditionStream, presenceConditions.getPresenceCondition().stream() );
                presenceConditionStream = tmp;
            }
        }
        return presenceConditionStream;
    }

    public Stream< PresenceCondition > getPresenceConditionStream( NsIdentification identification ) {
        Stream< PresenceCondition > presenceConditionStream = Stream.empty();
        NS ns = getNS( identification );
        if( ns != null ) {
            PresenceConditions presenceConditions = ns.getPresenceConditions();
            if( presenceConditions != null ) {
                Stream< PresenceCondition > tmp = Stream.concat( presenceConditionStream, presenceConditions.getPresenceCondition().stream() );
                presenceConditionStream = tmp;
            }
            if( ns.getDependsOn() != null ) {
                Stream< PresenceCondition > tmp = Stream.concat( presenceConditionStream, getPresenceConditionStream( new NsIdentification( ns.getDependsOn() )));
                presenceConditionStream = tmp;
            }
        }
        if( nsdAdditions.get( identification ) != null ) {
            for( ServiceNS add : nsdAdditions.get( identification )) {
                Stream< PresenceCondition > tmp = Stream.concat( presenceConditionStream, add.getPresenceConditions().getPresenceCondition().stream() );
                presenceConditionStream = tmp;
            }
        }
        return presenceConditionStream;
    }

    public PresenceCondition findPresenceCondition( String presence, NsIdentification nsIdentification, IRiseClipseConsole console ) {
        return getPresenceConditionStream( getRootNsIdentification( nsIdentification ))
                .filter( p -> p.getName().equals( presence ) )
                .findAny()
                .orElse( null );
    }
    
    public Doc findDoc( NsIdentification identification, String id ) {
        for( NSDoc nsdoc : nsdocResources.values() ) {
            Optional< Doc > doc = nsdoc
                    .getDoc()
                    .stream()
                    .filter( d -> d.getId().equals( id ))
                    .findFirst();
            if( doc.isPresent() ) {
                return doc.get();
            }
        }
        return null;
    }

}


