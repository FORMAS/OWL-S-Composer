/*
 * Created on Dec 12, 2004
 */
package impl.jena;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.mindswap.owl.OWLClass;
import org.mindswap.owl.OWLDataProperty;
import org.mindswap.owl.OWLDataValue;
import org.mindswap.owl.OWLFactory;
import org.mindswap.owl.OWLIndividual;
import org.mindswap.owl.OWLKnowledgeBase;
import org.mindswap.owl.OWLObjectProperty;
import org.mindswap.owl.OWLOntology;
import org.mindswap.owl.OWLProperty;
import org.mindswap.owl.OWLReader;
import org.mindswap.owl.OWLValue;
import org.mindswap.owls.OWLSFactory;
import org.mindswap.owls.OWLSVersionTranslator;
import org.mindswap.owls.service.Service;
import org.mindswap.utils.QNameProvider;
import org.mindswap.utils.URIUtils;

import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.rdf.model.Literal;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.Resource;

/**
 * @author Evren Sirin
 */
public class OWLKnowledgeBaseImpl extends OWLModelImpl implements OWLKnowledgeBase, org.mindswap.owls.OWLSKnowledgeBase {
    protected Set ontologies;
    
    private Map uriMap;
    private Map modelMap;
    private Map importDependencies;
    private Set notImported;
    
    protected OWLReader reader;
    private QNameProvider qnames;
    
    private boolean autoConsistency;
    
    private OWLSVersionTranslator translator;
    
    private OWLKnowledgeBase translationSource;
    
    public OWLKnowledgeBaseImpl() {
        super( ModelFactory.createDefaultModel() );
        
        setAutoTranslate( false );
        
        translationSource = this;
        
        ontologies = new HashSet();
        uriMap = new HashMap();
        modelMap = new HashMap();
        importDependencies = new HashMap();
        notImported = new HashSet();
        
        reader = OWLFactory.createReader();
        
        qnames = new QNameProvider();
        
        autoConsistency = false;
        
        createBaseOntology();
    }
        
    protected void createBaseOntology() {
        URI uri = URI.create("urn:owl-s-api:baseOntology");        
        Model model = getOntModel().getBaseModel();
        
        OWLOntology ontology = createOntologyWithoutLoading( uri, null, model);

        ontologies.add(ontology);
        
        setBaseOntology(ontology);           
    }
    
    public Set getOntologies() {
        return new HashSet(ontologies);
    }

    public OWLOntology getOntology(URI uri) {
        return (OWLOntology) uriMap.get(uri);
    }
    
    public OWLOntology createOntology(boolean load) {
        if( load )
            return createOntology();
        else
            return new OWLOntologyImpl(this, null, null, ModelFactory.createDefaultModel());
    }
    
    public OWLOntology createOntology() {
        return createOntology(null, null, ModelFactory.createDefaultModel());
    }
    
    public OWLOntology createOntology(URI uri) {
        return createOntology(uri, null, ModelFactory.createDefaultModel());
    }
    
    public OWLOntology createOntology(URI uri, URI fileURI) {
        return createOntology(uri, fileURI, ModelFactory.createDefaultModel());
    }
    
    public OWLOntology createOntology(URI uri, URI fileURI, Object implementation) {
        OWLOntology ont = createOntologyWithoutLoading(uri, fileURI, (Model) implementation);
        
        return load(ont);
    }
    
    protected OWLOntology createOntologyWithoutLoading(URI uri, URI fileURI, Model model) {
        OWLOntology ont = new OWLOntologyImpl(this, uri, fileURI, model);
        return ont;
    }
    
    public OWLOntology loadOntology(OWLOntology ont) {
        return load(ont);
    }
    
    public OWLOntology load(OWLOntology ont) {
        return load( ont, true );
    }    

    public OWLOntology load(OWLOntology ont, boolean withImports) {
        notImported.add( ont );
        OWLOntology loadedOnt = internalLoad( ont, withImports );
        if( getAutoConsistency() ) {
	        if(!isConsistent()) {
	            System.err.println(
	                "WARNING: Rejecting to load " + ont + " " +
	                "which causes the KB to be inconsistent!");
	            unload( loadedOnt );
	            loadedOnt = null;
	        }
        }
        
        return loadedOnt;
    }
    
