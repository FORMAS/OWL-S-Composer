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
 * Created on Mar 19, 2004
 */
package examples;

import java.net.URI;

import org.mindswap.owl.OWLClass;
import org.mindswap.owl.OWLDataProperty;
import org.mindswap.owl.OWLDataValue;
import org.mindswap.owl.OWLFactory;
import org.mindswap.owl.OWLIndividual;
import org.mindswap.owl.OWLKnowledgeBase;
import org.mindswap.owl.OWLObjectProperty;
import org.mindswap.owls.OWLSFactory;
import org.mindswap.owls.process.AtomicProcess;
import org.mindswap.owls.process.Process;
import org.mindswap.owls.process.execution.ProcessExecutionEngine;
import org.mindswap.owls.process.execution.ProcessExecutionListener;
import org.mindswap.owls.profile.Profile;
import org.mindswap.owls.service.Service;
import org.mindswap.query.ValueMap;
import org.mindswap.utils.Utils;
import org.mindswap.wsdl.WSDLOperation;
import org.mindswap.wsdl.WSDLService;

/**
 * 
 * Examples to show how services can be executed. Some examples of simple execution monitoring is 
 * included. 
 * 
 * @author Evren Sirin
 */
public class RunService {
	Service service;
	Profile profile;
	Process process;
	WSDLService s;
	WSDLOperation op;
	String inValue;
	String outValue;
	ValueMap values;
	ProcessExecutionEngine exec;	
	
	public RunService() {
		// create an execution engine 
		exec = OWLSFactory.createExecutionEngine();
		
		// Attach a listener to the execution engine
		exec.addExecutionListener(new ProcessExecutionListener() {

			public void setCurrentExecuteService(Process p) {
				System.out.println("Start executing process " + p);
			}
			
			public void printMessage(String message) {
			}

			public void finishExecution(int retCode) {
				System.out.println("Finished execution " + 
				    ((retCode == ProcessExecutionListener.EXEC_ERROR)
				    ? "with errors" : "successfully"));		
			}			
		});	
	}
	
	public void runZipCode() throws Exception {
	    OWLKnowledgeBase kb = OWLFactory.createKB();

	    service = kb.readService("http://localhost:8080/Temperatura/owls/getNameCar_NameCar.owl");
		process = service.getProcess();		

		// initialize the input values to be empty
		values = new ValueMap();
		
		values.setDataValue(process.getInput("arg0"), "CARRO");			

		values = exec.execute(process, values);	
	
		// get the result
		OWLIndividual out = values.getIndividualValue(process.getOutput());
				
		// display the results
		System.out.println("Executed service '" + service + "'");
		System.out.println("Grounding WSDL: " + 
		    ((AtomicProcess) process).getGrounding().getDescriptionURL());
		System.out.println("City   = " + "College Park");
		System.out.println("State  = " + "MD");
		System.out.println("Output = ");
		System.out.println(Utils.formatRDF(out.toRDF()));
		System.out.println();
	}
	
	public void runBookFinder() throws Exception {
	    OWLKnowledgeBase kb = OWLFactory.createKB();

	    // read the service description
		service = kb.readService("http://www.mindswap.org/2004/owl-s/1.1/BookFinder.owl");
		process = service.getProcess();
		
		// initialize the input values to be empty
		values = new ValueMap();
		
		// use any book name
        inValue = "City of Glass";

		// get the parameter using the local name
		values.setDataValue(process.getInput("BookName"), inValue);		
		values = exec.execute(process, values);
		
		// get the output param using the index		
		OWLIndividual out = values.getIndividualValue(process.getOutput());
		
		// display the results
		System.out.println("Executing OWL-S service " + service);
		System.out.println("Grounding WSDL: " + 
		    service.getGrounding().getAtomicGrounding((AtomicProcess) process).getDescriptionURL());
		System.out.println("BookName = " + inValue);
		System.out.println("BookInfo = ");
		System.out.println(Utils.formatRDF(out.toRDF()));		
		System.out.println();
	}

