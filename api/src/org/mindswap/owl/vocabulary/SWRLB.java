/*
 * Created on Jul 31, 2004
 */
package org.mindswap.owl.vocabulary;

import org.mindswap.owl.EntityFactory;
import org.mindswap.owl.OWLIndividual;
import org.mindswap.utils.URIUtils;

/**
 * @author Evren Sirin
 */
public class SWRLB {
	public final static String URI = "http://www.w3.org/2003/11/swrlb#";
	
	public final static OWLIndividual equal =
		EntityFactory.createIndividual(URIUtils.createURI(URI + "equal"));
    public final static OWLIndividual notEqual =
    	EntityFactory.createIndividual(URIUtils.createURI(URI + "notEqual"));
    public final static OWLIndividual lessThan =
    	EntityFactory.createIndividual(URIUtils.createURI(URI + "lessThan"));
    public final static OWLIndividual lessThanOrEqual =
    	EntityFactory.createIndividual(URIUtils.createURI(URI + "lessThanOrEqual"));
    public final static OWLIndividual greaterThan =
    	EntityFactory.createIndividual(URIUtils.createURI(URI + "greaterThan"));
    public final static OWLIndividual greaterThanOrEqual =
    	EntityFactory.createIndividual(URIUtils.createURI(URI + "greaterThanOrEqual"));
}
