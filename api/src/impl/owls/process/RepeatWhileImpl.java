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
import org.mindswap.owls.process.RepeatWhile;
import org.mindswap.owls.vocabulary.OWLS;

/**
 * @author Evren Sirin
 */
public class RepeatWhileImpl extends IterateImpl implements RepeatWhile {  
    public RepeatWhileImpl(OWLIndividual ind) {
        super(ind);
    }
    
	public Condition getCondition() {
	    return (Condition) getPropertyAs(OWLS.Process.whileCondition, Condition.class);
	}
		
	public void setCondition(Condition condition) {
	    setProperty(OWLS.Process.whileCondition, condition);
	}
	
	public ControlConstruct getComponent() {
	    return (ControlConstruct) getPropertyAs(OWLS.Process.whileProcess, ControlConstruct.class);	    
	}
	
    public void setComponent(ControlConstruct component) {
        setProperty(OWLS.Process.whileProcess, component);
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
        return "Repeat-While";
    }
}
