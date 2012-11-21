/*
 * Created on Dec 10, 2004
 */
package impl.jena;

import java.io.OutputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.net.URI;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.mindswap.exceptions.NotImplementedException;
import org.mindswap.owl.OWLClass;
import org.mindswap.owl.OWLDataProperty;
import org.mindswap.owl.OWLDataValue;
import org.mindswap.owl.OWLEntity;
import org.mindswap.owl.OWLFactory;
import org.mindswap.owl.OWLIndividual;
import org.mindswap.owl.OWLIndividualList;
import org.mindswap.owl.OWLKnowledgeBase;
import org.mindswap.owl.OWLObjectProperty;
import org.mindswap.owl.OWLOntology;
import org.mindswap.owl.OWLProperty;
import org.mindswap.owl.OWLValue;
import org.mindswap.owl.OWLWriter;
import org.mindswap.owl.vocabulary.SWRL;
import org.mindswap.owls.service.Service;
import org.mindswap.owls.vocabulary.OWLS;
import org.mindswap.utils.URIUtils;

import com.hp.hpl.jena.datatypes.xsd.XSDDatatype;
import com.hp.hpl.jena.rdf.model.Literal;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.vocabulary.OWL;
import com.hp.hpl.jena.vocabulary.RDF;

/**
 * @author Evren Sirin
 */
public class OWLOntologyImpl extends OWLModelImpl implements OWLOntology, org.mindswap.owls.OWLSOntology {
    private OWLKnowledgeBase kb;
            
    private OWLIndividual ontResource;
    
    protected OWLWriter writer;
    
    private URI uri;
    private URI fileURI;
    
    private Set imports;
    
    private OWLOntology sourceOntology;
    
    public OWLOntologyImpl(OWLKnowledgeBase kb, URI uri, URI fileURI, Model jenaModel) {
        super(jenaModel);        
        super.setBaseOntology(this);
        
        this.uri = uri;
        this.fileURI = fileURI;
        this.kb = kb;
        
        imports = new HashSet();
        
        sourceOntology = this;        
    }
    
    public OWLKnowledgeBase getKB() {
        return kb;
    }

    public Set getImports() {
        return imports;
    }

    public Set getImports(boolean direct) {    
        if(!direct)
            throw new NotImplementedException();
        
        return imports;
    }

    public void addImport(OWLOntology ontology) {
        imports.add(ontology);
    }    
    

    public void addImports(Set imports) {
        this.imports.addAll(imports);
    }

    public OWLClass createClass(URI uri) {
        OWLClass c = getClass(uri);
        
        if(c == null) {
            Resource r = asResource(uri);
            ontModel.add(r, RDF.type, OWL.Class);
            kb.refresh();
            
            c = new OWLClassImpl(this, r);
        }
        
        return c;
    }

    public OWLObjectProperty createObjectProperty(URI uri) {
        OWLObjectProperty c = getObjectProperty(uri);
        
        if(c == null) {
            Property r = asProperty(uri);
            ontModel.add(r, RDF.type, OWL.ObjectProperty);
            kb.refresh();
            
            c = new OWLObjectPropertyImpl(this, r);
        }
        
        return c;
    }

    public OWLDataProperty createDataProperty(URI uri) {
        OWLDataProperty c = getDataProperty(uri);
        
        if(c == null) {
            Property r = asProperty(uri);
            ontModel.add(r, RDF.type, OWL.DatatypeProperty);
            kb.refresh();
            
            c = new OWLDataPropertyImpl(this, r);
        }
        
        return c;
    }

    public OWLIndividual createIndividual(URI uri) {
        OWLIndividual ind = getIndividual(uri);
        
        if(ind == null) {
	        Resource r = asResource(uri);
	        ind = new OWLIndividualImpl(this, r);
	        
	        kb.refresh();
        }
                        
        return ind;
    }
    
    public OWLIndividual createInstance(OWLClass c) {
        Resource r = ontModel.createResource();
        ontModel.add(r, RDF.type, (Resource) c.getImplementation());
        OWLIndividual ind = new OWLIndividualImpl(this, r);
        kb.refresh();
                        
        return ind;
    }

    public OWLIndividual createInstance(OWLClass c, URI uri) {
        Resource r = asResource(uri);
        ontModel.add(r, RDF.type, (Resource) c.getImplementation());
        OWLIndividual ind = new OWLIndividualImpl(this, r);
        kb.refresh();
                        
        return ind;
    }

	public OWLDataValue createDataValue(String value) {
	    return new OWLDataValueImpl(ontModel.createLiteral(value));
	}
	
