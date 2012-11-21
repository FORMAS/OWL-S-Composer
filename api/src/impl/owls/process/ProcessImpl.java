// The MIT License
//
// Copyright (c) 2004 Evren Sirin
//
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to
// deal in the Software without restriction, including without limitation the
// rights to use, copy, modify, merge, publish, distribute, sublicense, and/or
// sell copies of the Software, and to permit persons to whom the Software is
// furnished to do so, subject to the following conditions:
//
// The above copyright notice and this permission notice shall be included in
// all copies or substantial portions of the Software.
//
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
// FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS
// IN THE SOFTWARE.

/*
 * Created on Dec 27, 2003
 *
 */
package impl.owls.process;

import impl.owl.WrappedIndividual;

import java.net.URI;

import org.mindswap.owl.OWLDataValueList;
import org.mindswap.owl.OWLIndividual;
import org.mindswap.owls.OWLSFactory;
import org.mindswap.owls.process.Condition;
import org.mindswap.owls.process.ConditionList;
import org.mindswap.owls.process.Input;
import org.mindswap.owls.process.InputList;
import org.mindswap.owls.process.Local;
import org.mindswap.owls.process.Output;
import org.mindswap.owls.process.OutputList;
import org.mindswap.owls.process.Parameter;
import org.mindswap.owls.process.ParameterList;
import org.mindswap.owls.process.Process;
import org.mindswap.owls.process.Result;
import org.mindswap.owls.process.ResultList;
import org.mindswap.owls.profile.Profile;
import org.mindswap.owls.service.Service;
import org.mindswap.owls.vocabulary.OWLS;

/**
 * @author Evren Sirin
 *
 */
public abstract class ProcessImpl extends WrappedIndividual implements Process {
	public ProcessImpl(OWLIndividual ind) {
		super(ind);	
	}

	/* (non-Javadoc)
	 * @see org.mindswap.owls.process.Process#getService()
	 */
	public Service getService() {
	    return (Service) getPropertyAs(OWLS.Service.describes, Service.class);
	}
	
	public void setService(Service service) {
		if(hasProperty(OWLS.Service.describes, service))
		    return;
		
		setProperty(OWLS.Service.describes, service);
		service.setProcess(this);
	}

	/* (non-Javadoc)
	 * @see org.mindswap.owls.process.Process#getProfile()
	 */
	public Profile getProfile() {
		return getService().getProfile();
	}
		
	public void addInput(Input input) {
	    addProperty(OWLS.Process.hasInput, input);
	}
	
	public void addOutput(Output output) {
	    addProperty(OWLS.Process.hasOutput, output);
	}

	public void addLocal(Local local) {
	    addProperty(OWLS.Process.hasLocal, local);
	}
	
	public void addParameter(Parameter param) {
	    if(param instanceof Input)
	        addInput((Input) param);
	    else if(param instanceof Output)
	        addOutput((Output) param);
	    else if(param instanceof Local)
	        addLocal((Local) param);
	    else
	        addProperty(OWLS.Process.hasParameter, param);
	}

	public void addResult(Result result) {
	    addProperty(OWLS.Process.hasResult, result);
	}

	public void setResult(Result result) {
	    setProperty(OWLS.Process.hasResult, result);
	}

	/* (non-Javadoc)
	 * @see org.mindswap.owls.process.Process#getInputs()
	 */
	public InputList getInputs() {
	    return OWLSFactory.createInputList(getProperties(OWLS.Process.hasInput));
	}

	public Input getInput() {
	    InputList inputs = getInputs();	    
	    return inputs.isEmpty() ? null : inputs.inputAt(0);
	}
	
	public Input getInput(int i) {
	    InputList inputs = getInputs();	    
	    return inputs.inputAt(i);
	}
	
	public Input getInput(String localName) {
	    InputList inputs = getInputs();	    
	    return (Input) inputs.getParameter(localName);	    
	}
	
	public OutputList getOutputs() {
	    return OWLSFactory.createOutputList(getProperties(OWLS.Process.hasOutput));
	}
	
	public Output getOutput() {
	    OutputList outputs = getOutputs();	    
	    return outputs.isEmpty() ? null : outputs.outputAt(0);
	}

	public Output getOutput(int i) {
	    OutputList outputs = getOutputs();	    
	    return outputs.outputAt(i);
	}
	
	public Output getOutput(String localName) {
	    OutputList outputs = getOutputs();	    
	    return (Output) outputs.getParameter(localName);	    
	}
	
	public ParameterList getLocals() {
	    return OWLSFactory.createParameterList(getProperties(OWLS.Process.hasLocal));
	}
	
	public ParameterList getParameters() {
		ParameterList parameters = OWLSFactory.createParameterList(getInputs());
		parameters.addAll(getOutputs());
		parameters.addAll(getLocals());
		
		return parameters;
	}

	/* (non-Javadoc)
	 * @see org.mindswap.owls.process.Process#getParameter(java.net.URI)
	 */
	public Parameter getParameter(URI parameterURI) {
		return getParameters().getParameter(parameterURI);
	}
	
    /* (non-Javadoc)
     * @see org.mindswap.owls.process.Conditional#getCondition()
     */
    public Condition getCondition() {
        return (Condition) getPropertyAs(OWLS.Process.hasPrecondition, Condition.class);
    }
    
    public ConditionList getConditions() {
        return OWLSFactory.createConditionList(getProperties(OWLS.Process.hasPrecondition));
    }
        	
	public void setCondition(Condition condition) {
	    setProperty(OWLS.Process.hasPrecondition, condition);
	}
		
	public void addCondition(Condition condition) {
	    addProperty(OWLS.Process.hasPrecondition, condition);
	}
    
	public ResultList getResults() {
	    return OWLSFactory.createResultList(getProperties(OWLS.Process.hasResult));
	}

	public Result getResult() {
	    return (Result) getPropertyAs(OWLS.Process.hasResult, Result.class);
	}

	
    public String getName() {
        return getPropertyAsString(OWLS.Process.name);
    }
    
    public String getName(String lang) {
        return getPropertyAsString(OWLS.Process.name, lang);
    }
    
    public OWLDataValueList getNames() {
        return getProperties(OWLS.Process.name);
    }
	
	public String debugString() {
	    InputList inputs = getInputs();
	    OutputList outputs = getOutputs();
		String str = getLabel() + "  " + getURI() + "\n";
		for(int i = 0; i < inputs.size(); i++)
			str += inputs.inputAt(i).debugString() + "\n";
		for(int i = 0; i < outputs.size(); i++)
			str += outputs.outputAt(i).debugString() + "\n";
		
		return str;
	}
}