	public void runBookPrice() throws Exception {
	    String currencyOnt = "http://www.daml.ecs.soton.ac.uk/ont/currency.owl#";
	    
	    OWLKnowledgeBase kb = OWLFactory.createKB();

		// read the service description
		service = kb.readService("http://www.mindswap.org/2004/owl-s/1.1/BookPrice.owl");
		process = service.getProcess();
		
		// initialize the input values to be empty
		values = new ValueMap();
		
		// use an arbitrary book name
		inValue = "City of Glass";
		// get the parameter using the local name
		values.setDataValue(process.getInput("BookName"), inValue);
		values.setValue(process.getInput("Currency"), 
		    kb.getIndividual(URI.create(currencyOnt + "EUR")));
		values = exec.execute(process, values);
		
		// get the output param using the index		
		OWLIndividual out = values.getIndividualValue(process.getOutput());
		
		// display the results
		System.out.println("Executed service " + service);
		System.out.println("Book Name = " + inValue);
		System.out.println("Price = ");
		System.out.println(Utils.formatRDF(out.toRDF()));		
		System.out.println();
	}
	
	public void runFindCheaperBook() throws Exception {
	    OWLKnowledgeBase kb = OWLFactory.createKB();
	    // we need a reasoner for example to work
		kb.setReasoner( "Pellet" );
		// we need to check preconditions so that local variables will be assigned values
		exec.setPreconditionCheck( true );

		// read the service description
		service = kb.readService("http://www.mindswap.org/2004/owl-s/1.1/FindCheaperBook.owl");
		process = service.getProcess();

		// initialize the input values to be empty
		values = new ValueMap();
		
		// use an arbitrary book name
		values.setDataValue(process.getInput("BookName"), "City of Glass");
		values = exec.execute(process, values);
			
		// get the output values
		OWLIndividual price = values.getIndividualValue(process.getOutput("BookPrice"));
		String bookstore = values.getStringValue(process.getOutput("Bookstore"));
		
		// display the results
		System.out.println("Executed service " + service);
		System.out.println("Bookstore = " + bookstore);
		System.out.println("Price = ");
		System.out.println(Utils.formatRDF(price.toRDF()));		
		System.out.println();
	}
	
	public void runCurrencyConverter() throws Exception {
	    String currencyOnt = "http://www.daml.ecs.soton.ac.uk/ont/currency.owl#";
	    String conceptsOnt = "http://www.mindswap.org/2004/owl-s/concepts.owl#";
	    
	    OWLKnowledgeBase kb = OWLFactory.createKB();
		// read the service description
		service = kb.readService("http://www.mindswap.org/2004/owl-s/1.1/CurrencyConverter.owl");
		process = service.getProcess();
		
		// initialize the input values to be empty
		values = new ValueMap();
		
		
		OWLIndividual EUR = kb.getIndividual(URI.create(currencyOnt + "EUR"));
		values.setValue(process.getInput("OutputCurrency"), EUR);
		
		OWLIndividual USD = kb.getIndividual(URI.create(currencyOnt + "USD"));
		
		OWLClass Price = kb.getClass(URI.create(conceptsOnt + "Price"));
		OWLObjectProperty currency = kb.getObjectProperty(URI.create(conceptsOnt + "currency"));
		OWLDataProperty amount = kb.getDataProperty(URI.create(conceptsOnt + "amount"));
		
		OWLIndividual inputPrice = kb.createInstance(Price);
		inputPrice.addProperty( currency, USD );
		inputPrice.addProperty( amount, "100" );

		// get the parameter using the local name
		values.setValue(process.getInput("InputPrice"), inputPrice);

		values = exec.execute(process, values);
		
		// get the output param using the index		
		OWLIndividual out = values.getIndividualValue(process.getOutput());
		
		// display the results
		System.out.println("Executed service " + service);
		System.out.println("Grounding WSDL: " + 
		    ((AtomicProcess) process).getGrounding().getDescriptionURL());
		System.out.println("Input  = ");
		System.out.println(Utils.formatRDF(inputPrice.toRDF()));
		System.out.println("Output = ");
		System.out.println(Utils.formatRDF(out.toRDF()));
		System.out.println();
	}
		
