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

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import owls.plugin.Activator;

/**
 * 
 * @author Vanessa Aline
 * @modifiedBy Fabricio Alves
 *
 */
public class CompositionNamespaceWizardPage extends WizardPage {
	
	private Text namespaceText;

	
	public CompositionNamespaceWizardPage() {
		super("CompositionNamespaceWizardPage");
		setTitle("OWL-S Composer");
		setDescription("Enter the composition namespace.");
		
		
	}
	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 3;
		layout.verticalSpacing = 9;
		
		Label label = new Label(container, SWT.NULL);
		label.setText("&Service Namespace:");

		namespaceText = new Text(container, SWT.BORDER | SWT.SINGLE);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		namespaceText.setLayoutData(gd);
//		diagramText.addModifyListener(new ModifyListener() {
//			public void modifyText(ModifyEvent e) {
//				dialogChanged();
//			}
//		});
		
//		Button button = new Button(container, SWT.PUSH);
//		button.setText("Browse...");
//		button.addSelectionListener(new SelectionAdapter() {
//			public void widgetSelected(SelectionEvent e) {
//				handleBrowse();
//			}
//		});

		initialize();
//		dialogChanged();
		setControl(container);


	}
	
	/**
	 * Tests if the current workbench selection is a suitable
	 * container to use.
	 */
	
	private void initialize() {
		if(Activator.getCurrentProject() != null){
			if ((Activator.getCurrentFilePath())!=null) {			
				String fileName = Activator.getCurrentFilePath().lastSegment().toString();			
				int dotLoc = fileName.lastIndexOf('.');
				if (dotLoc != -1) {
					namespaceText.setText("http://localhost:8080/"+Activator.getCurrentProject().getName()+
							"/owls/"+fileName.substring(0, dotLoc)+".owl");
				}
				return;
			}
			namespaceText.setText("http://localhost:8080/"+Activator.getCurrentProject().getName()+
							"/owls/");
		}
		else{
			namespaceText.setText("http://localhost:8080/");
		}
		
	}

	public Text getNamespaceText() {
		return namespaceText;
	}
	
	
}
