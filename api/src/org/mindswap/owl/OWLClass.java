/*
 * Created on Nov 20, 2004
 */
package org.mindswap.owl;

import java.util.Set;

/**
 * @author Evren Sirin
 */
public interface OWLClass extends OWLEntity, OWLType {
	public boolean isSubClassOf(OWLClass c);
	
	public boolean isDisjoint(OWLClass c);

	public Set getSubClasses();
	
	public Set getSubClasses( boolean direct );

	public Set getSuperClasses();

	public Set getSuperClasses( boolean direct );

	public Set getEquivalentClasses();
	
	public boolean isEnumerated();
	
	public OWLIndividualList getEnumerations();
	
	public OWLIndividualList getInstances();    
}
