package impl.owls.sh.handler;

import java.util.Iterator;

import org.mindswap.exceptions.ExecutionException;
import org.mindswap.owl.OWLKnowledgeBase;
import org.mindswap.owls.grounding.AtomicGrounding;
import org.mindswap.owls.process.AtomicProcess;
import org.mindswap.owls.process.Input;
import org.mindswap.owls.process.Output;
import org.mindswap.owls.process.Process;
import org.mindswap.owls.service.Service;
import org.mindswap.query.ValueMap;

import impl.owls.sh.Degree;
import impl.owls.sh.ObjectRequest;
import impl.owls.sh.SHHandler;

public class ReplaceByEqualInCloud extends SHDiagnostic {

	public ReplaceByEqualInCloud(SHHandler successHandler) {
		super(successHandler);
	}

	public ValueMap execute(ObjectRequest objectRequest) {
		String cloudFolder = objectRequest.getCB().getCloudFolder();
		if (cloudFolder != "") {
			ValueMap result = null;
			OWLKnowledgeBase kb = objectRequest.getKb();
			System.out.println("uri: "
					+ objectRequest.getGrounding().getProcess().getURI());
			// String newURI =
			// objectRequest.getGrounding().getProcess().getURI().toString().replace("8080",
			// "8100");
			String newURI = getEquivalentURI(objectRequest.getGrounding()
					.getProcess().getURI().toString(), cloudFolder,
					Degree.EXACT);
			try {
				Service aService = kb.readService(newURI);
				System.out.println("New service: " + aService.getLabel());
				AtomicProcess atomicProcess = (AtomicProcess) aService
						.getProcess();

				ValueMap values = objectRequest.getValues();
				ValueMap newValues = new ValueMap();

				for (Iterator iterator = atomicProcess.getInputs().iterator(); iterator
						.hasNext();) {
					Input input = (Input) iterator.next();
					Input lastInput = objectRequest.getGrounding().getProcess()
							.getInput(input.getLocalName());
					newValues.setDataValue(input, values
							.getStringValue(lastInput));
				}

				try {
					ValueMap auxResult = atomicProcess.getGrounding().invoke(
							newValues, kb);

					result = new ValueMap();

					for (Iterator iterator = atomicProcess.getOutputs()
							.iterator(); iterator.hasNext();) {
						System.out.println("Setou output");
						Output output = (Output) iterator.next();
						Output lastOuInput = objectRequest.getGrounding()
								.getProcess().getOutput(output.getLocalName());
						result.setDataValue(lastOuInput, auxResult
								.getStringValue(output));
					}
				} catch (ExecutionException ee) {
					ee.printStackTrace();
					System.out.println("ReplaceByEqual failed 2!");
					// return null;
				}

			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("ReplaceByEqual failed 3!");
				// return null;
			}

			System.out.println("Successful ReplaceByEqual!");
			return result;
		}
		return null;
	}

	public boolean canExecute(ObjectRequest objectRequest) {
		if (objectRequest.getKind() != KindFault.TYPE)
			return true;
		return false;
	}
}
