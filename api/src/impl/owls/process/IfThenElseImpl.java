/*
 * Created on Aug 30, 2004
 */
package impl.owls.process;

import java.util.ArrayList;
import java.util.List;

import org.mindswap.owl.OWLIndividual;
import org.mindswap.owls.process.Condition;
import org.mindswap.owls.process.ControlConstruct;
import org.mindswap.owls.process.IfThenElse;
import org.mindswap.owls.process.ProcessList;
import org.mindswap.owls.vocabulary.OWLS;

/**
 * @author Evren Sirin
 */
public class IfThenElseImpl extends ControlConstructImpl implements IfThenElse {
    public IfThenElseImpl(OWLIndividual ind) {
        super(ind);
    }

    public ControlConstruct getThen() {
        return (ControlConstruct) getPropertyAs(OWLS.Process.thenP, ControlConstruct.class);
    }

    public ControlConstruct getElse() {
        return (ControlConstruct) getPropertyAs(OWLS.Process.elseP, ControlConstruct.class);
    }

	public Condition getCondition() {
	    return (Condition) getPropertyAs(OWLS.Process.ifCondition, Condition.class);
	}

	public void setCondition(Condition condition) {
	    setProperty(OWLS.Process.ifCondition, condition);
	}

    public void setThen(ControlConstruct cc) {
        setProperty(OWLS.Process.thenP, cc);
    }

    public void setElse(ControlConstruct cc) {
        setProperty(OWLS.Process.elseP, cc);
    }
	
	public List getConstructs() {
	    ControlConstruct thenP = getThen();
	    ControlConstruct elseP = getElse();
	    
	    List list = new ArrayList();
	    list.add(thenP);
	    if(elseP != null) list.add(elseP);
	    return list;
	}
	
	public ProcessList getAllProcesses() {
	    ControlConstruct thenP = getThen();
	    ControlConstruct elseP = getElse();
	    
		ProcessList list = new ProcessListImpl();
		list.addAll(thenP.getAllProcesses());
		if(elseP != null) list.addAll(elseP.getAllProcesses());
		
		return list;
	}	
	
    public String getConstructName() {
        return "If-Then-Else";
    }

    
}
