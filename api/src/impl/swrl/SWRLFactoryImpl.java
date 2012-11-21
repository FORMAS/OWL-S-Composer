/*
 * Created on Apr 6, 2005
 */
package impl.swrl;

import java.net.URI;

import org.mindswap.owl.OWLClass;
import org.mindswap.owl.OWLDataProperty;
import org.mindswap.owl.OWLObjectProperty;
import org.mindswap.owl.OWLOntology;
import org.mindswap.owl.vocabulary.SWRL;
import org.mindswap.owl.vocabulary.SWRLB;
import org.mindswap.swrl.Atom;
import org.mindswap.swrl.AtomList;
import org.mindswap.swrl.BuiltinAtom;
import org.mindswap.swrl.ClassAtom;
import org.mindswap.swrl.DataPropertyAtom;
import org.mindswap.swrl.DifferentIndividualsAtom;
import org.mindswap.swrl.IndividualPropertyAtom;
import org.mindswap.swrl.SWRLDataObject;
import org.mindswap.swrl.SWRLDataVariable;
import org.mindswap.swrl.SWRLFactory;
import org.mindswap.swrl.SWRLIndividualObject;
import org.mindswap.swrl.SWRLIndividualVariable;
import org.mindswap.swrl.SameIndividualAtom;

/**
 * @author Evren Sirin
 *
 */
public class SWRLFactoryImpl implements SWRLFactory {
    private OWLOntology ont;
    
    public SWRLFactoryImpl( OWLOntology ont ) {
        this.ont = ont;
    }
    
    public OWLOntology getOntology() {
        return ont;
    }
    
    public AtomList createList() {
        return (AtomList) ont.createList(SWRL.AtomListVocabulary).castTo(AtomList.class);
    }

    public AtomList createList(Atom atom) {
        return (AtomList) ont.createList(SWRL.AtomListVocabulary, atom).castTo(AtomList.class);
    }
    
    public SWRLIndividualVariable createIndividualVariable(URI uri) {
        return new SWRLIndividualVariableImpl(ont.createInstance(SWRL.Variable, uri));
    }
    
    public SWRLDataVariable createDataVariable(URI uri) {
        return new SWRLDataVariableImpl(ont.createInstance(SWRL.Variable, uri));
    }
    
    public ClassAtom createClassAtom(OWLClass c, SWRLIndividualObject arg) {
	    ClassAtom atom = (ClassAtom) ont.createInstance( SWRL.ClassAtom ).castTo( ClassAtom.class );
	    atom.setClassPredicate( c );
	    atom.setArgument1( arg );
	    
        return atom;
    }

    public IndividualPropertyAtom createIndividualPropertyAtom(OWLObjectProperty p, SWRLIndividualObject arg1, SWRLIndividualObject arg2) {
	    IndividualPropertyAtom atom = (IndividualPropertyAtom) 
			ont.createInstance( SWRL.IndividualPropertyAtom ).castTo( IndividualPropertyAtom.class );
	    atom.setPropertyPredicate( p );
	    atom.setArgument1( arg1 );
	    atom.setArgument2( arg2 );
	    
	    return atom;
    }

    public DataPropertyAtom createDataPropertyAtom(OWLDataProperty p, SWRLIndividualObject arg1, SWRLDataObject arg2) {
	    DataPropertyAtom atom = (DataPropertyAtom) 
    		ont.createInstance( SWRL.DatavaluedPropertyAtom ).castTo( DataPropertyAtom.class );
	    atom.setPropertyPredicate( p );
	    atom.setArgument1( arg1 );
	    atom.setArgument2( arg2 );
	    
	    return atom;
    }

    public SameIndividualAtom createSameIndividualAtom(SWRLIndividualObject arg1, SWRLIndividualObject arg2) {
        SameIndividualAtom atom = (SameIndividualAtom) 
			ont.createInstance( SWRL.SameIndividualAtom ).castTo( SameIndividualAtom.class );
	    atom.setArgument1( arg1 );
	    atom.setArgument2( arg2 );
	    
	    return atom;
    }

    public DifferentIndividualsAtom createDifferentIndividualsAtom(SWRLIndividualObject arg1, SWRLIndividualObject arg2) {
        DifferentIndividualsAtom atom = (DifferentIndividualsAtom) 
			ont.createInstance( SWRL.DifferentIndividualsAtom ).castTo( DifferentIndividualsAtom.class );
	    atom.setArgument1( arg1 );
	    atom.setArgument2( arg2 );
	    
	    return atom;
    }

    public BuiltinAtom createEqual(SWRLDataObject arg1, SWRLDataObject arg2) {
	    BuiltinAtom atom = (BuiltinAtom) ont.createInstance( SWRL.BuiltinAtom ).castTo( BuiltinAtom.class );
	    atom.setBuiltin( SWRLB.equal );
	    atom.setArgument( 0, arg1 );
	    atom.setArgument( 1, arg2 );
	    
	    return atom;
    }

    public BuiltinAtom createNotEqual(SWRLDataObject arg1, SWRLDataObject arg2) {
	    BuiltinAtom atom = (BuiltinAtom) ont.createInstance( SWRL.BuiltinAtom ).castTo( BuiltinAtom.class );
	    atom.setBuiltin( SWRLB.notEqual );
	    atom.setArgument( 0, arg1 );
	    atom.setArgument( 1, arg2 );
	    
	    return atom;
    }

    public BuiltinAtom createLessThan(SWRLDataObject arg1, SWRLDataObject arg2) {
	    BuiltinAtom atom = (BuiltinAtom) ont.createInstance( SWRL.BuiltinAtom, URI.create(SWRL.URI+"test") ).castTo( BuiltinAtom.class );
	    atom.setBuiltin( SWRLB.lessThan );
	    atom.setArgument( 0, arg1 );
	    atom.setArgument( 1, arg2 );
	    
	    return atom;
    }

    public BuiltinAtom createLessThanOrEqual(SWRLDataObject arg1, SWRLDataObject arg2) {
	    BuiltinAtom atom = (BuiltinAtom) ont.createInstance( SWRL.BuiltinAtom ).castTo( BuiltinAtom.class );
	    atom.setBuiltin( SWRLB.lessThanOrEqual );
	    atom.setArgument( 0, arg1 );
	    atom.setArgument( 1, arg2 );
	    
	    return atom;
    }

    public BuiltinAtom createGreaterThan(SWRLDataObject arg1, SWRLDataObject arg2) {
	    BuiltinAtom atom = (BuiltinAtom) ont.createInstance( SWRL.BuiltinAtom ).castTo( BuiltinAtom.class );
	    atom.setBuiltin( SWRLB.greaterThan );
	    atom.setArgument( 0, arg1 );
	    atom.setArgument( 1, arg2 );
	    
	    return atom;
    }

    public BuiltinAtom createGreaterThanOrEqual(SWRLDataObject arg1, SWRLDataObject arg2) {
	    BuiltinAtom atom = (BuiltinAtom) ont.createInstance( SWRL.BuiltinAtom ).castTo( BuiltinAtom.class );
	    atom.setBuiltin( SWRLB.greaterThanOrEqual );
	    atom.setArgument( 0, arg1 );
	    atom.setArgument( 1, arg2 );
	    
	    return atom;
    }

}
