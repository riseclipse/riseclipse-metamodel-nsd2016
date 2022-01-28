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

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviation;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviations;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AbstractLNClass;
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
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdFactory;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceConditions;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDC;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceConstructedAttribute;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNsUsage;
import fr.centralesupelec.edf.riseclipse.util.AbstractRiseClipseConsole;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;
import fr.centralesupelec.edf.riseclipse.util.RiseClipseMetamodel;
import fr.centralesupelec.edf.riseclipse.util.AbstractRiseClipseResourceSet;


public class NsdResourceSetImpl extends AbstractRiseClipseResourceSet {

    private static final String NSD_SETUP_CATEGORY = "NSD/Setup";

    private Map< NsIdentification, NS        > nsdResources       = new HashMap<>();
    private Map< NsIdentification, ServiceNS > serviceNSResources = new HashMap<>();
    private Map< NsIdentification, NSDoc     > nsdocResources     = new HashMap<>();
    private List< ApplicableServiceNS        > appNSs             = new ArrayList<>();
    
    private Set< NS >                          nsModified         = new HashSet<>();

    private NsdResourceFactoryImpl resourceFactory = new NsdResourceFactoryImpl();
    // TODO: there may be several appNS
    // DONE: no: unique file according to 61850-7-7

    public NsdResourceSetImpl( boolean strictContent ) {
        super( strictContent );
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
            // if strictContent is false, another kind of resource is allowed.
            // We just ignore it.
            return;
        }
        if( ! ( resource.getContents().get( 0 ) instanceof DocumentRoot )) {
            AbstractRiseClipseConsole.getConsole().error( NSD_SETUP_CATEGORY, resource.getURI().lastSegment(), 0,
                "Not an NSD file" );
            this.getResources().remove( resource );
            return;
        }
        DocumentRoot root = (DocumentRoot) resource.getContents().get( 0 );
        
        if( root.getNS() != null ) {
            NsIdentification nsId = new NsIdentification( root.getNS() );
            if( nsdResources.get( nsId ) != null ) {
                AbstractRiseClipseConsole.getConsole().error( NSD_SETUP_CATEGORY, resource.getURI().lastSegment(), 0,
                    "There is already an NSD file with NsIdentification \"", nsId, "\", file is ignored" );
                this.getResources().remove( resource );
                return;
            }
            nsdResources.put( nsId, root.getNS() );
            return;
        }
        
        if( root.getServiceNS() != null ) {
            NsIdentification nsId = new NsIdentification( root.getServiceNS() );
            if( serviceNSResources.get( nsId ) != null ) {
                AbstractRiseClipseConsole.getConsole().error( NSD_SETUP_CATEGORY, resource.getURI().lastSegment(), 0,
                        "There is already an SNSD file with NsIdentification \"" + nsId + "\", file is ignored" );
                this.getResources().remove( resource );
                return;
            }
            serviceNSResources.put( nsId, root.getServiceNS() );
            return;
        }
        
        if( root.getApplicableServiceNS() != null ) {
            appNSs.add( root.getApplicableServiceNS() );
            return;
        }
        
        if( root.getNSDoc() != null ) {
            NSDoc nsdoc = ( NSDoc ) root.getNSDoc();
            NsIdentification id = new NsIdentification( nsdoc );
            if( nsdocResources.get( id ) != null ) {
                AbstractRiseClipseConsole.getConsole().error( NSD_SETUP_CATEGORY, resource.getURI().lastSegment(), 0,
                    "There is already an NSDoc file with NsIdentification \"", id, "\", this one is ignored" );
                this.getResources().remove( resource );
                return;
            }
            nsdocResources.put( id, nsdoc );
            return;
        }
        
        AbstractRiseClipseConsole.getConsole().error( NSD_SETUP_CATEGORY, resource.getURI().lastSegment(), 0,
            "The file is not an NSD file" );
        this.getResources().remove( resource );
        return;
    }
    
