package impl.owls.sh.handler;

import impl.owls.sh.ObjectRequest;
import impl.owls.sh.SHHandler;
import org.mindswap.owls.process.AtomicProcess;
import org.mindswap.query.ValueMap;

public class SkipOptionalService extends SHDiagnostic {
	
	public SkipOptionalService(SHHandler successHandler) {
		super(successHandler);
	}
	
	public ValueMap execute(ObjectRequest objectRequest) {
		return new ValueMap();
	}

	public boolean canExecute(ObjectRequest objectRequest) {
		AtomicProcess process = objectRequest.getGrounding().getProcess();
		
		if (process.getOutputs().size() == 0)
			return true;
		else if (process.getResult().getBindings().size() == 0)
			return true;
		
		return false;
	}

}
