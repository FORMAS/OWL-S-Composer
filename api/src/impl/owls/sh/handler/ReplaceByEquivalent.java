package impl.owls.sh.handler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import pf.main.MainFunctionalMatcher;
import pf.matcher.implementations.functional.SimilarityDegree;

import org.mindswap.exceptions.ExecutionException;
import org.mindswap.owl.OWLKnowledgeBase;
import org.mindswap.owls.process.AtomicProcess;
import org.mindswap.owls.process.Input;
import org.mindswap.owls.process.Output;
import org.mindswap.owls.service.Service;
import org.mindswap.query.ValueMap;
import impl.owls.sh.Degree;
import impl.owls.sh.ObjectRequest;
import impl.owls.sh.SHHandler;
import impl.owls.sh.SimilarService;

public class ReplaceByEquivalent extends SHDiagnostic {
	
	public ReplaceByEquivalent(SHHandler successHandler) {
		super(successHandler);
	}
	
	public ValueMap execute(ObjectRequest objectRequest) {
		System.out.println("ReplaceByEquivalent");
		ValueMap result = null;
		OWLKnowledgeBase kb = objectRequest.getKb();
		System.out.println("uri: " + objectRequest.getGrounding().getProcess().getURI());
		String newURI = getEquivalentURI(objectRequest.getGrounding().getProcess().getURI().toString(), objectRequest.getCB().getOwlsFolder(),null);
		
		try {
			Service aService = kb.readService(newURI);
			System.out.println("New service: " + aService.getLabel());
			AtomicProcess atomicProcess =(AtomicProcess)aService.getProcess();
			
			ValueMap values = objectRequest.getValues();
			ValueMap newValues = new ValueMap();
			
			for (Iterator iterator = atomicProcess.getInputs().iterator(); iterator.hasNext();) {
				Input input = (Input) iterator.next();
				Input lastInput = objectRequest.getGrounding().getProcess().getInput(input.getLocalName());
				newValues.setDataValue(input, values.getStringValue(lastInput));
			}
			
			try {
				ValueMap auxResult = atomicProcess.getGrounding().invoke(newValues, kb);
				
				result = new ValueMap();
				
				for (Iterator iterator = atomicProcess.getOutputs().iterator(); iterator.hasNext();) {
					System.out.println("Setou output");
					Output output = (Output) iterator.next();
					Output lastOuInput = objectRequest.getGrounding().getProcess().getOutput(output.getLocalName());
					result.setDataValue(lastOuInput, auxResult.getStringValue(output));
				}
		    } catch(ExecutionException ee) {
		    	ee.printStackTrace();
		    	System.out.println("ReplaceByEquivalent failed 2!");
//		    	return null;
		    }
		    
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("ReplaceByEquivalent failed 3!");
//			return null;
		}
		
		System.out.println("Successful ReplaceByEquivalent!");
		return result;
	}
	
	public boolean canExecute(ObjectRequest objectRequest) {
		return true;
	}
}