	public OWLDataValue createDataValue(String value, String language) {
		return new OWLDataValueImpl(ontModel.createLiteral(value, language));
	}	
	
	public OWLDataValue createDataValue(Object value, URI datatypeURI) {
	    if(datatypeURI.equals(org.mindswap.owl.vocabulary.RDF.XMLLiteral))
            return new OWLDataValueImpl(ontModel.createLiteral(value.toString(), true));
        else 
            return new OWLDataValueImpl(ontModel.createTypedLiteral(value, datatypeURI.toString()));        
	}
	
	public OWLDataValue createDataValue(Object value) {
	    if(value instanceof URI)
            return new OWLDataValueImpl(ontModel.createTypedLiteral(value, XSDDatatype.XSDanyURI));
        else 
            return new OWLDataValueImpl(ontModel.createTypedLiteral(value));        
	}
	
    public URI getURI() {
        return uri;
    }

    public URI getFileURI() {
        return fileURI;
    }

    /* (non-Javadoc)
     * @see org.mindswap.owl.OWLObject#debugString()
     */
    public String debugString() {
        return "Ontology (" + uri + ")";
    }

    /* (non-Javadoc)
     * @see org.mindswap.owl.OWLOntology#getOntologyObject()
     */
    public OWLEntity getOntologyObject() {
        return ontResource;
    }

    /* (non-Javadoc)
     * @see org.mindswap.owl.OWLOntology#asSingletonKB()
     */
    public OWLKnowledgeBase asKB() {
        return asKB(true);
    }

    /* (non-Javadoc)
     * @see org.mindswap.owl.OWLOntology#asSingletonKB(boolean)
     */
    public OWLKnowledgeBase asKB(boolean withImports) {
        OWLKnowledgeBase kb = OWLFactory.createKB();
        kb.load(this, withImports);
        
        return kb;
        
    }

    protected OWLDataValue wrapDataValue(Literal l) {
        return new OWLDataValueImpl(l);
    }

    protected OWLIndividual wrapIndividual(Resource r) {
        return new OWLIndividualImpl(this, r);
    }

    protected OWLClass wrapClass(Resource r) {
        return new OWLClassImpl(this, r);
    }

    protected OWLObjectProperty wrapObjectProperty(Property p) {
        return new OWLObjectPropertyImpl(this, p);
    }
    
    protected OWLDataProperty wrapDataProperty(Property p) {
        return new OWLDataPropertyImpl(this, p);
    }

    public OWLWriter getWriter() {
        if( writer == null ){
            writer = OWLFactory.createWriter();
    		writer.setNsPrefix("service", OWLS.Service.URI);
    		writer.setNsPrefix("profile", OWLS.Profile.URI);
    		writer.setNsPrefix("process", OWLS.Process.URI);
    		writer.setNsPrefix("grounding", OWLS.Grounding.URI);
    		writer.setNsPrefix("expression", OWLS.Expression.URI);
    		writer.setNsPrefix("swrl", SWRL.URI);
    		writer.setNsPrefix("list", URIUtils.getNameSpace(OWLS.ObjList.List().getURI().toString()));
    				
    		writer.addPrettyType(OWLS.Service.Service);
    		writer.addPrettyType(OWLS.Service.ServiceGrounding);
    		writer.addPrettyType(OWLS.Profile.Profile);
    	    writer.addPrettyType(OWLS.Process.Process);
    	    writer.addPrettyType(OWLS.Process.AtomicProcess);
    	    writer.addPrettyType(OWLS.Process.CompositeProcess);
    	    writer.addPrettyType(OWLS.Process.SimpleProcess);
    	    writer.addPrettyType(OWLS.Process.Perform);
    	    writer.addPrettyType(OWLS.Grounding.WsdlGrounding);
    	    writer.addPrettyType(OWLS.Grounding.WsdlAtomicProcessGrounding);
        }
        
        return writer;
    }
    
    public void write(Writer out) {
        getWriter().write(this, out);
    }
    
    public void write(Writer out, URI baseURI) {
        getWriter().write(this, out, baseURI);
    }
    
    public void write(OutputStream out) {
        getWriter().write(this, out);
    }

    public void write(OutputStream out, URI baseURI) {
        getWriter().write(this, out, baseURI);
    }

    public String toString() {
        if(uri == null)
            return "Ontology()";
        
        return "Ontology(" + uri + ")";
    }

