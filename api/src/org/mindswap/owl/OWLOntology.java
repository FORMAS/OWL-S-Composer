/*
 * Created on Nov 20, 2004
 */
package org.mindswap.owl;

import java.io.OutputStream;
import java.io.Writer;
import java.net.URI;
import java.util.Set;

import org.mindswap.owls.service.Service;

/**
 * @author Evren Sirin
 */
public interface OWLOntology extends OWLModel {    
    public URI getURI();
    public void setURI(URI uri);
    
    public URI getFileURI();
    public void setFileURI(URI uri);
        
    public OWLKnowledgeBase getKB();
        
    public Set getImports();   
    public Set getImports(boolean direct);
    public void setImports(Set imports); 
    public void addImport(OWLOntology ontology);
    
	
    /**
     * If this OWL-S ontology was translated from an older version of OWL-S 
     * (using <code>OWLSVersionTranslator</code>) then this function will return a
     * reference to the original ontology. This way the information that 
     * might have been lost during translation, e.g. non-OWL-S descriptions
     * in the original file, can still be accessed. If the ontology
     * originally belongs to the latest version then this function will 
     * return a reference to itself.
     * 
     * @return
     */
    public OWLOntology getTranslationSource();

    public void setTranslationSource(OWLOntology ontology);

    public Service getService();    

    /**
     * 
     * 
     * @param value
     * @return
     */
	public OWLIndividual parseLiteral(String literal);
            
    public OWLWriter getWriter();
	public void write(Writer writer);	
	public void write(Writer writer, URI baseURI);	
	public void write(OutputStream out);	
	public void write(OutputStream out, URI baseURI);
}
