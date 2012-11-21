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

import org.mindswap.owl.OWLDataValue;
import org.mindswap.owl.OWLIndividual;
import org.mindswap.owls.process.Input;
import org.mindswap.owls.process.Process;
import org.mindswap.owls.vocabulary.FLAServiceOnt;
import org.mindswap.owls.vocabulary.OWLS;

/**
 * @author Evren Sirin
 *
 */
public class InputImpl extends ParameterImpl implements Input {

	/**
	 * @param resource
	 */
	public InputImpl(OWLIndividual ind) {
		super(ind);
	}
	
	public Process getProcess() {
	    OWLIndividual ind = getIncomingProperty(OWLS.Process.hasInput);
		return (ind == null) ? null : (Process) ind.castTo(Process.class);
	}

	
	public boolean transformInputType ()
	{
	    OWLDataValue dv = this.getProperty(FLAServiceOnt.transformInputType);
	    if (dv != null && dv.getLexicalValue().trim().toLowerCase().equals("false"))
	        return false;
	    
	    return true;
	}

}