//    public NS getNS( String namespace ) {
//        if( namespaces.get( namespace ) == null ) return null;
//        return nsdResources.get( namespaces.get( namespace ));
//    }
    
    public NS getExactNS( NsIdentification id ) {
        return nsdResources.get( id );
    }
    
    public NS getRelaxedNS( NsIdentification id ) {
        NS found = getExactNS( id );
        if( found != null ) return found;

        // Look for one with the higher release
        // See mail thread "RE: RiseClipse - Validation 4" (June 24th, 2021) with Sébastien Latraverse
        for( NsIdentification knownNsId : nsdResources.keySet() ) {
            NS other = nsdResources.get( knownNsId );
            if( knownNsId.equalsIgnoringRelease( id )) {
                if( found == null ) {
                    found = other;
                }
                else if( other.getRelease() > found.getRelease() ) {
                    found = other;
                }
            }
        }
        
        return found;
    }
    
    /* (non-Javadoc)
     * @see fr.centralesupelec.edf.riseclipse.util.AbstractRiseClipseResourceSet#finalizeLoad(fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole)
     */
    @Override
    public void finalizeLoad( IRiseClipseConsole console ) {
        // Explicit links must be built first, they are needed for ServiceNsUsage
        buildExplicitLinks( console );

        for( ApplicableServiceNS appNS : appNSs ) {
            for( ServiceNsUsage serviceNsUsage : appNS.getServiceNsUsage() ) {
                NsIdentification serviceNsId = new NsIdentification( serviceNsUsage );
                
                if( serviceNSResources.get( serviceNsId ) != null ) {
                    boolean applied = false;
                    for( AppliesToType applyTo : serviceNsUsage.getAppliesTo() ) {
                        NsIdentification applyToNsId = new NsIdentification( applyTo );
                        
                        // If it is applied to a core namespace, we put it at the root to be sure that additions will be found later
                        if( applyToNsId.isCoreNamespace() ) {
                            applyToNsId = new NsIdentification( NsIdentification.IEC_61950_7_2_CORE_NAMESPACE_ID,
                                                                applyToNsId.getVersion(),
                                                                applyToNsId.getRevision(),
                                                                applyToNsId.getRelease() );
                        }

                        NS applyToNs = getExactNS( applyToNsId );
                        if( applyToNs == null ) {
                            console.info( NSD_SETUP_CATEGORY, 0, 
                                          "While applying ServiceNS with id ", serviceNsId, ", NS with id ", applyToNsId,
                                        " not found, looking for one ignoring release attribute" );
                            applyToNs = getRelaxedNS( applyToNsId );
                            if( applyToNs == null ) {
                                console.error( NSD_SETUP_CATEGORY, 0, 
                                              "While applying ServiceNS with id ", serviceNsId, ", NS with id ", applyToNsId,
                                              " not found, including when ignoring release attribute" );
                                continue;
                            }
                        }
                        if( nsModified.contains( applyToNs )) {
                            console.warning( NSD_SETUP_CATEGORY, 0, 
                                             "A ServiceNS has already been applied to NS with id ", applyToNsId,
                                             ", the ServiceNS with id ", serviceNsId, " will not be applied again" );
                            continue;
                        }
                        console.info( NSD_SETUP_CATEGORY, 0, 
                                      "Applying ServiceNS with id ", serviceNsId, ", on NS with id ", applyToNsId );
                        nsModified.add( applyToNs );
                        applyServiceNs( serviceNSResources.get( serviceNsId ), applyToNsId, applyToNs, console );
                        applied = true;
                    }
                    if( ! applied ) {
                        console.warning( NSD_SETUP_CATEGORY, 0, 
                                "ServiceNS with id ", serviceNsId, " has not been applied to any NS" );
                    }
                }
                else {
                    console.warning( NSD_SETUP_CATEGORY, 0,
                                     "While processing ServiceNsUsage: ServiceNS with id ", serviceNsId, " not found" );
                }
            }
        }
    }

    private void applyServiceNs( ServiceNS serviceNS, NsIdentification applyToNsId, NS applyToNs, IRiseClipseConsole console ) {
        
        if( serviceNS.getAbbreviations() != null ) {
            for( Abbreviation abbreviation : serviceNS.getAbbreviations().getAbbreviation() ) {
                console.info( NSD_SETUP_CATEGORY, 0,
                        "Service NS: adding new abbreviation ", abbreviation.getName() );
                if( applyToNs.getAbbreviations() == null ) {
                    applyToNs.setAbbreviations( NsdFactory.eINSTANCE.createAbbreviations() );
                }
                Abbreviation copy = EcoreUtil.copy( abbreviation );
                // filename not copied ?
                copy.setFilename( abbreviation.getFilename() );
                applyToNs.getAbbreviations().getAbbreviation().add( copy );
                copy.buildExplicitLinks( console );
            }
        }
        
        if( serviceNS.getFunctionalConstraints() != null ) {
            for( FunctionalConstraint functionalConstraint : serviceNS.getFunctionalConstraints().getFunctionalConstraint() ) {
                console.info( NSD_SETUP_CATEGORY, 0,
                        "Service NS: adding new functional constraint ", functionalConstraint.getAbbreviation() );
                if( applyToNs.getFunctionalConstraints() == null ) {
                    applyToNs.setFunctionalConstraints( NsdFactory.eINSTANCE.createFunctionalConstraints() );
                }
                FunctionalConstraint copy = EcoreUtil.copy( functionalConstraint );
                // filename not copied ?
                copy.setFilename( functionalConstraint.getFilename() );
                applyToNs.getFunctionalConstraints().getFunctionalConstraint().add( copy );
                copy.buildExplicitLinks( console );
            }
        }
        
        if( serviceNS.getPresenceConditions() != null ) {
            for( PresenceCondition presenceCondition : serviceNS.getPresenceConditions().getPresenceCondition() ) {
                console.info( NSD_SETUP_CATEGORY, 0,
                        "Service NS: adding new presence condition ", presenceCondition.getName() );
                if( applyToNs.getPresenceConditions() == null ) {
                    applyToNs.setPresenceConditions( NsdFactory.eINSTANCE.createPresenceConditions() );
                }
                PresenceCondition copy = EcoreUtil.copy( presenceCondition );
                // filename not copied ?
                copy.setFilename( presenceCondition.getFilename() );
                applyToNs.getPresenceConditions().getPresenceCondition().add( copy );
                copy.buildExplicitLinks( console );
            }
        }
        
        if( serviceNS.getServiceTypeRealizations() != null ) {
            // A ServiceTypeRealization gives a new definition to an existing (only basic ? never constructed ?) type
            for( ConstructedAttribute typeRealization : serviceNS.getServiceTypeRealizations().getServiceTypeRealization() ) {
                console.info( NSD_SETUP_CATEGORY, 0,
                              "Service NS: apply new definition for type ", typeRealization.getName() );
                // move a copy in the applyTo resource so that it appears as belonging to the namespace of this resource
                if( applyToNs.getConstructedAttributes() == null ) {
                    applyToNs.setConstructedAttributes( NsdFactory.eINSTANCE.createConstructedAttributes() );
                }
                ConstructedAttribute copy = EcoreUtil.copy( typeRealization );
                // filename not copied ?
                copy.setFilename( typeRealization.getFilename() );
                applyToNs.getConstructedAttributes().getConstructedAttribute().add( copy );
                copy.buildExplicitLinks( console );
                BasicType basic = findBasicType( typeRealization.getName(), applyToNsId, true );
                if( basic != null ) {
                    // Avoid ConcurrentModificationException
                    List< AgAttributeType > atts = basic
                            .getReferredByAttributeType()
                            .stream()
                            .collect( Collectors.toList() );
                    for( AgAttributeType att : atts ) {
                        att.unsetRefersToBasicType();
                        console.info( NSD_SETUP_CATEGORY, 0,
                                      "Service NS: using TypeRealization ",  basic.getName(), " to attribute ", att.getType() );
                        att.setRefersToConstructedAttribute( typeRealization );
                    }
                }
                else {
                    console.warning( NSD_SETUP_CATEGORY, 0,
                                     "BasicType ", typeRealization.getName(), " not found" );
                }
            }
        }
        
        if( serviceNS.getServiceConstructedAttributes() != null ) {
            // A ServiceConstructedAttribute defines new ConstructedAttribute:
            // they are taken into account in getConstructedAttributeStream()
            for( ServiceConstructedAttribute serviceConstructedAttribute : serviceNS.getServiceConstructedAttributes().getServiceConstructedAttribute() ) {
                console.info( NSD_SETUP_CATEGORY, 0,
                              "Service NS: Adding ConstructedAttribute ", serviceConstructedAttribute.getName(), " to NS ", applyToNsId );
                if( applyToNs.getConstructedAttributes() == null ) {
                    applyToNs.setConstructedAttributes( NsdFactory.eINSTANCE.createConstructedAttributes() );
                }
                ServiceConstructedAttribute copy = EcoreUtil.copy( serviceConstructedAttribute );
                // filename not copied ?
                copy.setFilename( serviceConstructedAttribute.getFilename() );
                copy.getSubDataAttribute().stream().forEach( sda -> sda.setFilename( serviceConstructedAttribute.getFilename() ));
                applyToNs.getConstructedAttributes().getConstructedAttribute().add( copy );
                copy.buildExplicitLinks( console );
            }
        }
        
        if( serviceNS.getServiceCDCs() != null ) {
            // A ServiceCDC add new attribute to an existing CDC
            for( ServiceCDC serviceCDC : serviceNS.getServiceCDCs().getServiceCDC() ) {
                CDC cdc = findCDC( serviceCDC.getCdc(), applyToNsId, true );
                if( cdc != null ) {
                    serviceCDC
                    .getServiceDataAttribute()
                    .stream()
                    .forEach( att -> {
                        DataAttribute da = att.toDataAttribute();
                        console.info( NSD_SETUP_CATEGORY, 0,
                                      "Service NS: Adding DataAttribute ", da.getName(), " to CDC ", cdc.getName() );
                        // setParentCDC() should be enough to attach the new attribute to the applyTo resource, giving it the right namespace
                        da.setParentCDC( cdc );
                        da.buildExplicitLinks( console );
                    });
                }
                else {
                    console.warning( NSD_SETUP_CATEGORY, 0,
                                     "Service NS: CDC ", serviceCDC.getCdc(), " not found" );
                }
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
                if(( root.getNS() != null ) && ( ! root.getNS().isExplicitLinksBuilt() )) {
                    // TODO: there is such a constant for category in NsdObjectImpl
                    console.verbose( "NSD/ExplicitLinks", 0,
                                     "Resolving links for file " + resource.getURI().lastSegment() );
                    root.getNS().buildExplicitLinks( console );
                }
            }
        }
        
    }
    
    public List< NsIdentification > getNsIdentificationOrderedList() {
        LinkedList< NsIdentification > list = new LinkedList< NsIdentification >( nsdResources.keySet() );
        ArrayList< NsIdentification > sortedList = new ArrayList< NsIdentification >();
        // First, add root NS 
        ListIterator< NsIdentification > it = list.listIterator();
        while( it.hasNext() ) {
            NsIdentification nsId = it.next();
            NS ns = nsdResources.get( nsId );
            if( ns.getDependsOn() == null ) {
                sortedList.add( nsId );
                it.remove();
            }
        }
        // The add NS which depend on another already in sortedList
        while( ! list.isEmpty() ) {
            boolean progress = false;
            it = list.listIterator();
            while( it.hasNext() ) {
                NsIdentification nsId = it.next();
                NS ns = nsdResources.get( nsId );
                if( sortedList.contains( new NsIdentification( ns.getDependsOn() ))) {
                    sortedList.add( nsId );
                    it.remove();
                    progress = true;
                }
            }
            if( ! progress ) {
                AbstractRiseClipseConsole.getConsole().fatal( NSD_SETUP_CATEGORY, 0,
                        "getNsIdentificationOrderedList() failed" );
                return null;
            }
        }
        return sortedList;
    }

    public Stream< NsIdentification > getNsIdentificationStream() {
        return nsdResources.keySet().stream();
    }

    public NsIdentification getDependsOn( NsIdentification nsIdentification ) {
        NS ns = getRelaxedNS( nsIdentification );
        if(( ns != null ) && ( ns.getDependsOn() != null )) {
            return new NsIdentification( ns.getDependsOn() );
        }
        return null;
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
    
//    public Stream< LNClass > getAllLNClassStream() {
//        Stream< LNClass > lnClassStream = Stream.empty();
//        Iterator< NS > it = nsdResources.values().iterator();
//        while( it.hasNext() ) {
//            LNClasses lnClasses = it.next().getLNClasses();
//            if( lnClasses != null ) {
//                // Warning: Resource leak: 'lnClassStream' is not closed at this location ??
//                //lnClassStream = Stream.concat( lnClassStream, lnClasses.getLNClass().stream() );
//                Stream< LNClass > tmp = Stream.concat( lnClassStream, lnClasses.getLNClass().stream() );
//                lnClassStream = tmp;
//            }
//        }
//        return lnClassStream;
//    }

    private Stream< LNClass > getLNClassStream( NS ns, boolean useDependsOn ) {
        Stream< LNClass > lnClassStream = Stream.empty();
        LNClasses lnClasses = ns.getLNClasses();
        if( lnClasses != null ) {
            Stream< LNClass > tmp = Stream.concat( lnClassStream, lnClasses.getLNClass().stream() );
            lnClassStream = tmp;
        }
        if( useDependsOn && ( ns.getDependsOn() != null ) && ( ns.getDependsOn().getRefersToNS() != null )) {
            Stream< LNClass > tmp = Stream.concat( lnClassStream, getLNClassStream( ns.getDependsOn().getRefersToNS(), useDependsOn ));
            lnClassStream = tmp;
        }
        return lnClassStream;
    }
    
    public Stream< LNClass > getLNClassStream( NsIdentification identification, boolean useDependsOn ) {
        Stream< LNClass > lnClassStream = Stream.empty();
        NS ns = getRelaxedNS( identification );
        if( ns != null ) {
            Stream< LNClass > tmp = Stream.concat( lnClassStream, getLNClassStream( ns, useDependsOn ));
            lnClassStream = tmp;
        }
        return lnClassStream;
    }

    public LNClass findLNClass( String lnClass, NsIdentification nsIdentification, boolean useDependsOn ) {
        return getLNClassStream( nsIdentification, useDependsOn )
                .filter( c -> c.getName().equals( lnClass ) )
                .findAny()
                .orElse( null );
    }
    
    private Stream< AbstractLNClass > getAbstractLNClassStream( NS ns, boolean useDependsOn ) {
        Stream< AbstractLNClass > lnClassStream = Stream.empty();
        LNClasses lnClasses = ns.getLNClasses();
        if( lnClasses != null ) {
            Stream< AbstractLNClass > tmp = Stream.concat( lnClassStream, lnClasses.getAbstractLNClass().stream() );
            lnClassStream = tmp;
        }
        if( useDependsOn && ( ns.getDependsOn() != null ) && ( ns.getDependsOn().getRefersToNS() != null )) {
            Stream< AbstractLNClass > tmp = Stream.concat( lnClassStream, getAbstractLNClassStream( ns.getDependsOn().getRefersToNS(), useDependsOn ));
            lnClassStream = tmp;
        }
        return lnClassStream;
    }
    
    public Stream< AbstractLNClass > getAbstractLNClassStream( NsIdentification identification, boolean useDependsOn ) {
        Stream< AbstractLNClass > lnClassStream = Stream.empty();
        NS ns = getRelaxedNS( identification );
        if( ns != null ) {
            Stream< AbstractLNClass > tmp = Stream.concat( lnClassStream, getAbstractLNClassStream( ns, useDependsOn ));
            lnClassStream = tmp;
        }
        return lnClassStream;
    }

    public AbstractLNClass findAbstractLNClass( String lnClass, NsIdentification nsIdentification, boolean useDependsOn ) {
        return getAbstractLNClassStream( nsIdentification, useDependsOn )
                .filter( c -> c.getName().equals( lnClass ) )
                .findAny()
                .orElse( null );
    }
    
    private Stream< Abbreviation > getAbbreviationStream( NS ns, boolean useDependsOn ) {
        Stream< Abbreviation > abbreviationStream = Stream.empty();
        Abbreviations abbreviations = ns.getAbbreviations();
        if( abbreviations != null ) {
            Stream< Abbreviation > tmp = Stream.concat( abbreviationStream, abbreviations.getAbbreviation().stream() );
            abbreviationStream = tmp;
        }
        if( useDependsOn && ( ns.getDependsOn() != null ) && ( ns.getDependsOn().getRefersToNS() != null )) {
            Stream< Abbreviation > tmp = Stream.concat( abbreviationStream, getAbbreviationStream( ns.getDependsOn().getRefersToNS(), useDependsOn ));
            abbreviationStream = tmp;
        }
        return abbreviationStream;
    }
    
    public Stream< Abbreviation > getAbbreviationStream( NsIdentification identification, boolean useDependsOn ) {
        Stream< Abbreviation > abbreviationStream = Stream.empty();
        NS ns = getRelaxedNS( identification );
        if( ns != null ) {
            Stream< Abbreviation > tmp = Stream.concat( abbreviationStream, getAbbreviationStream( ns, useDependsOn ));
            abbreviationStream = tmp;
        }
        return abbreviationStream;
    }

    public Abbreviation findAbbreviation( String abb, NsIdentification nsIdentification, boolean useDependsOn ) {
        return getAbbreviationStream( nsIdentification, useDependsOn )
                .filter( a -> a.getName().equals( abb ) )
                .findAny()
                .orElse( null );
    }
    
    private Stream< Enumeration > getEnumerationStream( NS ns, boolean useDependsOn ) {
        Stream< Enumeration > enumerationStream = Stream.empty();
        Enumerations enumerations = ns.getEnumerations();
        if( enumerations != null ) {
            Stream< Enumeration > tmp = Stream.concat( enumerationStream, enumerations.getEnumeration().stream() );
            enumerationStream = tmp;
        }
        if( useDependsOn && ( ns.getDependsOn() != null ) && ( ns.getDependsOn().getRefersToNS() != null )) {
            Stream< Enumeration > tmp = Stream.concat( enumerationStream, getEnumerationStream( ns.getDependsOn().getRefersToNS(), useDependsOn ));
            enumerationStream = tmp;
        }
        return enumerationStream;
    }
    
    public Stream< Enumeration > getEnumerationStream( NsIdentification identification, boolean useDependsOn ) {
        Stream< Enumeration > enumerationStream = Stream.empty();
        NS ns = getRelaxedNS( identification );
        if( ns != null ) {
            Stream< Enumeration > tmp = Stream.concat( enumerationStream, getEnumerationStream( ns, useDependsOn ));
            enumerationStream = tmp;
        }
        return enumerationStream;
    }

    public Enumeration findEnumeration( String en, NsIdentification nsIdentification, boolean useDependsOn ) {
        return getEnumerationStream( nsIdentification, useDependsOn )
                .filter( e -> e.getName().equals( en ) )
                .findAny()
                .orElse( null );
    }
    
    private Stream< CDC > getCDCStream( NS ns, boolean useDependsOn ) {
        Stream< CDC > cdcStream = Stream.empty();
        CDCs cdcs = ns.getCDCs();
        if( cdcs != null ) {
            Stream< CDC > tmp = Stream.concat( cdcStream, cdcs.getCDC().stream() );
            cdcStream = tmp;
        }
        if( useDependsOn && ( ns.getDependsOn() != null ) && ( ns.getDependsOn().getRefersToNS() != null )) {
            Stream< CDC > tmp = Stream.concat( cdcStream, getCDCStream( ns.getDependsOn().getRefersToNS(), useDependsOn ));
            cdcStream = tmp;
        }
        return cdcStream;
    }
    
    public Stream< CDC > getCDCStream( NsIdentification identification, boolean useDependsOn ) {
        Stream< CDC > cdcStream = Stream.empty();
        NS ns = getRelaxedNS( identification );
        if( ns != null ) {
            Stream< CDC > tmp = Stream.concat( cdcStream, getCDCStream( ns, useDependsOn ));
            cdcStream = tmp;
        }
        return cdcStream;
    }

    public CDC findCDC( String cdc, NsIdentification nsIdentification, boolean useDependsOn ) {
        return getCDCStream( nsIdentification, useDependsOn )
                .filter( c -> c.getName().equals( cdc ) )
                .findAny()
                .orElse( null );
    }
    
    private Stream< ConstructedAttribute > getConstructedAttributeStream( NS ns, boolean useDependsOn ) {
        Stream< ConstructedAttribute > constructedAttributeStream = Stream.empty();
        ConstructedAttributes constructedAttributes = ns.getConstructedAttributes();
        if( constructedAttributes != null ) {
            Stream< ConstructedAttribute > tmp = Stream.concat( constructedAttributeStream, constructedAttributes.getConstructedAttribute().stream() );
            constructedAttributeStream = tmp;
        }
        if( useDependsOn && ( ns.getDependsOn() != null ) && ( ns.getDependsOn().getRefersToNS() != null )) {
            Stream< ConstructedAttribute > tmp = Stream.concat( constructedAttributeStream, getConstructedAttributeStream( ns.getDependsOn().getRefersToNS(), useDependsOn ));
            constructedAttributeStream = tmp;
        }
        return constructedAttributeStream;
    }
    
    public Stream< ConstructedAttribute > getConstructedAttributeStream( NsIdentification identification, boolean useDependsOn ) {
        Stream< ConstructedAttribute > constructedAttributeStream = Stream.empty();
        NS ns = getRelaxedNS( identification );
        if( ns != null ) {
            Stream< ConstructedAttribute > tmp = Stream.concat( constructedAttributeStream, getConstructedAttributeStream( ns, useDependsOn ));
            constructedAttributeStream = tmp;
        }
        return constructedAttributeStream;
    }

    public ConstructedAttribute findConstructedAttribute( String att, NsIdentification nsIdentification, boolean useDependsOn ) {
        return getConstructedAttributeStream( nsIdentification, useDependsOn )
                .filter( c -> c.getName().equals( att ) )
                .findAny()
                .orElse( null );
    }
    
    private Stream< BasicType > getBasicTypeStream( NS ns, boolean useDependsOn ) {
        Stream< BasicType > basicTypeStream = Stream.empty();
        BasicTypes basicTypes = ns.getBasicTypes();
        if( basicTypes != null ) {
            Stream< BasicType > tmp = Stream.concat( basicTypeStream, basicTypes.getBasicType().stream() );
            basicTypeStream = tmp;
        }
        if( useDependsOn && ( ns.getDependsOn() != null ) && ( ns.getDependsOn().getRefersToNS() != null )) {
            Stream< BasicType > tmp = Stream.concat( basicTypeStream, getBasicTypeStream( ns.getDependsOn().getRefersToNS(), useDependsOn ));
            basicTypeStream = tmp;
        }
        return basicTypeStream;
    }
    
    public Stream< BasicType > getBasicTypeStream( NsIdentification identification, boolean useDependsOn ) {
        Stream< BasicType > basicTypeStream = Stream.empty();
        NS ns = getRelaxedNS( identification );
        if( ns != null ) {
            Stream< BasicType > tmp = Stream.concat( basicTypeStream, getBasicTypeStream( ns, useDependsOn ));
            basicTypeStream = tmp;
        }
        return basicTypeStream;
    }

    public BasicType findBasicType( String basic, NsIdentification nsIdentification, boolean useDependsOn ) {
        return getBasicTypeStream( nsIdentification, useDependsOn )
                .filter( b -> b.getName().equals( basic ) )
                .findAny()
                .orElse( null );
    }
    
    private Stream< FunctionalConstraint > getFunctionalConstraintStream( NS ns, boolean useDependsOn ) {
        Stream< FunctionalConstraint > functionalConstraintStream = Stream.empty();
        FunctionalConstraints functionalConstraints = ns.getFunctionalConstraints();
        if( functionalConstraints != null ) {
            Stream< FunctionalConstraint > tmp = Stream.concat( functionalConstraintStream, functionalConstraints.getFunctionalConstraint().stream() );
            functionalConstraintStream = tmp;
        }
        if( useDependsOn && ( ns.getDependsOn() != null ) && ( ns.getDependsOn().getRefersToNS() != null )) {
            Stream< FunctionalConstraint > tmp = Stream.concat( functionalConstraintStream, getFunctionalConstraintStream( ns.getDependsOn().getRefersToNS(), useDependsOn ));
            functionalConstraintStream = tmp;
        }
        return functionalConstraintStream;
    }
    
    public Stream< FunctionalConstraint > getFunctionalConstraintStream( NsIdentification identification, boolean useDependsOn ) {
        Stream< FunctionalConstraint > functionalConstraintStream = Stream.empty();
        NS ns = getRelaxedNS( identification );
        if( ns != null ) {
            Stream< FunctionalConstraint > tmp = Stream.concat( functionalConstraintStream, getFunctionalConstraintStream( ns, useDependsOn ));
            functionalConstraintStream = tmp;
        }
        return functionalConstraintStream;
    }

    public FunctionalConstraint findFunctionalConstraint( String fc, NsIdentification nsIdentification, boolean useDependsOn ) {
        FunctionalConstraint res = getFunctionalConstraintStream( nsIdentification, useDependsOn )
                .filter( f -> f.getAbbreviation().equals( fc ))
                .findAny()
                .orElse( null );
        return res;
    }
    
    private Stream< PresenceCondition > getPresenceConditionStream( NS ns, boolean useDependsOn ) {
        Stream< PresenceCondition > presenceConditionStream = Stream.empty();
        PresenceConditions presenceConditions = ns.getPresenceConditions();
        if( presenceConditions != null ) {
            Stream< PresenceCondition > tmp = Stream.concat( presenceConditionStream, presenceConditions.getPresenceCondition().stream() );
            presenceConditionStream = tmp;
        }
        if( useDependsOn && ( ns.getDependsOn() != null ) && ( ns.getDependsOn().getRefersToNS() != null )) {
            Stream< PresenceCondition > tmp = Stream.concat( presenceConditionStream, getPresenceConditionStream( ns.getDependsOn().getRefersToNS(), useDependsOn ));
            presenceConditionStream = tmp;
        }
        return presenceConditionStream;
    }
    
    public Stream< PresenceCondition > getPresenceConditionStream( NsIdentification identification, boolean useDependsOn ) {
        Stream< PresenceCondition > presenceConditionStream = Stream.empty();
        NS ns = getRelaxedNS( identification );
        if( ns != null ) {
            Stream< PresenceCondition > tmp = Stream.concat( presenceConditionStream, getPresenceConditionStream( ns, useDependsOn ));
            presenceConditionStream = tmp;
        }
        return presenceConditionStream;
    }

    public PresenceCondition findPresenceCondition( String presence, NsIdentification nsIdentification, boolean useDependsOn ) {
        return getPresenceConditionStream( nsIdentification, useDependsOn )
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


