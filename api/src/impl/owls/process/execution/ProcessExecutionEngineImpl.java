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
 * Created on Dec 29, 2003
 *
 */
package impl.owls.process.execution;

import impl.owls.sh.SHMonitor;
import impl.owls.sh.CloudKnowledgeBase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.swing.JOptionPane;

import org.mindswap.exceptions.ExecutionException;
import org.mindswap.exceptions.MultipleSatisfiedPreconditionException;
import org.mindswap.exceptions.NotImplementedException;
import org.mindswap.exceptions.UnsatisfiedPreconditionException;
import org.mindswap.owl.OWLIndividual;
import org.mindswap.owl.OWLIndividualList;
import org.mindswap.owl.OWLKnowledgeBase;
import org.mindswap.owl.OWLValue;
import org.mindswap.owl.list.RDFList;
import org.mindswap.owls.generic.list.OWLSObjList;
import org.mindswap.owls.grounding.AtomicGrounding;
import org.mindswap.owls.process.AnyOrder;
import org.mindswap.owls.process.AtomicProcess;
import org.mindswap.owls.process.Binding;
import org.mindswap.owls.process.BindingList;
import org.mindswap.owls.process.Choice;
import org.mindswap.owls.process.CompositeProcess;
import org.mindswap.owls.process.Condition;
import org.mindswap.owls.process.ControlConstruct;
import org.mindswap.owls.process.ControlConstructBag;
import org.mindswap.owls.process.ControlConstructList;
import org.mindswap.owls.process.ForEach;
import org.mindswap.owls.process.IfThenElse;
import org.mindswap.owls.process.Output;
import org.mindswap.owls.process.OutputBinding;
import org.mindswap.owls.process.OutputBindingList;
import org.mindswap.owls.process.Parameter;
import org.mindswap.owls.process.ParameterList;
import org.mindswap.owls.process.ParameterValue;
import org.mindswap.owls.process.Perform;
import org.mindswap.owls.process.Process;
import org.mindswap.owls.process.Produce;
import org.mindswap.owls.process.RepeatUntil;
import org.mindswap.owls.process.RepeatWhile;
import org.mindswap.owls.process.Result;
import org.mindswap.owls.process.Sequence;
import org.mindswap.owls.process.SimpleProcess;
import org.mindswap.owls.process.Split;
import org.mindswap.owls.process.SplitJoin;
import org.mindswap.owls.process.ValueData;
import org.mindswap.owls.process.ValueOf;
import org.mindswap.owls.process.execution.ProcessExecutionEngine;
import org.mindswap.owls.process.execution.ProcessExecutionListener;
import org.mindswap.owls.vocabulary.OWLS;
import org.mindswap.query.ABoxQuery;
import org.mindswap.query.ValueMap;
import org.mindswap.swrl.AtomList;
import org.mindswap.swrl.Variable;

/**
 * @author Evren Sirin
 *
 */
public class ProcessExecutionEngineImpl implements ProcessExecutionEngine {
	public static boolean DEBUG = true;

	protected List executionListeners = new ArrayList();

	protected OWLKnowledgeBase env;
	protected OWLKnowledgeBase kb;
	//Adicionado por Fabricio
	protected CloudKnowledgeBase shKb;
	protected boolean checkPreconditions;
	protected boolean allowMultipleSatisifedPreconditions;

	protected Map performResults;

	public ProcessExecutionEngineImpl() {
		checkPreconditions = true;
		allowMultipleSatisifedPreconditions = true;
	}

	public void setKB(OWLKnowledgeBase kb) {
		this.kb = kb;
	}

	public OWLKnowledgeBase getKB() {
		return kb;
	}

	public void setPreconditionCheck(boolean checkPreconditions) {
		this.checkPreconditions = checkPreconditions;
	}

	public boolean isPreconditionCheck() {
		return checkPreconditions;
	}

	public boolean isAllowMultipleSatisifedPreconditions() {
		return allowMultipleSatisifedPreconditions;
	}

