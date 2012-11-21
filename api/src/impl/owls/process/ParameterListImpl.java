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


import impl.owl.CastingList;

import java.net.URI;

import org.mindswap.owl.OWLIndividualList;
import org.mindswap.owls.process.Parameter;
import org.mindswap.owls.process.ParameterList;

/**
 * @author Evren Sirin
 *
 */
public class ParameterListImpl extends CastingList implements ParameterList {
    public ParameterListImpl() {
        super(Parameter.class);
    }
    
    public ParameterListImpl(Class castTarget) {
        super(castTarget);
    }
    
    public ParameterListImpl(OWLIndividualList list) {
        super(list, Parameter.class);
    }
    
    public ParameterListImpl(OWLIndividualList list, Class castTarget) {
        super(list, castTarget);
    }    
    
	/* (non-Javadoc)
	 * @see org.mindswap.owls.process.ParameterList#parameterAt(int)
	 */
	public Parameter parameterAt(int index) {
		return (Parameter) get(index);
	}

	/* (non-Javadoc)
	 * @see org.mindswap.owls.process.ParameterList#getParameter(java.lang.String)
	 */
	public Parameter getParameter(URI parameterURI) {
		return (Parameter) getIndividual(parameterURI);
	}

	/* (non-Javadoc)
	 * @see org.mindswap.owls.process.ParameterList#getParameter(java.lang.String)
	 */
	public Parameter getParameter(String localName) {
		return (Parameter) getIndividual(localName);
	}
}
