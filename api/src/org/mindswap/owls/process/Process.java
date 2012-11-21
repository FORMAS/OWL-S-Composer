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
package org.mindswap.owls.process;

import java.net.URI;

import org.mindswap.owl.OWLDataValueList;
import org.mindswap.owl.OWLIndividual;
import org.mindswap.owls.profile.Profile;
import org.mindswap.owls.service.Service;

/**
 * Represents the OWL-S process. It represents the super class for Atomic, Composite and Simple 
 * processes. Properties that all three process classes share are defined here. 
 *   
 * 
 * OWL-S concept: http://www.daml.org/services/owl-s/1.0/Process.owl#Process
 * 
 * @author Evren Sirin
 *
 */
public interface Process extends OWLIndividual, MultiConditional {
	/**
	 * Set the service this process belongs to. 
	 * 
	 * @param service
	 */
	public void setService(Service service);
	
	/**
	 * Get the service this process belongs to. Actually a process may be used in multiple service
	 * descriptions. Unfortunately, OWL-S 1.0 specification does not make a distinction between
	 * process definition and process occurence. This implementation treats each process object as
	 * a process occurence and returns the service object this process is used in.   
	 * 
	 * @return
	 */
	public Service getService();
	
	/**
	 * Get the profile for the service of this project. This is equivalent to getService().getProfile()
	 * 
	 * @return
	 */
	public Profile getProfile();
	
	public void addInput(Input input);
	
	public void addOutput(Output output);

	public void addLocal(Local local);
	
	public void addParameter(Parameter param);

	public void addResult(Result result);
	
	public void setResult(Result result);
			
	public ParameterList getLocals();
	
	/**
	 * Get the inputs of this process. An empty list is returned if there are no inputs.
	 * 
	 * @return
	 */
	public InputList getInputs();
	
	/**
	 * Return the first input or null if there is no input.
	 * 
	 * @return
	 */
	public Input getInput();
	
	public Input getInput(int i);
	
	public Input getInput(String localName);
	
	/**
	 * Get the outputs of this process. An empty list is returned if there are no outputs.
	 * 
	 * @return
	 */
	public OutputList getOutputs();
	
	/**
	 * Return the first output or null if there is no input.
	 * 
	 * @return
	 */
	public Output getOutput();
	
	public Output getOutput(int i);
	
	public Output getOutput(String localName);
	
	public Result getResult();
	
	public ResultList getResults();
	
	/**
	 * Get all the parameters of this process. This list includes inputs, outputs and local parameters.
	 * 
	 * @return
	 */
	public ParameterList getParameters();	
	

	/**
	 * Return the parameter (input or output) with the given URI. First check if input list 
	 * contains the parameter and then check the output list. A null value is returned if 
	 * the given URI does not exist in either list.
	 * 
	 * @param parameterURI
	 * @return
	 */
	public Parameter getParameter(URI parameterURI);
	
	/**
	 * Get the name defined for this process. See {@link org.mindswap.owl.OWLConfig#DEFAULT_LANGS OWLConfig}
	 * to learn how the language identifiers will be resolved when searching for a name. 
	 * 
	 * @return
	 */
	public String getName();
	
	/**
	 * Get the name defined for this process. The associated name should have the same 
	 * language identifier as given in the parameter. If a name for that language is not found 
	 * null value will be returned even if there is another name with a different language 
	 * identifier. 
	 * 
	 * @param lang
	 * @return
	 */
	public String getName(String lang);
	
	/**
	 * Return all process names written in any language.
	 * 
	 * @return
	 */
	public OWLDataValueList getNames();
}
