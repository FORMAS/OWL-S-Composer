/*
 * Created on Aug 26, 2004
 */
package impl.owls.process;

import java.util.ArrayList;
import java.util.List;

import org.mindswap.owl.OWLIndividual;
import org.mindswap.owls.OWLSFactory;
import org.mindswap.owls.process.Input;
import org.mindswap.owls.process.InputBinding;
import org.mindswap.owls.process.InputBindingList;
import org.mindswap.owls.process.Parameter;
import org.mindswap.owls.process.ParameterValue;
import org.mindswap.owls.process.Perform;
import org.mindswap.owls.process.Process;
import org.mindswap.owls.process.ProcessList;
import org.mindswap.owls.process.ValueOf;
import org.mindswap.owls.vocabulary.OWLS;

/**
 * @author Evren Sirin
 */
public class PerformImpl extends ControlConstructImpl implements Perform {
	public PerformImpl(OWLIndividual ind) {
		super(ind);
	}
	
	public void addBinding(Input input, ParameterValue paramValue) {
	    InputBinding binding = getOntology().createInputBinding();
	    binding.setParameter(input);
	    binding.setValue(paramValue);
	    
	    addBinding(binding);
	}
	
	public void addBinding(Input input, Perform perform, Parameter param) {
	    ValueOf valueOf = getOntology().createValueOf();
	    valueOf.setPerform(perform);
	    valueOf.setParameter(param);
	    
	    addBinding(input, valueOf);	    
	}
	
	public void addBinding(InputBinding binding) {
	    addProperty(OWLS.Process.hasDataFrom, binding);
	}
	
	/* (non-Javadoc)
	 * @see org.mindswap.owls.process.Perform#getBindings()
	 */
	public InputBindingList getBindings() {
		return OWLSFactory.createInputBindingList(getProperties(OWLS.Process.hasDataFrom));
	}

	/* (non-Javadoc)
	 * @see org.mindswap.owls.process.Perform#getProcess()
	 */
	public Process getProcess() {
		return (Process) getPropertyAs(OWLS.Process.process, Process.class);
	}

    /* (non-Javadoc)
     * @see org.mindswap.owls.process.Perform#setProcess(org.mindswap.owls.process.Process)
     */
    public void setProcess(Process process) {
        setProperty(OWLS.Process.process, process);       
    }

	public List getConstructs() {
	    return new ArrayList();
	}
	
	public ProcessList getAllProcesses() {
		ProcessList list = new ProcessListImpl();
		list.add(getProcess());
		
		return list;
	}

    public String getConstructName() {
        return "Perform";
    }
 }
