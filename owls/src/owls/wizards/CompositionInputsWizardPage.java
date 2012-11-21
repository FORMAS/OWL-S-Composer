/*******************************************************************************
 * Copyright (c) 2008 OWL-S Composer.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     André Fonseca - initial API and implementation
 *******************************************************************************/

package owls.wizards;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.Iterator;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.mindswap.owls.process.Input;
import org.mindswap.owls.process.InputList;
import org.mindswap.owls.service.Service;
import org.mindswap.query.ValueMap;

import owls.facade.OwlsKBFacade;

/**
 * 
 * @author Vanessa Aline
 *
 */
public class CompositionInputsWizardPage extends WizardPage {

	private org.mindswap.owls.process.Process aProcess;
	
	private ValueMap aInputValueMap;

	public CompositionInputsWizardPage() {		
		super("CompositionInputsWizardPage");
		setTitle("OWL-S Composer");
		setDescription("Enter input parameters.");
	}

	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 2;
		layout.verticalSpacing = 9;

		CompositionNamespaceWizardPage compositionNamespace = (CompositionNamespaceWizardPage) getPreviousPage();
		String serviceNamespace = compositionNamespace.getNamespaceText().getText();
		try {
			Service aService = OwlsKBFacade.getKb().readService(serviceNamespace);
			aProcess = aService.getProcess();
			InputList inputList = aProcess.getInputs();	
			aInputValueMap = new ValueMap();
			for (Iterator iterator = inputList.iterator(); iterator.hasNext();) {
				Input input = (Input) iterator.next();	
				Label label = new Label(container, SWT.NULL);
				label.setText(input.getLocalName()+": ");
				Text diagramText = new Text(container, SWT.BORDER | SWT.SINGLE);
				diagramText.setData("parameterName", input.getLocalName());
				GridData gd = new GridData(GridData.FILL_HORIZONTAL);
				diagramText.setLayoutData(gd);
				diagramText.addModifyListener(new ModifyListener() {
							public void modifyText(ModifyEvent e) {
								Text input = (Text)e.getSource();								
								dialogChanged((String)input.getData("parameterName"), input.getText());
							}
						
						});
			}
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		setControl(container);

	}

	private void dialogChanged(String parameterLabel, String parameter) {
		aInputValueMap.setDataValue(aProcess.getInput(parameterLabel), parameter);
		
//		Input input = aProcess.getInput(parameterLabel);
//		System.out.println("input: " + input);
//		
//		String paramTypeURI = input.getParamType().getURI().toString();
//		System.out.println("paramTypeURI: " + paramTypeURI);
//		
//		if (paramTypeURI.split("#")[0].equals("http://www.w3.org/2001/XMLSchema"))
//			aInputValueMap.setDataValue(input, parameter);
//		else 
//		{
//			OWLKnowledgeBase kb = OwlsKBFacade.getKb();
//			OWLClass inputType = kb.getClass(input.getParamType().getURI());
//			System.out.println("inputType: " + inputType);
//			
//			OWLIndividual inputIndividual =  kb.createInstance(inputType);
//			System.out.println("inputIndividual: " + inputIndividual);
//			
//			OWLDataProperty property = kb.getDataProperty(URI.create(""));
//			System.out.println("property: " + property);
//			
//			OWLDataProperty property = null;
//			System.out.println("tam getProperties: " + input.getProperties().size());
//			System.out.println("tam getIncomingProperties: " + input.getIncomingProperties().size());
//			for (int i = 0; i < input.getIncomingProperties().size(); i++) {
//				System.out.println("antes: " + input.getIncomingProperties().get(i));
//				property = (OWLDataProperty)input.getIncomingProperties().get(i);
//				System.out.println("property: " + property);
//				inputIndividual.addProperty(property, parameter);
//			}
//			
//			aInputValueMap.setValue(input, inputIndividual);
	}
	
	
	public org.mindswap.owls.process.Process getAProcess() {
		return aProcess;
	}

	public ValueMap getAInputValueMap() {
		return aInputValueMap;
	}

	

}
