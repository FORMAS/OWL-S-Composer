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



import impl.owls.generic.list.OWLSObjListImpl;

import org.mindswap.owl.OWLIndividual;
import org.mindswap.owl.OWLValue;
import org.mindswap.owl.list.RDFList;
import org.mindswap.owls.process.ControlConstruct;
import org.mindswap.owls.process.ControlConstructList;
import org.mindswap.owls.vocabulary.OWLS;

/**
 * @author Evren Sirin
 *
 */
public class ControlConstructListImpl extends OWLSObjListImpl implements ControlConstructList {
    public ControlConstructListImpl(OWLIndividual ind) {
        super(ind);
        
        setVocabulary(OWLS.CCList);
    }
        
    public RDFList insert(OWLIndividual item) {
        ControlConstructListImpl list = new ControlConstructListImpl( getOntology().createInstance( vocabulary.List() ) );
        list.setFirst( item );
        list.setRest( this );
                
        return list;        
    }
    
    public OWLValue getFirstValue() {
        return (ControlConstruct) getProperty(vocabulary.first()).castTo(ControlConstruct.class);
    }
    
    public RDFList getRest() {
        return (ControlConstructList) getProperty(vocabulary.rest()).castTo(ControlConstructList.class);
    }
    
	public ControlConstruct constructAt(int index) {
		return (ControlConstruct) get(index);
	}
}