	public void runFrenchDictionary() throws Exception {
	    OWLKnowledgeBase kb = OWLFactory.createKB();
	    // we need a reasoner that can evaluate the precondition of the translator
	    kb.setReasoner("Pellet");

	    service = kb.readService("http://www.mindswap.org/2004/owl-s/1.1/FrenchDictionary.owl");
		process = service.getProcess();
		
		// initialize the input values to be empty
		values = new ValueMap();
		
		inValue = "mere";
		values.setDataValue(process.getInput("InputString"), inValue);
		values = exec.execute(process, values);	
		
		// get the output using local name
		outValue = values.getValue(process.getOutputs().getParameter("OutputString")).toString();
		
		// display the results
		System.out.println("Executed service " + service);
		System.out.println("Input  = " + inValue);		
		System.out.println("Output = " + outValue);
		System.out.println();		
	}

	public void runTranslator() throws Exception {
		// language ontology
		String langOnt = "http://www.daml.org/2003/09/factbook/languages#";
		
	    OWLKnowledgeBase kb = OWLFactory.createKB();
	    // we at least need RDFS reasoning to evaluate preconditions (to understand 
	    // that process:Parameter is subclass of swrl:Variable)
	    kb.setReasoner("RDFS");
	    
		service = kb.readService("http://www.mindswap.org/2004/owl-s/1.1/BabelFishTranslator.owl");
		process = service.getProcess();

		// get the references for these values
		OWLIndividual English = kb.getIndividual(URI.create(langOnt + "English"));
		OWLIndividual French = kb.getIndividual(URI.create(langOnt + "French"));

		// initialize the input values to be empty
		values = new ValueMap();
				
		values.setDataValue(process.getInput("InputString"), "Hello world!");		
		values.setValue(process.getInput("InputLanguage"), English);		
		values.setValue(process.getInput("OutputLanguage"), French);		
		values = exec.execute(process, values);	
		
		// get the output using local name
		outValue = values.getValue(process.getOutput()).toString();
		
		// display the results
		System.out.println("Executed service '" + service + "'");
		System.out.println("Grounding WSDL: " + 
		    ((AtomicProcess) process).getGrounding().getDescriptionURL());
		System.out.println("Output = " + outValue);
		System.out.println();
	}	
	
	public void runDictionary() throws Exception {
	    OWLKnowledgeBase kb = OWLFactory.createKB();
		service = kb.readService("http://www.mindswap.org/2004/owl-s/1.1/Dictionary.owl");
		process = service.getProcess();

		// initialize the input values to be empty
		values = new ValueMap();
		
		inValue = "hello";
		values.setDataValue(process.getInput("InputString"), inValue);		
		values = exec.execute(process, values);	
		
		// get the output
		OWLDataValue out = (OWLDataValue) values.getValue(process.getOutput());
		
		// display the results
		System.out.println("Executed service '" + service + "'");
		System.out.println("Grounding WSDL: " + 
		    ((AtomicProcess) process).getGrounding().getDescriptionURL());
		System.out.println("Input  = " + inValue);		
		System.out.println("Output = " + out.toString());
		System.out.println();
	}
	
	public static void main(String[] args) throws Exception {		
		RunService test = new RunService();
		
//		try {
//            test.runCurrencyConverter();
//        } catch(Exception e) {
//            e.printStackTrace();
//        }

		try {
			test.runZipCode();
        } catch(Exception e) {
            e.printStackTrace();
        }
//
//		try {
//			test.runTranslator();
//        } catch(Exception e) {
//            e.printStackTrace();
//        }
//
//		try {
//			test.runDictionary();
//        } catch(Exception e) {
//            e.printStackTrace();
//        }
//
//		try {
//			test.runBookFinder();
//        } catch(Exception e) {
//            e.printStackTrace();
//        }
//
//		try {
//			test.runFrenchDictionary();		
//        } catch(Exception e) {
//            e.printStackTrace();
//        }
//
//		try {
//			test.runBookPrice();
//        } catch(Exception e) {
//            e.printStackTrace();
//        }
//
//		try {
//			test.runFindCheaperBook();
//        } catch(Exception e) {
//            e.printStackTrace();
//        }
	}
}
