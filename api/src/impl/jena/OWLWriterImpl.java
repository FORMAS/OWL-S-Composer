/*
 * Created on Dec 12, 2004
 */
package impl.jena;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.mindswap.owl.OWLClass;
import org.mindswap.owl.OWLOntology;
import org.mindswap.owl.OWLWriter;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.RDFWriter;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.vocabulary.RDFSyntax;

/**
 * @author Evren Sirin
 */
public class OWLWriterImpl implements OWLWriter {
    private List prettyTypes;
    private Map prefixMap;
    
    private Charset defaultCharset;
    
    public OWLWriterImpl() {
        prettyTypes = new ArrayList();
        prefixMap = new HashMap();
        
        defaultCharset = Charset.forName("UTF8");
    }
    
    private void write(Model model, Writer out, URI baseURI) {
		RDFWriter writer = model.getWriter("RDF/XML-ABBREV");
		// we don't want literals to be used as attributes
		writer.setProperty("blockRules", new Resource[] {RDFSyntax.propertyAttr, RDFSyntax.sectionListExpand});
		// show xml header <?xml version="..." ...?>
		writer.setProperty("showXmlDeclaration", "true");
		
//		writer.setProperty("allowBadURIs", Boolean.TRUE);
		
		for(Iterator i = prefixMap.entrySet().iterator(); i.hasNext(); ) {
		    Map.Entry entry = (Map.Entry) i.next();
		    model.setNsPrefix(entry.getKey().toString(), entry.getValue().toString());
		}
		
		if(baseURI != null) {
		    writer.setProperty("xmlbase", baseURI.toString());
		    model.setNsPrefix("", baseURI.toString());
		}
		
		writer.setProperty("prettyTypes", prettyTypes.toArray(new Resource[prettyTypes.size()]));
		
		writer.write(model, out, "");
    }


    /* (non-Javadoc)
     * @see org.mindswap.owl.OWLWriter#setNsPrefix(java.lang.String, java.net.URI)
     */
    public void setNsPrefix(String prefix, String uri) {
        prefixMap.put(prefix, uri.toString());
    }

    /* (non-Javadoc)
     * @see org.mindswap.owl.OWLWriter#addPrettyType(org.mindswap.owl.OWLClass)
     */
    public void addPrettyType(OWLClass c) {
        prettyTypes.add(c.getImplementation());
    }

    
    /* (non-Javadoc)
     * @see org.mindswap.owl.OWLWriter#write(org.mindswap.owl.OWLOntology, java.io.Writer)
     */
    public void write(OWLOntology ont, Writer writer) {
        write(((OWLOntologyImpl) ont).getOntModel(), writer, null); 
    }
    
    /* (non-Javadoc)
     * @see org.mindswap.owl.OWLWriter#write(org.mindswap.owl.OWLOntology, java.io.Writer, java.net.URI)
     */
    public void write(OWLOntology ont, Writer writer, URI baseURI) {
        write(((OWLOntologyImpl) ont).getOntModel(), writer, baseURI);
    }

    /* (non-Javadoc)
     * @see org.mindswap.owl.OWLWriter#write(org.mindswap.owl.OWLOntology, java.io.OutputStream)
     */
    public void write(OWLOntology ont, OutputStream out) {
        write(((OWLOntologyImpl) ont).getOntModel(), new OutputStreamWriter(out, defaultCharset), null);
    }

    /* (non-Javadoc)
     * @see org.mindswap.owl.OWLWriter#write(org.mindswap.owl.OWLOntology, java.io.OutputStream, java.net.URI)
     */
    public void write(OWLOntology ont, OutputStream out, URI baseURI) {
        write(((OWLOntologyImpl) ont).getOntModel(), new OutputStreamWriter(out, defaultCharset), baseURI);
    }
}