	public void setAllowMultipleSatisifedPreconditions(boolean allowMultipleSatisifedPreconditions) {
		this.allowMultipleSatisifedPreconditions = allowMultipleSatisifedPreconditions;
	}

	protected void notifyListeners(String msg) {
		Iterator i = executionListeners.iterator();
		while(i.hasNext()) {
			ProcessExecutionListener l = (ProcessExecutionListener) i.next();
			l.printMessage(msg);
		}
	}

	protected void setCurrentExecuteService(Process p) {
		Iterator i = executionListeners.iterator();
		while (i.hasNext()) {
			ProcessExecutionListener l = (ProcessExecutionListener) i.next();
			l.setCurrentExecuteService(p);
		}
	}

	protected void finishExecution(int retCode) {
		Iterator i = executionListeners.iterator();
		while (i.hasNext())
		{
			ProcessExecutionListener l = (ProcessExecutionListener) i.next();
			l.finishExecution(retCode);
		}
	}

	public void addExecutionListener(ProcessExecutionListener listener) {
		executionListeners.add(listener);
	}

	protected void initEnv(OWLKnowledgeBase defaultKB) {
		if(kb != null)
			env = kb;
		else
			env = defaultKB;

		performResults = new HashMap();
	}

	public ValueMap execute(Process p) {
		return execute(p, new ValueMap());
	}
	
	///**********************************************///
	///**********************************************///
	/// execucao de composicao em nuvem				 ///
	public ValueMap execute(Process p, ValueMap values, CloudKnowledgeBase shKb) {
		initEnv(p.getKB());
		this.shKb = shKb;
		values = executeProcess(p, values);

		notifyListeners("[DONE]");
		finishExecution(ProcessExecutionListener.EXEC_DONE);

		return values;
	}

	public ValueMap execute(Process p, ValueMap values) {
		initEnv(p.getKB());

		values = executeProcess(p, values);

		notifyListeners("[DONE]");
		finishExecution(ProcessExecutionListener.EXEC_DONE);

		return values;
	}
	
	public ValueMap execute(Perform p) {
		initEnv(p.getKB());

		ValueMap values = executePerform(p);

		notifyListeners("[DONE]");
		finishExecution(ProcessExecutionListener.EXEC_DONE);

		return values;
	}

	protected ValueMap executeProcess(Process process, ValueMap values) {
		setCurrentExecuteService( process );
		System.out.println("executeProcess");
		if( checkPreconditions ) {
			checkPreconditions( process, values );
		}

		if(process instanceof AtomicProcess) {
			return executeAtomicProcess((AtomicProcess) process, values);
		}
		else if(process instanceof CompositeProcess) {
			return executeCompositeProcess((CompositeProcess) process, values);
		}
		else if(process instanceof SimpleProcess) {
			throw new NotImplementedException("Executing simple processes is not implemented!");
		}

		throw new ExecutionException("Unknown process type " + process);

	}

	protected ValueMap executeAtomicProcess(AtomicProcess process, ValueMap values) {
		if(DEBUG) System.out.println("Executing AtomicProcess " + process + "\nInputs:\n" + values.debugString());

		AtomicGrounding grounding = process.getGrounding();

		if(DEBUG) System.out.println("Invoking " + grounding.getDescriptionURL());

		ValueMap result = null;
		try {
			result = grounding.invoke(values, env);
			System.out.println("DEBUG: invoking grounding values");
		} catch(ExecutionException ee) {
			System.out.println("Error executing!");
			System.out.println("name process: " + grounding.getProcess().getName());

			JOptionPane.showConfirmDialog(null, "Fault!");

			result = SHMonitor.getInstance().handleHealing(grounding, env, shKb, values, ee.toString());
		}
		System.out.println("DEBUG: pass the result");
		if(DEBUG) System.out.println("Result:\n" + result.debugString() + "\n");

		// just for safety
		if( result == null )
			throw new ExecutionException("Execution of AtomicProcess " + process + " failed!");

		return result;
	}

