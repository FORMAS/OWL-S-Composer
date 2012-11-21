/*
 * Created on Dec 28, 2004
 */
package impl.swrl;

import org.mindswap.owl.OWLIndividual;
import org.mindswap.owl.OWLValue;
import org.mindswap.owl.list.RDFList;
import org.mindswap.owl.vocabulary.RDF;
import org.mindswap.owl.vocabulary.SWRL;
import org.mindswap.swrl.BuiltinAtom;
import org.mindswap.swrl.SWRLDataObject;
import org.mindswap.swrl.SWRLObject;

/**
 * @author Evren Sirin
 *
 */
public class BuiltinAtomImpl extends AtomImpl implements BuiltinAtom {
    public BuiltinAtomImpl(OWLIndividual ind) {
        super(ind);
    }

    public OWLIndividual getBuiltin() {
        return getProperty(SWRL.builtin);
    }
    
    public void setBuiltin(OWLIndividual builtin) {
        setProperty(SWRL.builtin, builtin);
    }
        
    public int getArgumentCount() {
        // TODO extend this to other built-ins
        return 2;
    }
    
    private RDFList getArguments() {
       OWLIndividual args = getProperty(SWRL.arguments);
       
       return (args == null) ? null : (RDFList) args.castTo( RDFList.class ); 
    }

    public SWRLObject getArgument( int index ) {
        RDFList args = getArguments();
        
        if( args == null ) return null;
        
        OWLValue arg = args.getValue( index );

        if( arg == null ) return null;

        return (SWRLDataObject) arg.castTo( SWRLDataObject.class );
    }    
    
    public void addArgument( SWRLObject arg ) {
        if(!(arg instanceof SWRLDataObject))
            throw new IllegalArgumentException("BuiltinAtom argument should be a SWRLDataObject");
        
        RDFList args = getArguments();
        
        if( args == null ) {
            RDFList nil = getOntology().createList( RDF.ListVocabulary );
            args = nil.insert( arg );
            setProperty(SWRL.arguments, args);
        }
        else 
            args.add( arg );        
    }

    public void setArgument(int index, SWRLObject arg) {
        if(!(arg instanceof SWRLDataObject))
            throw new IllegalArgumentException("BuiltinAtom argument should be a SWRLDataObject");
        
        RDFList args = getArguments();
        
        if( args == null ) {
            if( index == 0 ) {
                RDFList nil = getOntology().createList( RDF.ListVocabulary );
                args = nil.insert( arg );
                setProperty(SWRL.arguments, args);
            }
            else
                throw new IndexOutOfBoundsException();
        }
        else {
            args.set( index, arg );
        }
    }  
    
    public String toString() {
        OWLIndividual builtin = getBuiltin();
        if(builtin == null)
            return "Missing_class_predicate";
        
        StringBuffer str = new StringBuffer();
        str.append( builtin.getLocalName() ).append( "(" );
        for(int i = 0; i < getArgumentCount(); i++) {
            SWRLObject arg = getArgument( i );
            if( i > 0 )
                str.append( ", " );
            str.append( arg );
        }
        str.append(")");
        
        return str.toString();
    }
}
