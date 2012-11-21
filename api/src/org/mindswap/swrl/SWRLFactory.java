/*
 * Created on Apr 6, 2005
 */
package org.mindswap.swrl;

import java.net.URI;

import org.mindswap.owl.OWLClass;
import org.mindswap.owl.OWLDataProperty;
import org.mindswap.owl.OWLObjectProperty;
import org.mindswap.owl.OWLOntology;

/**
 * @author Evren Sirin
 *
 */
public interface SWRLFactory {
    public OWLOntology getOntology();
    
    public AtomList createList();
    public AtomList createList(Atom atom);
    
    public ClassAtom createClassAtom(OWLClass c, SWRLIndividualObject arg);
    public IndividualPropertyAtom createIndividualPropertyAtom(OWLObjectProperty p, SWRLIndividualObject arg1, SWRLIndividualObject arg2);
    public DataPropertyAtom createDataPropertyAtom(OWLDataProperty p, SWRLIndividualObject arg1, SWRLDataObject arg2);
    public SameIndividualAtom createSameIndividualAtom(SWRLIndividualObject arg1, SWRLIndividualObject arg2);
    public DifferentIndividualsAtom createDifferentIndividualsAtom(SWRLIndividualObject arg1, SWRLIndividualObject arg2);
    
    public BuiltinAtom createEqual(SWRLDataObject arg1, SWRLDataObject arg2);
    public BuiltinAtom createNotEqual(SWRLDataObject arg1, SWRLDataObject arg2);
    public BuiltinAtom createLessThan(SWRLDataObject arg1, SWRLDataObject arg2);
    public BuiltinAtom createLessThanOrEqual(SWRLDataObject arg1, SWRLDataObject arg2);
    public BuiltinAtom createGreaterThan(SWRLDataObject arg1, SWRLDataObject arg2);
    public BuiltinAtom createGreaterThanOrEqual(SWRLDataObject arg1, SWRLDataObject arg2);
    
    public SWRLIndividualVariable createIndividualVariable(URI uri);
    public SWRLDataVariable createDataVariable(URI uri);
}