	protected ValueMap executeCompositeProcess(CompositeProcess process, ValueMap values) {
		ValueMap prevParentPerform = (ValueMap) performResults.get(OWLS.Process.TheParentPerform);
		ValueMap prevThisPerform = (ValueMap) performResults.get(OWLS.Process.ThisPerform);

		performResults.put(OWLS.Process.TheParentPerform, values);
		performResults.put(OWLS.Process.ThisPerform, new ValueMap());
		System.out.println("executeCompositeProcess 1");
		executeConstruct(process.getComposedOf());
		System.out.println("executeCompositeProcess 2");
		Result result = process.getResult();
		if( result != null ) {
			OutputBindingList bindings = result.getBindings();
			for(int i = 0; i < bindings.size(); i++) {
				OutputBinding binding = bindings.outputBindingAt(i);
				Output output = binding.getOutput();
				OWLValue value = null;
				ParameterValue paramValue = binding.getValue();
				if(paramValue instanceof ValueOf) {
					ValueOf valueOf = (ValueOf) paramValue;
					Perform perform = valueOf.getPerform();
					Parameter param = valueOf.getParameter();
					ValueMap performResult = (ValueMap) performResults.get(perform);
					if(performResult == null)
						throw new ExecutionException( "Perform " + perform + " cannot be found!" );

					value = performResult.getValue(param);
				}
				else
					throw new NotImplementedException("Only ValueOf construct in Bindings is supported!");
				values.setValue(output, value);
			}
		}

		values.addMap( (ValueMap) performResults.get( OWLS.Process.ThisPerform ) );

		performResults.put(OWLS.Process.TheParentPerform, prevParentPerform);
		performResults.put(OWLS.Process.ThisPerform, prevThisPerform);

		return values;
	}

	protected ValueMap executePerform(Perform p) {
		Process process = p.getProcess();

		if(process == null)
			throw new ExecutionException("Perform " + p + " does not have a process");

		ValueMap values = new ValueMap();
		BindingList bindings = p.getBindings();
		for(int i = 0; i < bindings.size(); i++) {
			Binding binding = bindings.bindingAt(i);
			Parameter param = binding.getParameter();
			ParameterValue paramValue = binding.getValue();
			if(paramValue instanceof ValueData){
				values.setValue(param, ((ValueData) paramValue).getData());
			}
			else if(paramValue instanceof ValueOf) {
				ValueOf valueOf = (ValueOf) paramValue;

				Perform otherPerform = valueOf.getPerform();
				Parameter otherParam = valueOf.getParameter();
				
				ValueMap performResult = (ValueMap) performResults.get(otherPerform);
				if(performResult == null)
					throw new ExecutionException( "Perform " + otherPerform + " cannot be found!" );
				OWLValue value = performResult.getValue(otherParam);
				values.setValue(param, value);
			}
		}
		System.out.println("executePerform 1");
		values = executeProcess(process, values);
		System.out.println("executePerform 2");
		performResults.put(p, values);
		System.out.println("executePerform 3");
		return values;
	}

	protected void executeProduce(Produce produce) {
		ValueMap values = (ValueMap) performResults.get( OWLS.Process.ThisPerform );

		OutputBinding binding = produce.getBinding();
		Output output = binding.getOutput();

		ParameterValue paramValue = binding.getValue();
		if(paramValue instanceof ValueData)
			values.setValue(output, ((ValueData) paramValue).getData());
		else if(paramValue instanceof ValueOf) {
			ValueOf valueOf = (ValueOf) paramValue;

			Perform otherPerform = valueOf.getPerform();
			Parameter otherParam = valueOf.getParameter();

			ValueMap performResult = (ValueMap) performResults.get(otherPerform);
			if(performResult == null)
				throw new ExecutionException( "Perform " + otherPerform + " cannot be found!" );
			values.setValue(output, performResult.getValue(otherParam));
		}
	}

