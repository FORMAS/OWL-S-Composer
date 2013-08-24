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

import org.eclipse.jface.dialogs.IDialogPage;
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
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import owls.plugin.Activator;

/**
 * @author Andre Fonseca
 *
 */
public class WSDL2OWLwizardPage extends WizardPage {

	private Text fileText;
	private Text namespaceText;

	/**
	 * Constructor for SampleNewWizardPage.
	 * @param pageName
	 */
	public WSDL2OWLwizardPage() {
		super("wizardPage");
		setTitle("OWL-S Composer");
		setDescription("This wizard creates a new owl-s file with *.owl extension from a wsdl file.");
	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 3;
		layout.verticalSpacing = 9;
		Label label = new Label(container, SWT.NULL);
		label.setText("&WSDL file:");

		fileText = new Text(container, SWT.BORDER | SWT.SINGLE);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		fileText.setLayoutData(gd);
		fileText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});

		Button button = new Button(container, SWT.PUSH);
		button.setText("Browse...");
		button.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleBrowse();
			}
		});
		label = new Label(container, SWT.NULL);
		label.setText("&Namespace:");

		namespaceText = new Text(container, SWT.BORDER | SWT.SINGLE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		namespaceText.setLayoutData(gd);
		namespaceText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
		initialize();
		dialogChanged();
		setControl(container);
	}
	
	/**
	 * Tests if the current workbench selection is a suitable
	 * container to use.
	 */
	
	private void initialize() {
		String projectName = "[YOUR PROJECT]";
		String serviceName = "[YOUR SERVICE]";
		
		if(Activator.getCurrentProject() != null){
			projectName = Activator.getCurrentProject().getName();
			
			if ((Activator.getCurrentFilePath())!=null) {					
				String fileName = Activator.getCurrentFilePath().lastSegment().toString();					
				int dotLoc = fileName.lastIndexOf('.');
				if (dotLoc != -1)
					serviceName = fileName.substring(0, dotLoc);
			}
		}
		
		fileText.setText("http://localhost:8080/"+projectName+"/services/"+serviceName+"?wsdl");
		namespaceText.setText("http://localhost:8080/"+projectName+ "/owls/"+serviceName+".owl");
	}
	
	/**
	 * Uses the standard container selection dialog to
	 * choose the new value for the container field.
	 */

	private void handleBrowse() {
		FileDialog fd = new FileDialog(getShell(), SWT.OPEN);
	    fd.setText("Open");
	    String[] filterExt = {"*.wsdl"};
	    fd.setFilterExtensions(filterExt);
	    String selected = fd.open();
		fileText.setText(selected);
	}
	
	/**
	 * Ensures that both text fields are set.
	 */

	private void dialogChanged() {
		String fileName = getFileText();
		String namespaceName = getNamespaceText();

		if ((fileName.length() == 0) && (namespaceText.isFocusControl())) {
			updateStatus("WSDL file must be specified");
			return;
		}
		if ((namespaceName.length() == 0) && !(namespaceText.isFocusControl() ||
				fileText.isFocusControl())){
			updateStatus("Namespace must be specified");
			return;
		}
		if (namespaceText.isFocusControl()) {
			int dotLoc = fileName.lastIndexOf('.');
			int questionLoc = fileName.indexOf("?wsdl");

			if (dotLoc != -1) {
				String ext = fileName.substring(dotLoc + 1);
				if (ext.equalsIgnoreCase("wsdl") == false) {
					updateStatus("File extension must be \"wsdl\"");
					return;
				} else {
					updateStatus(null);
					return;
				}
			} else if(questionLoc < 0) {
				updateStatus("File extension must be \"wsdl\"");
				return;
			}
		}
		updateStatus(null);
	}

	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}

	public String getNamespaceText() {
		return namespaceText.getText();
	}

	public String getFileText() {
		return fileText.getText();
	}

}