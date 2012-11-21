/*
 * Created on Jan 4, 2005
 */
package impl.owls.process;

import java.util.ArrayList;
import java.util.List;

import org.mindswap.owl.OWLIndividual;
import org.mindswap.owls.process.OutputBinding;
import org.mindswap.owls.process.ProcessList;
import org.mindswap.owls.process.Produce;
import org.mindswap.owls.vocabulary.OWLS;

/**
 * @author Evren Sirin
 *
 */
public class ProduceImpl extends ControlConstructImpl implements Produce {
    public ProduceImpl(OWLIndividual ind) {
        super(ind);
    }

    public OutputBinding getBinding() {
        return (OutputBinding) getPropertyAs(OWLS.Process.producedBinding, OutputBinding.class);
    }

    public void setBinding(OutputBinding binding) {
        setProperty(OWLS.Process.producedBinding, binding);
    }
    
	public List getConstructs() {
	    return new ArrayList();
	}
    
	public ProcessList getAllProcesses() {
		return new ProcessListImpl();
	}
	
    public String getConstructName() {
        return "Produce";
    }

}
