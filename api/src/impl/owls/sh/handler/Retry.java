package impl.owls.sh.handler;

import impl.owls.sh.ObjectRequest;
import impl.owls.sh.SHHandler;

import org.mindswap.query.ValueMap;
import org.mindswap.exceptions.ExecutionException;
import org.mindswap.owl.OWLKnowledgeBase;
import org.mindswap.owls.grounding.AtomicGrounding;

public class Retry extends SHDiagnostic {
	
	public Retry(SHHandler successHandler) {
		super(successHandler);
	}
	
	public ValueMap execute(ObjectRequest objectRequest) {
		AtomicGrounding grounding = objectRequest.getGrounding();
		System.out.println("Retrying process: " + grounding.getProcess().getName());
		ValueMap values = objectRequest.getValues();
		ValueMap result = null;
		OWLKnowledgeBase kb = objectRequest.getKb();
		
		try {
			result = grounding.invoke(values, kb);
	    } catch(ExecutionException ee) {
	    	System.out.println("Retry failed!");
	    }
	    System.out.println("Successful Retry!");
	    return result;
	}

	public boolean canExecute(ObjectRequest objectRequest) {
		if (objectRequest.getKind() != KindFault.TYPE)
			return true;
		return false;
	}
}
