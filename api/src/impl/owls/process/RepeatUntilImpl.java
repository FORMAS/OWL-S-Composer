/*
 * Created on Aug 30, 2004
 */
package impl.owls.process;

import java.util.ArrayList;
import java.util.List;

import org.mindswap.owl.OWLIndividual;
import org.mindswap.owls.process.Condition;
import org.mindswap.owls.process.ControlConstruct;
import org.mindswap.owls.process.ProcessList;
import org.mindswap.owls.process.RepeatUntil;
import org.mindswap.owls.vocabulary.OWLS;

/**
 * @author Evren Sirin
 */
public class RepeatUntilImpl extends IterateImpl implements RepeatUntil {  
    public RepeatUntilImpl(OWLIndividual ind) {
        super(ind);
    }
    
	public Condition getCondition() {
	    return (Condition) getPropertyAs(OWLS.Process.untilCondition, Condition.class);
	}
		
	public void setCondition(Condition condition) {
	    setProperty(OWLS.Process.untilCondition, condition);
	}
	
	public ControlConstruct getComponent() {
	    return (ControlConstruct) getPropertyAs(OWLS.Process.untilProcess, ControlConstruct.class);	    
	}

    public void setComponent(ControlConstruct component) {
        setProperty(OWLS.Process.untilProcess, component);
    }
    
	public List getConstructs() {
	    List list = new ArrayList();
	    list.add(getComponent());
	    return list;
	}
	
	public ProcessList getAllProcesses() {
		return getComponent().getAllProcesses();
	}	
		
    public String getConstructName() {
        return "Repeat-Until";
    }
}
