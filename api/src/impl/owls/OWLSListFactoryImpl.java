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
 * Created on Dec 28, 2003
 *
 */
package impl.owls;

import impl.owl.CastingList;
import impl.owls.grounding.AtomicGroundingListImpl;
import impl.owls.grounding.MessageMapListImpl;
import impl.owls.process.BindingListImpl;
import impl.owls.process.ConditionListImpl;
import impl.owls.process.InputBindingListImpl;
import impl.owls.process.InputListImpl;
import impl.owls.process.OutputBindingListImpl;
import impl.owls.process.OutputListImpl;
import impl.owls.process.ParameterListImpl;
import impl.owls.process.ProcessListImpl;
import impl.owls.process.ResultListImpl;

import org.mindswap.owl.OWLIndividualList;
import org.mindswap.owls.OWLSListFactory;
import org.mindswap.owls.grounding.AtomicGroundingList;
import org.mindswap.owls.grounding.MessageMapList;
import org.mindswap.owls.process.BindingList;
import org.mindswap.owls.process.ConditionList;
import org.mindswap.owls.process.InputBindingList;
import org.mindswap.owls.process.InputList;
import org.mindswap.owls.process.OutputBindingList;
import org.mindswap.owls.process.OutputList;
import org.mindswap.owls.process.ParameterList;
import org.mindswap.owls.process.ProcessList;
import org.mindswap.owls.process.ResultList;

/**
 * @author Evren Sirin
 *
 */
public class OWLSListFactoryImpl implements OWLSListFactory.Interface {
    public AtomicGroundingList createAtomicGroundingList() {
        return new AtomicGroundingListImpl();
    } 

    public AtomicGroundingList createAtomicGroundingList(OWLIndividualList list) {
        return new AtomicGroundingListImpl(list);
    } 

    public BindingList createBindingList() {
        return new BindingListImpl();
    }

    public BindingList createBindingList(OWLIndividualList list) {
        return new BindingListImpl(list);
    }
    
    public ConditionList createConditionList() {
        return new ConditionListImpl();
    }

    public ConditionList createConditionList(OWLIndividualList list) {
        return new ConditionListImpl(list);
    }

    public InputList createInputList() {
        return new InputListImpl();
    }

    public InputList createInputList(OWLIndividualList list) {
        return new InputListImpl(list);
    }
    
    public MessageMapList createMessageMapList() {
        return new MessageMapListImpl();
    }

    public MessageMapList createMessageMapList(OWLIndividualList list) {
        return new MessageMapListImpl(list);
    }

    public OutputList createOutputList() {
        return new OutputListImpl();
    }

    public OutputList createOutputList(OWLIndividualList list) {
        return new OutputListImpl(list);
    }

    public ParameterList createParameterList() { 
        return new ParameterListImpl();	
    }

    public ParameterList createParameterList(OWLIndividualList list) { 
        return new ParameterListImpl(list);	
    }

    public ResultList createResultList() {
        return new ResultListImpl();
    }

    public ResultList createResultList(OWLIndividualList list) {
        return new ResultListImpl(list);
    }

    public InputBindingList createInputBindingList() {
        return new InputBindingListImpl();
    }

    public InputBindingList createInputBindingList(OWLIndividualList list) {
        return new InputBindingListImpl(list);
    }

    public OutputBindingList createOutputBindingList() {
        return new OutputBindingListImpl();
    }

    public OutputBindingList createOutputBindingList(OWLIndividualList list) {
        return new OutputBindingListImpl(list);
    }

    public ProcessList createProcessList() {
        return new ProcessListImpl();
    }

    public ProcessList createProcessList(OWLIndividualList list) {
        return new ProcessListImpl(list);
    } 
    
    public OWLIndividualList wrapList(OWLIndividualList list, Class castTarget) {
        return new CastingList(list, castTarget);
    }
}
