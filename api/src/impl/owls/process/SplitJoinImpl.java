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
 * Created on Apr 20, 2004
 *
 */
package impl.owls.process;

import java.util.List;

import org.mindswap.owl.OWLIndividual;
import org.mindswap.owls.process.ControlConstruct;
import org.mindswap.owls.process.ControlConstructBag;
import org.mindswap.owls.process.ProcessList;
import org.mindswap.owls.process.SplitJoin;
import org.mindswap.owls.vocabulary.OWLS;

/**
 * @author Evren Sirin
 *
 */
public class SplitJoinImpl extends ControlConstructImpl implements SplitJoin {
	public SplitJoinImpl(OWLIndividual ind) {
		super(ind);
	}

	public void addComponent(ControlConstruct component) {
	    ControlConstructBag components = getComponents();
	    if(components == null) {
	        components = getOntology().createControlConstructBag(component);
	        addProperty(OWLS.Process.components, components);
	    }
	    else
	        components.add(component);
	}
	
	public ControlConstructBag getComponents() {
	    return (ControlConstructBag) getPropertyAs(OWLS.Process.components, ControlConstructBag.class);
	}
	
	public List getConstructs() {
	    return getComponents().getAll();
	}
	
	public ProcessList getAllProcesses() {
		ProcessList list = new ProcessListImpl();
		ControlConstructBag components = getComponents();
		while(!components.isEmpty()) {
			ControlConstruct cc = (ControlConstruct) components.getFirst();
			list.addAll(cc.getAllProcesses());
			components = (ControlConstructBag) components.getRest();
		}
		
		return list;
	}
	
    public String getConstructName() {
        return "Split-Join";
    }
}
