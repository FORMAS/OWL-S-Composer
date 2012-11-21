/*
 * Created on Aug 30, 2004
 */
package impl.owls.process;


import impl.owl.CastingList;

import java.net.URI;

import org.mindswap.owl.OWLIndividualList;
import org.mindswap.owls.process.Binding;
import org.mindswap.owls.process.BindingList;

/**
 * @author Evren Sirin
 */
public class BindingListImpl extends CastingList implements BindingList {
    public BindingListImpl() {
        super(Binding.class);
    }
    
    public BindingListImpl(OWLIndividualList list) {
        super(list, Binding.class);
    }

    public Binding bindingAt(int index) {
         return (Binding) get(index);
    }

    public Binding getBinding(URI bindingURI) {
        return (Binding) getIndividual(bindingURI);
    }

}