	protected void executeConstruct(ControlConstruct cc) {
		System.out.println("executeConstruct: " + cc);
		if(cc instanceof Perform) {
			System.out.println("entrou aqui!!");
			System.out.println("Class"+cc.getClass().toString());
			Perform perform = (Perform) cc;
			System.out.println("Fez o Cast");
			executePerform(perform);
		} else if(cc instanceof Sequence) {
			executeSequence((Sequence) cc); System.out.println("Sequence");
		} else if(cc instanceof AnyOrder) {
			executeAnyOrder((AnyOrder) cc); System.out.println("AnyOrder");
		} else if(cc instanceof Choice) {
			executeChoice((Choice) cc); System.out.println("Choice");
		} else if(cc instanceof IfThenElse) {
			executeIfThenElse((IfThenElse) cc); System.out.println("IfThenElse");
		} else if(cc instanceof RepeatWhile) {
			executeRepeatWhile((RepeatWhile) cc); System.out.println("RepeatWhile");
		} else if(cc instanceof RepeatUntil) {
			executeRepeatUntil((RepeatUntil) cc); System.out.println("RepeatUntil"); 
		} else if(cc instanceof Split) {
			executeParallel(((Split)cc).getComponents(), false); System.out.println("Split");
		} else if(cc instanceof SplitJoin) {
			executeParallel(((SplitJoin)cc).getComponents(), true); System.out.println("SplitJoin");
		} else if(cc instanceof Produce) {
			executeProduce((Produce)cc); System.out.println("Produce");
		} else if(cc instanceof ForEach) {
			executeForEach((ForEach)cc); System.out.println("ForEach");
		} else
			throw new NotImplementedException(
					"Executing control construct " + cc.getConstructName() + " is not implemented");
		System.out.println("saiu executeConstruct");
	}

	protected void executeSequence(Sequence cc) {
		ControlConstructList ccList = cc.getComponents();
		System.out.println("isSequence!");
		for(int i = 0; i < ccList.size(); i++) {
			System.out.println("ccList.constructAt("+i+"): " + ccList.constructAt(i));
			ControlConstruct component = ccList.constructAt(i);
			System.out.println("component: " + component);
			executeConstruct(component);
			System.out.println("------------------");
		}
		System.out.println("saiu for");
	}

	protected void executeAnyOrder(AnyOrder cc) {
		ControlConstructBag ccList = cc.getComponents();
		System.out.println("isAnyOrder!");
		// AnyOrder says it doesn't matter in which order subelements
		// are executed so let's try the sequential order
		// FIXME check preconditions to find a correct ordering
		OWLIndividualList list = ccList.getAll();
		for(int i = 0; i < list.size(); i++) {
			ControlConstruct component = (ControlConstruct) list.individualAt(i);
			System.out.println("component: " + component);
			executeConstruct(component);
		}
	}

	protected void executeChoice(Choice choice) {
		ControlConstructBag ccList = choice.getComponents();

		// Choose a random component to execute
		// FIXME check preconditions to find an executable component
		int size = ccList.size();
		int index = new Random().nextInt(size);

		ControlConstruct component = ccList.constructAt(index);

		executeConstruct(component);
	}

	protected void executeIfThenElse(IfThenElse ifThenElse) {
		Condition ifCondition = ifThenElse.getCondition();
		ControlConstruct thenCC = ifThenElse.getThen();
		ControlConstruct elseCC = ifThenElse.getElse();

		if( isTrue( ifCondition ))
			executeConstruct(thenCC);
		else if(elseCC != null)
			executeConstruct(elseCC);
	}

	protected void executeRepeatWhile(RepeatWhile cc) {
		Condition whileCondition = cc.getCondition();
		ControlConstruct loopBody = cc.getComponent();

		while( isTrue( whileCondition ) )
			executeConstruct(loopBody);
	}

