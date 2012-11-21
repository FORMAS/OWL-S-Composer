/*
 * Created on Aug 30, 2004
 */
package impl.owls.process;

import org.mindswap.owl.OWLIndividual;
import org.mindswap.owls.process.Iterate;

/**
 * @author Evren Sirin
 */
public abstract class IterateImpl extends ControlConstructImpl implements Iterate {
    public IterateImpl(OWLIndividual ind) {
        super(ind);
    } 
}
