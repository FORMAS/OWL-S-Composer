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
package org.mindswap.owls.profile;

import org.mindswap.owl.OWLDataValueList;
import org.mindswap.owl.OWLIndividual;
import org.mindswap.owl.OWLIndividualList;
import org.mindswap.owl.OWLObjectProperty;
import org.mindswap.owls.process.Input;
import org.mindswap.owls.process.InputList;
import org.mindswap.owls.process.MultiConditional;
import org.mindswap.owls.process.Output;
import org.mindswap.owls.process.OutputList;
import org.mindswap.owls.process.Process;
import org.mindswap.owls.process.Result;
import org.mindswap.owls.process.ResultList;
import org.mindswap.owls.service.Service;

/**
 * Represents the OWL-S service.
 * 
 * OWL-S concept: http://www.daml.org/services/owl-s/1.0/Profile.owl#Profile
 *  
 * @author Evren Sirin
 *
 */
public interface Profile extends OWLIndividual, MultiConditional {	
	/**
	 * Get the service this profile presents
	 * 
	 * @return
	 */
	public Service getService();
	
	/**
	 * Set the service this profile presents
	 * 
	 * @param service
	 */
	public void setService(Service service);

	/**
	 * Get the process associated with this profile. This process is the one that is the 
	 * value of profile:has_process parameter
	 * 
	 * @return
	 */
	public Process getProcess();

	/**
	 * Set profile's text description. No language identifier will be used.
	 * 
	 * @param desc
	 */
	public void setTextDescription(String desc);
	
	/**
	 * Get profile's text description. See {@link org.mindswap.owl.OWLConfig#DEFAULT_LANGS OWLConfig}
	 * to learn how the language identifiers will be resolved when searching for a text description. 
	 * 
	 * @return
	 */
	public String getTextDescription();
	
	/**
	 * Get profile's text description. The associated textDescription should have the same language 
	 * identifier as given in the parameter. If a textDescription for that labguage is not found null
	 * value will be returned even if there is another textDescription with a different language 
	 * identifier. 
	 * 
	 * @param lang
	 * @return
	 */
	public String getTextDescription(String lang);
	
	/**
	 * Return all text descriptions written in any language.
	 * 
	 * @return
	 */
	public OWLDataValueList getTextDescriptions();
	
	/**
	 * Get the service name defined in the profile. See {@link org.mindswap.owl.OWLConfig#DEFAULT_LANGS OWLConfig}
	 * to learn how the language identifiers will be resolved when searching for a name. 
	 * 
	 * @return
	 */
	public String getServiceName();
	
	/**
	 * Get the service name defined in the profile. The associated serviceName should have the same 
	 * language identifier as given in the parameter. If a serviceName for that language is not found 
	 * null value will be returned even if there is another serviceName with a different language 
	 * identifier. 
	 * 
	 * @param lang
	 * @return
	 */
	public String getServiceName(String lang);
	
	/**
	 * Return all service names written in any language.
	 * 
	 * @return
	 */
	public OWLDataValueList getServiceNames();
	
	/**
	 * Set the service name. No language identifier will be used.
	 * 
	 * @param desc
	 */
	public void setServiceName(String desc);
	
	public void addInput(Input input);
	
	public void addOutput(Output output);
	
	public void addResult(Result result);
	
	public void setResult(Result result);	
	
	/**
	 * Get the inputs for this profile.
	 * 
	 * @return
	 */
	public InputList  getInputs();
	
	/**
	 * Get the outputs for this profile.
	 * 
	 * @return
	 */
	public OutputList getOutputs();
	
	/**
	 * Get the results for this profile.
	 * 
	 * @return
	 */
	public ResultList getResults();		
	
	/**
	 * Get the result for this profile. In case there are multiple results defined for this
	 * profile a random one is returned
	 * 
	 * @return
	 */
	public Result getResult();	
	
	/**
	 * getCategory
	 * 
	 * @return
	 */
	public ServiceCategory getCategory();
	
	/**
	 * getContactInfo
	 * 
	 * @return
	 */
	public Actor getContactInfo();
	
	public void setContactInfo(Actor actor);
	
	/**
	 * getServiceParameters
	 * 
	 * @return
	 */
	public OWLIndividualList getServiceParameters();
	
	/**
	 * getServiceParameter
	 * 
	 * @return
	 */
	public ServiceParameter getServiceParameter(OWLObjectProperty prop);	
	
	public ServiceParameter getServiceParameter(String name);
	
	public OWLIndividual getServiceParameterValue(OWLObjectProperty prop);
	
	public OWLIndividual getServiceParameterValue(String name);
	
	public void addServiceParameter(ServiceParameter serviceParam);	
	
	public void addServiceParameterValue(OWLObjectProperty prop, OWLIndividual value);
	
	public void addServiceParameterValue(String name, OWLIndividual value);
}
