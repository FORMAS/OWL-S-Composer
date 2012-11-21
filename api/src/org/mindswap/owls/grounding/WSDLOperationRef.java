/*
 * Created on Dec 17, 2004
 */
package org.mindswap.owls.grounding;

import java.net.URI;

import org.mindswap.owl.OWLIndividual;

/**
 * @author Evren Sirin
 *
 */
public interface WSDLOperationRef extends OWLIndividual {
	public void setOperation(URI op);
	public URI getOperation();
	
	public void setPortType(URI port);
	public URI getPortType();	
}