    protected OWLOntology internalLoad(OWLOntology ont, boolean withImports) {
        OWLOntology loadedOnt = ont;
        
        URI uri = loadedOnt.getURI();
        if(uri != null && uriMap.containsKey(uri))
           return (OWLOntology) uriMap.get(uri);        
        
        if(getAutoTranslate()) {
            loadedOnt = translator.translate( ont );
        
            if(translationSource == this) {
                translationSource = OWLFactory.createKB();
                translationSource.setAutoTranslate(false);
            }
	        translationSource.load( loadedOnt.getTranslationSource() );
        }
        
        Model model = ((OntModel) loadedOnt.getImplementation()).getBaseModel();
        
        loadedOnt = createOntologyWithoutLoading(uri, loadedOnt.getFileURI(), model);            
        
        if(uri != null)
            uriMap.put(uri, loadedOnt);
        ontologies.add(loadedOnt);
        
        ontModel.addSubModel(model);        
        modelMap.put(model, loadedOnt);

        if(withImports) {
            for(Iterator i = ont.getImports().iterator(); i.hasNext(); ) {                
                OWLOntology imported = (OWLOntology) i.next();
                OWLOntology loadedImport = internalLoad(imported, withImports);
                loadedOnt.addImport(loadedImport);
                
                if( !notImported.contains( loadedImport ) ) {
                    Set importees = (Set) importDependencies.get( loadedImport );
                    if( importees == null ) {
                        importees = new HashSet();
                        importDependencies.put( loadedImport, importees );
                    }
                    importees.add( loadedOnt );
                }
            }
        }
        
        return loadedOnt;
    }
    
    public void unload(URI uri) {
        uri = URIUtils.standardURI( uri );
        OWLOntology ont = getOntology( uri );
        if(ont != null) {
            unload( ont );
        }
        else
            System.out.println("Ontology " + uri + " not found in KB");
    }
    
    public void unload( OWLOntology ontology ) {
        URI uri = ontology.getURI();
        if(uri != null) {
            uriMap.remove( uri );
        }
        
        Model m = ((OntModel) ontology.getImplementation()).getBaseModel();
        ontModel.removeSubModel(m); 
        
        ontologies.remove( ontology );
        
        for(Iterator i = ontology.getImports().iterator(); i.hasNext(); ) {
            OWLOntology importOnt = (OWLOntology) i.next();
            
            Set importees = (Set) importDependencies.get( importOnt );
            if( importees != null ) {
                importees.remove( ontology );
                if( importees.isEmpty() ) {
                    importDependencies.remove( importOnt );
                    unload( importOnt );
                }
            }
        }
    }

    public OWLOntology read(String uri) throws FileNotFoundException, URISyntaxException {
        return reader.read(this, new URI(uri));
    }
    
    public OWLOntology read(URI uri) throws FileNotFoundException {
        return reader.read(this, uri);
    }

    public OWLOntology read(Reader in, URI baseURI) {
        return reader.read(this, in, baseURI);
    }    
    
    public OWLOntology read(InputStream in, URI baseURI) {
        return reader.read(this, in, baseURI);
    }    

    public OWLReader getReader() {
        return reader;
    }
    
    public QNameProvider getQNames() {
        return qnames;
    }

    protected OWLDataValue wrapDataValue(Literal l) {
        return new OWLDataValueImpl(l);
    }

    protected OWLIndividual wrapIndividual(Resource r) {
        for(Iterator i = ontologies.iterator(); i.hasNext(); ) {
            OWLOntology ont = (OWLOntology) i.next();
            if(((OntModel) ont.getImplementation()).containsResource(r))
                return new OWLIndividualImpl(ont, r);
        }
        
        return ((OWLOntologyImpl) baseOntology).wrapIndividual(r);
    }

    protected OWLClass wrapClass(Resource r) {
        OWLOntology ont = (OWLOntology) modelMap.get(r.getModel());
        
        if(ont == null)
            ont = baseOntology;
        
        return new OWLClassImpl(ont, r);
    }
    
    protected OWLObjectProperty wrapObjectProperty(Property p) {
        OWLOntology ont = (OWLOntology) modelMap.get(p.getModel());
        
        if(ont == null)
            ont = baseOntology;
        
        return new OWLObjectPropertyImpl(ont, p);
    }
    
    protected OWLDataProperty wrapDataProperty(Property p) {
        OWLOntology ont = (OWLOntology) modelMap.get(p.getModel());
        
        if(ont == null)
            ont = baseOntology;
        
        return new OWLDataPropertyImpl(ont, p);
    }

    public OWLClass createClass(URI uri) {
        return baseOntology.createClass(uri);
    }

    public OWLObjectProperty createObjectProperty(URI uri) {
        return baseOntology.createObjectProperty(uri);
    }

    public OWLDataProperty createDataProperty(URI uri) {
        return baseOntology.createDataProperty(uri);
    }

    public OWLIndividual createIndividual(URI uri) {
        return baseOntology.createIndividual(uri);
    }
    
    public OWLIndividual createInstance(OWLClass c) {
        return baseOntology.createInstance(c);
    }

    public OWLIndividual createInstance(OWLClass c, URI uri) {
        return baseOntology.createInstance(c, uri);
    }

    public OWLDataValue createDataValue(String value) {
        return baseOntology.createDataValue(value);
    }