	protected void executeRepeatUntil(RepeatUntil cc) {
		Condition whileCondition = cc.getCondition();
		ControlConstruct loopBody = cc.getComponent();

		do {
			executeConstruct(loopBody);
		}
		while( isTrue( whileCondition ) );
	}

	protected void executeForEach(ForEach cc) {
		ValueMap parentValues = (ValueMap) performResults.get(OWLS.Process.TheParentPerform);

		ControlConstruct loopBody = cc.getComponent();
		Variable loopVar = cc.getLoopVar();
		ValueOf valueOf = cc.getListValue();

		Perform otherPerform = valueOf.getPerform();
		Parameter otherParam = valueOf.getParameter();

		ValueMap performResult = (ValueMap) performResults.get(otherPerform);
		if(performResult == null)
			throw new ExecutionException( "Perform " + otherPerform + " cannot be found!" );

		OWLIndividual ind = performResult.getIndividualValue(otherParam);
		RDFList list = (RDFList) ind.castTo(OWLSObjList.class);

		for( ; !list.isEmpty(); list = list.getRest() ) {
			OWLIndividual value = list.getFirst();
			parentValues.setValue(loopVar, value);

			executeConstruct(loopBody);
		}
	}

	protected void checkPreconditions( Process process, ValueMap values ) {
		ParameterList locals = process.getLocals();

		for( Iterator i = process.getConditions().iterator(); i.hasNext(); ) {
			// Get the precondition
			Condition cond = (Condition) i.next();

			if(DEBUG) System.out.println("Values="+values);

			// Get the conjunction of atoms and apply the current value bindings
			AtomList atoms = cond.getBody();

			if(DEBUG) System.out.println("Atoms = " + atoms);

			atoms = atoms.apply( values );

			if(DEBUG) System.out.println("Atoms = " + atoms);

			// Turn this into
			ABoxQuery query = atoms.toQuery( locals );

			if(DEBUG) System.out.println("Query = " + query);

			List results = env.query( query );

			if(DEBUG) System.out.println("Query Results = " + results);

			if( results.isEmpty() )
				throw new UnsatisfiedPreconditionException( process, cond );
			else if( results.size() > 1 && !allowMultipleSatisifedPreconditions )
				throw new MultipleSatisfiedPreconditionException( process, cond );

			ValueMap result = (ValueMap) results.get( 0 );

			values.addMap( result );
		}

	}

	protected boolean isTrue( Condition condition ) {
		ValueMap binding = (ValueMap) performResults.get(OWLS.Process.TheParentPerform);
		return condition.isTrue( env, binding );
	}

	protected boolean isTrue( Condition condition, ValueMap binding ) {
		return condition.isTrue( env, binding );
	}

	class ProcessExecutionThread extends Thread {
		ControlConstruct cc;

		ProcessExecutionThread(ControlConstruct cc) {
			this.cc  = cc;
		}

		public void run() {
			executeConstruct(cc);
		}
	}

	protected void executeParallel(ControlConstructBag ccList, boolean join) {
		ProcessExecutionThread[] threads = new ProcessExecutionThread[ccList.size()];

		for(int i = 0; i < ccList.size(); i++) {
			ControlConstruct construct = ccList.constructAt(i);

			threads[i] = new ProcessExecutionThread(construct);

			if(DEBUG) System.out.println("Starting " + construct + "...");

			threads[i].start();
		}

		if(join) {
			for(int i = 0; i < threads.length; i++) {
				try {
					if(DEBUG) System.out.println("Waiting " + threads[i].cc + " to finish...");
					threads[i].join();
					if(DEBUG) System.out.println(threads[i].cc + " finished");
				} catch (InterruptedException e) {
					notifyListeners("[ERROR]\n");
					notifyListeners("Execution Stopped\n");
					finishExecution(ProcessExecutionListener.EXEC_ERROR); // done
					throw new ExecutionException();
				}
			}
		}
	}
}
