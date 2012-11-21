/*
 * Created on Aug 30, 2004
 */
package impl.owls.process;

import impl.owl.WrappedIndividual;

import org.mindswap.owl.OWLIndividual;
import org.mindswap.owls.process.Parameter;
import org.mindswap.owls.process.Perform;
import org.mindswap.owls.process.ValueOf;
import org.mindswap.owls.vocabulary.OWLS;

/**
 * @author Evren Sirin
 */
public class ValueOfImpl extends WrappedIndividual implements ValueOf {
    public ValueOfImpl(OWLIndividual ind) {
        super(ind);
    }

    /* (non-Javadoc)
     * @see org.mindswap.owls.process.ValueOf#getPerform()
     */
    public Perform getPerform() {
        return (Perform) getPropertyAs(OWLS.Process.fromProcess, Perform.class);
    }

    /* (non-Javadoc)
     * @see org.mindswap.owls.process.ValueOf#setPerform(org.mindswap.owls.process.Perform)
     */
    public void setPerform(Perform perform) {
       setProperty(OWLS.Process.fromProcess, perform);
    }

    /* (non-Javadoc)
     * @see org.mindswap.owls.process.ValueOf#getParameter()
     */
    public Parameter getParameter() {
        return (Parameter) getPropertyAs(OWLS.Process.theVar, Parameter.class);
    }

    /* (non-Javadoc)
     * @see org.mindswap.owls.process.ValueOf#setParameter(org.mindswap.owls.process.Parameter)
     */
    public void setParameter(Parameter param) {
        setProperty(OWLS.Process.theVar, param);
    }
}