    public OWLDataValue createDataValue(String value, String language) {
        return baseOntology.createDataValue(value, language);
    }

    public OWLDataValue createDataValue(Object value, URI datatypeURI) {
        return baseOntology.createDataValue(value, datatypeURI);
    }
    
    public OWLDataValue createDataValue(Object value) {
        return baseOntology.createDataValue(value);
    }

    public void setReader(OWLReader reader) {
        this.reader = reader;
    }

    public void refresh() {
        ontModel.rebind();
    }
    

    public void setProperty(OWLIndividual ind, OWLDataProperty prop, String value) {
        baseOntology.setProperty(ind, prop, value);
    }

    public void setProperty(OWLIndividual ind, OWLDataProperty prop, Object value) {
        baseOntology.setProperty(ind, prop, value);
    }
    
    public void setProperty(OWLIndividual ind, OWLDataProperty prop, OWLDataValue value) {
        baseOntology.setProperty(ind, prop, value);
    }

    
    public void addProperty(OWLIndividual ind, OWLProperty prop, OWLValue value) {
        baseOntology.addProperty(ind, prop, value);
    }
    
    public void addProperty(OWLIndividual ind, OWLDataProperty prop, OWLDataValue value) {
        baseOntology.addProperty(ind, prop, value);
    }

    public void addProperty(OWLIndividual ind, OWLDataProperty prop, String value) {
        baseOntology.addProperty(ind, prop, value);
    }
    
    public void addProperty(OWLIndividual ind, OWLDataProperty prop, Object value) {
        baseOntology.addProperty(ind, prop, value);
    }
    
    public void removeProperties(OWLIndividual ind, OWLProperty prop) {
        baseOntology.removeProperties(ind, prop);
    }

    public void addProperty(OWLIndividual ind, OWLObjectProperty prop, OWLIndividual value) {
        baseOntology.addProperty(ind, prop, value);
    }

    public void setProperty(OWLIndividual ind, OWLObjectProperty prop, OWLIndividual value) {
        baseOntology.setProperty(ind, prop, value);
    }


    public void addType(OWLIndividual ind, OWLClass c) {
        baseOntology.addType(ind, c);
    }

    public void removeTypes(OWLIndividual ind) {
        baseOntology.removeTypes(ind);
    }

    /* (non-Javadoc)
     * @see org.mindswap.owl.OWLKnowledgeBase#getAutoConsistency()
     */
    public boolean getAutoConsistency() {
        return autoConsistency;
    }

    /* (non-Javadoc)
     * @see org.mindswap.owl.OWLKnowledgeBase#setAutoConsistency(boolean)
     */
    public void setAutoConsistency(boolean auto) {
        autoConsistency = auto;
    }
  
    public boolean getAutoTranslate() {
        return (translator != null);
    }
    
    public void setAutoTranslate(boolean auto) {
        if(auto)
            translator = OWLSFactory.createVersionTranslator();
        else
            translator = null;
    }

    public OWLKnowledgeBase getTranslationSource() {
        return translationSource;
    }

    public Service readService(String uri) throws FileNotFoundException, URISyntaxException {
        return readService(new URI(uri));
    }
    
    public Service readService(URI uri) throws FileNotFoundException {
        List list = readAllServices(uri);
        
        return (list == null || list.isEmpty()) ? null : (Service) list.get(0);
    }
    
    public Service readService(Reader in, URI baseURI) {
        List list = readAllServices(in, baseURI);
        
        return (list == null || list.isEmpty()) ? null : (Service) list.get(0);
    }

    public Service readService(InputStream in, URI baseURI) {
        List list = readAllServices(in, baseURI);
        
        return (list == null || list.isEmpty()) ? null : (Service) list.get(0);
    }

    public List readAllServices(String uri) throws FileNotFoundException, URISyntaxException {
        return readAllServices(new URI(uri));
    }
    
    public List readAllServices(URI uri) throws FileNotFoundException {
        OWLOntology ont = read(uri);

        return (ont == null) ? null : ont.getServices();
    }
    
    public List readAllServices(Reader in, URI baseURI) {
        OWLOntology ont = read(in, baseURI);

        return (ont == null) ? null : ont.getServices();
    }

    public List readAllServices(InputStream in, URI baseURI) {
        OWLOntology ont = read(in, baseURI);

        return (ont == null) ? null : ont.getServices();
    }
    
    /**
     * @deprecated Use createOntology() instead
     */
    public org.mindswap.owls.OWLSOntology createOWLSOntology() {
        return (org.mindswap.owls.OWLSOntology) createOntology();
    }
 
    /**
     * @deprecated Use createOntology(URI) instead
     */
    public org.mindswap.owls.OWLSOntology createOWLSOntology(URI uri) {
        return (org.mindswap.owls.OWLSOntology) createOntology(uri);
    }

}