    public void setURI(URI uri) {
        this.uri = uri;
        
        if(uri != null)
            ontResource = new OWLIndividualImpl(this, ontModel.getResource(uri.toString()));
    }

    public void setFileURI(URI uri) {
        this.fileURI = uri;
    }

//    public void setKB(OWLKnowledgeBase kb) {
//        this.kb = kb;
//    }

    public void setImports(Set imports) {
        this.imports = imports;
    }
    
    public void refresh() {
        ontModel.rebind();
        kb.refresh();
    }

    public void setProperty(OWLIndividual ind, OWLDataProperty prop, String value) {
        setProperty(ind, prop, createDataValue(value));
    }

    public void setProperty(OWLIndividual ind, OWLDataProperty prop, Object value) {
        setProperty(ind, prop, createDataValue(value));
    }
    
    public void setProperty(OWLIndividual ind, OWLDataProperty prop, OWLDataValue value) {
        Resource subject = (Resource) ind.getImplementation();
        Property predicate = (Property) prop.getImplementation();
        Literal object = (Literal) value.getImplementation();
         
        ontModel.remove(ontModel.listStatements(subject, predicate, (Literal) null));
     	ontModel.add(subject, predicate, object);
     	kb.refresh();
    }
    
    public void addProperty(OWLIndividual ind, OWLProperty prop, OWLValue value) {
        if( prop instanceof OWLObjectProperty && value instanceof OWLIndividual )
            addProperty( ind, (OWLObjectProperty) prop, (OWLIndividual) value );
        else if( prop instanceof OWLDataProperty && value instanceof OWLDataValue )
            addProperty( ind, (OWLDataProperty) prop, (OWLDataValue) value );
        else
            throw new IllegalArgumentException();
    }

    public void addProperty(OWLIndividual ind, OWLDataProperty prop, OWLDataValue value) {
     	ontModel.add(
			(Resource) ind.getImplementation(),
			(Property) prop.getImplementation(),
			(Literal)  value.getImplementation());
     	kb.refresh();
    }
    

    public void addProperty(OWLIndividual ind, OWLDataProperty prop, String value) {
        addProperty(ind, prop, createDataValue(value));
    }
    
    public void addProperty(OWLIndividual ind, OWLDataProperty prop, Object value) {
        addProperty(ind, prop, createDataValue(value));
    }

    public void removeProperties(OWLIndividual ind, OWLProperty prop) {
        Resource subject = (Resource) ind.getImplementation();
        Property predicate = (Property) prop.getImplementation();
         
        ontModel.remove(ontModel.listStatements(subject, predicate, (Resource) null));
        kb.refresh();
    }

    public void addProperty(OWLIndividual ind, OWLObjectProperty prop, OWLIndividual value) {
     	ontModel.add(
			(Resource) ind.getImplementation(),
			(Property) prop.getImplementation(),
			(Resource) value.getImplementation());
     	kb.refresh();
    }

    public void setProperty(OWLIndividual ind, OWLObjectProperty prop, OWLIndividual value) {
        Resource subject = (Resource) ind.getImplementation();
        Property predicate = (Property) prop.getImplementation();
        Resource object = (Resource) value.getImplementation();
         
        ontModel.remove(ontModel.listStatements(subject, predicate, (Resource) null));
     	ontModel.add(subject, predicate, object);
     	kb.refresh();
    }


    public void addType(OWLIndividual ind, OWLClass c) {
     	ontModel.add(
			(Resource) ind.getImplementation(),
			RDF.type,
			(Resource) c.getImplementation());
     	kb.refresh();
    }

    public void removeTypes(OWLIndividual ind) {
        Resource subject = (Resource) ind.getImplementation();
        
        ontModel.remove(ontModel.listStatements(subject, RDF.type, (Resource) null));      
        kb.refresh();
    }
    
    public OWLOntology getTranslationSource() {
        return sourceOntology;
    }
    
    public void setTranslationSource(OWLOntology ontology) {
        sourceOntology = ontology;
    }

    public Service getService() {
        List list = getServices();
        
        return list.isEmpty() ? null : (Service) list.get(0);
    }

    public OWLIndividual parseLiteral(String literal) {   
    	Reader in = new StringReader( literal );
	    OWLOntologyImpl ont = (OWLOntologyImpl) kb.read( in, uri );
	    OWLIndividualList instances = ont.getIndividuals();      
        for(int i = 0; i < instances.size(); i++) {
            OWLIndividual ind = (OWLIndividual) instances.get( i );
            if(ont.getIncomingProperties(ind).isEmpty())
                return ind;
        }
        return null;
    }
    
}
